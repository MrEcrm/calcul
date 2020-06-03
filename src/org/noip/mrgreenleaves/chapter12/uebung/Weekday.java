package org.noip.mrgreenleaves.chapter12.uebung;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, FRIDAY,SATURDAY, SUNDAY;

    public static void writeAllDays()
    {
        for(Weekday d: Weekday.values())
        System.out.println(d);
    }
}
