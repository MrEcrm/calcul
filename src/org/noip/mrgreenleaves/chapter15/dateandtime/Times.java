package org.noip.mrgreenleaves.chapter15.dateandtime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Times {
    public static void main(String[] args)
    {
        DateTimeFormatter timeFormat;
        LocalTime rightNow = LocalTime.now();

        LocalTime bedTime = LocalTime.of(23, 12);
        LocalTime standUp = bedTime.plusHours(7);
        System.out.println("Right now it is "+rightNow.getHour()+ " and " +rightNow.getMinute() +" Minutes");


        rightNow=rightNow.plus(2,ChronoUnit.HOURS);
        System.out.println();
        System.out.println("Right now it is "+rightNow.getHour()+ " and " +rightNow.getMinute() +" Minutes");
        System.out.println("Seconds running since midnight: " +rightNow.toSecondOfDay());
        System.out.println();


        if(rightNow.isAfter(bedTime) && rightNow.isBefore(standUp))
            System.out.println("sound asleep");
        else
        {
            long hoursUntilBed = rightNow.until(bedTime, ChronoUnit.HOURS);
            System.out.println("Time remaining " + hoursUntilBed +" hours until bedtime");
        }

        System.out.println();
        System.out.println("Try withHour combined with bedTime");
        System.out.println("bed time is +" +bedTime);
        LocalTime partyTime = bedTime.withHour(4);
        System.out.println("this sets the hour from partyTime");
        System.out.println("Party lasts until: "+partyTime +" in the morning");
    }
}
