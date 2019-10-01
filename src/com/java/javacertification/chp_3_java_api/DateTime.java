package com.java.javacertification.chp_3_java_api;

import java.time.*;

public class DateTime {

    public void localtime(){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        System.out.println(date1.toString());
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date2.toString());

        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        System.out.println(time1.toString());
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        System.out.println(time2.toString());
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
        System.out.println(time3.toString());

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        System.out.println(dateTime1.toString());
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime2.toString());
    }

    public static void main(String... args){
        DateTime dt = new DateTime();
        dt.localtime();
    }
}
