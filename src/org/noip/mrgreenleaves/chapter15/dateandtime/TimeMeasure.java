package org.noip.mrgreenleaves.chapter15.dateandtime;

public class TimeMeasure {

    public static void main(String[] args)
    {

        // 1'000'000 nanoseconds are 1 miliseconds
        // 1 second is 1000 (mill) milliseconds
        // 1 second is 1'000'000'000 (mia) nanoseconds
        //time since 1970 00:00 to today, rigtnow
        System.out.print("Current time in Milliseconds = ");
        System.out.println(System.currentTimeMillis());
        // shortly later:
        System.out.print("Current time in Milliseconds = ");
        System.out.println(System.currentTimeMillis());

        /*The value returned represents nanoseconds since some fixed but arbitrary time (in the future, so values may be negative) and provides nanosecond precision, but not necessarily nanosecond accuracy

         */
        System.out.print("time in nanoseconds = ");
        System.out.println(System.nanoTime());

        // shortly later
        System.out.print("time in nanoseconds = ");
        System.out.println(System.nanoTime());

    }
}
