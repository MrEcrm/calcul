package org.noip.mrgreenleaves.chapter15.unittest;

public enum     Weekdays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static void printAllDays()
    {
        for(Weekdays d: Weekdays.values())
            System.out.println(d);
    }
}
