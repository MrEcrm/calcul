package org.noip.mrgreenleaves.chapter15.dateandtime;

import java.awt.*;
import java.time.*;

public class TimeDifference {

    static void runAdd()
    {
        int i = 0;
        while ( i <  100000000)
            i++;
    }

    public static void main(String[] args)
    {
        Instant start = Instant.now();
        runAdd();
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        long millis = timeElapsed.toMillis();
        System.out.println("Zeitdauer in Millisekunden " +millis);

        int a = 1_000;
        System.out.println(a);
        Instant test = Instant.EPOCH;
        System.out.println(test);

        Instant min = Instant.MIN;
        Instant max = Instant.MAX;
        System.out.println(min);
        System.out.println(max);
    }

}
