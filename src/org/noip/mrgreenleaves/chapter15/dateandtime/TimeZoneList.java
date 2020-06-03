package org.noip.mrgreenleaves.chapter15.dateandtime;
import java.util.TimeZone;

import static java.util.TimeZone.*;

public class TimeZoneList {
    private static void log(String[] availableIDs) {

        System.out.println("\nHere are all list of timezones for your reference:");
        for (String temp : availableIDs)
            System.out.println(temp);

    }
    public static void main(String[] args)
    {
        log(getAvailableIDs());
    }
}
