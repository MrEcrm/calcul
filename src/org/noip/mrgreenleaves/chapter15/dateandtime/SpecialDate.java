package org.noip.mrgreenleaves.chapter15.dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class SpecialDate {

    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        LocalDate javaBirthday = LocalDate.of(1995,5,23);

        Period liveTime = Period.between(javaBirthday,today);
        System.out.println("Java wurde veröffentlicht vor: " +
                liveTime.getYears() + " Jahren, "+
                liveTime.getMonths() + " Monaten und " +
                liveTime.getDays() + " Tagen.");

        System.out.println();

        LocalDate testMonat =LocalDate.of(2010, Month.JANUARY,23);
        System.out.println(testMonat);

        System.out.println();
        LocalDate testEpoch = LocalDate.ofEpochDay(365);
        System.out.println(testEpoch);

        LocalDate test2 = LocalDate.ofYearDay(2020,300);
        System.out.println(test2);
        System.out.println(test2.getMonth());
        System.out.println(test2.getMonthValue());
        System.out.println(test2.getDayOfMonth());
        System.out.println(test2.getDayOfWeek());
        System.out.println(test2.getDayOfYear());
        System.out.println(test2.getYear());

    }
}
