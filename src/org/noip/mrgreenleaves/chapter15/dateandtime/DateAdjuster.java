package org.noip.mrgreenleaves.chapter15.dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

public class DateAdjuster {
    public static void main(String[] args)
    {
        LocalDate firstMonday = LocalDate.of(2017, 9,12);

        System.out.println(firstMonday);
        firstMonday=firstMonday.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(firstMonday);

    }
}
