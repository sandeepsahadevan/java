package com.java.javacertification.chp_3_java_api;

import java.time.*;
import java.time.format.*;

public class DateTimeFormat {

    public void datetimeformat(){
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);

        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20

        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateTime =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDateTime));
        //System.out.println(date.format(shortDateTime));
        //System.out.println(time.format(shortDateTime));

        DateTimeFormatter shortDate =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDate));
        System.out.println(date.format(shortDate));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f));

    }

    public static void main(String... args){
        DateTimeFormat dtf = new DateTimeFormat();
        dtf.datetimeformat();
    }
}
