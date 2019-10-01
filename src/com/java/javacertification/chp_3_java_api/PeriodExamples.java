package com.java.javacertification.chp_3_java_api;

import java.time.*;

public class PeriodExamples {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // create a period
        performAnimalEnrichment(start, end, period);
        periodMethod();
    }
    private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) { // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }}

        public static void periodMethod(){
            LocalDate startDate = LocalDate.of(2015, Month.JANUARY, 1);
            Period annually = Period.ofYears(1); // every 1 year
            System.out.println("NEw start Date" + startDate.plus(annually));
            Period quarterly = Period.ofMonths(3); // every 3 months
            System.out.println("NEw start Date" + startDate.plus(quarterly));
            Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
            Period everyOtherDay = Period.ofDays(2); // every 2 days
            Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
            System.out.println("NEw start Date" + startDate.plus(everyYearAndAWeek));

            Period wrong = Period.ofYears(1).ofWeeks(1);
            System.out.println("NEw Wrong Date" + startDate.plus(wrong));
        }
}
