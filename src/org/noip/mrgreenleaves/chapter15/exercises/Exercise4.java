package org.noip.mrgreenleaves.chapter15.exercises;

import java.time.Duration;
import java.time.*;

public class Exercise4 {

    public static void main(String[] args)
    {
        String s1 = "X";
        //System.out.println(s1);
        StringBuffer sb = new StringBuffer(s1);
        //System.out.println(sb);


        Instant start, end;
        Duration timeElapsed;

        start = Instant.now();
        for(int i = 0; i <300000; i++)
            s1 = s1 +"X";
        end = Instant.now();


        timeElapsed = Duration.between(start, end);
        long millis = timeElapsed.toMillis();


        System.out.println("Duration in milliseconds: " +millis);
        System.out.println("Length of the string: " +s1.length());

        start = start = Instant.now();
        for (int i = 0; i < 300000000; i++)

        sb.append("X");
        end = Instant.now();

        timeElapsed = Duration.between(start, end);
        millis = timeElapsed.toMillis();

        System.out.println();
        System.out.println("Duration in milliseconds: " +millis);
        System.out.println("Length of the string: " +sb.length());
        System.out.println("Capacity of the StringBuffer: " +sb.capacity());

    }
}
