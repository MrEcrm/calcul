package org.noip.mrgreenleaves.chapter12.uebung02;

import org.noip.mrgreenleaves.chapter12.uebung.Weekday;

public enum     Weekdays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static void printAllDays()
    {
        for(Weekdays d: Weekdays.values())
            System.out.println(d);
    }
}
