package org.noip.mrgreenleaves.chapter15.dateandtime;

import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateAndZone {
    public static void main(String[] args)
    {

        //https://iana.org/time-zones

        final String DATE_FORMAT = "dd-MM-yyyy  hh:mm:ss a z";
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);


        LocalDateTime today = LocalDateTime.now();
        ZoneId zone1 = ZoneId.of("Europe/Zurich");
        ZonedDateTime zdt1 = today.atZone(zone1);

        //to switch the timezones for the same time
        ZoneId zone2 = ZoneId.of("America/New_York");
        ZonedDateTime zdt2 = zdt1.withZoneSameInstant(zone2);


        System.out.println("Berlin");
        System.out.println(zdt1);
        System.out.println(zdt1.toString());
        System.out.println(formatter.format(zdt1));
        System.out.println();

        //klappt noch nicht ist selbe zeit wie oben, müsste aber new york zeit sein
        System.out.println("New_York");
        System.out.println(zdt2);
        System.out.println(formatter.format(zdt2));

        // wie costa Rica Zeit finden?
        //America/Costa_Rica


        System.out.println("Costa Rica");
        ZoneId zone3 = ZoneId.of("America/Costa_Rica");
        ZonedDateTime zdt3 = zdt1.withZoneSameInstant(zone3);
        System.out.println(zdt3);
        System.out.println(zdt3.toString());
        System.out.println(formatter.format(zdt3));
        System.out.println();

        System.out.println("+ 5 hours added");
        System.out.println(zdt3.plusHours(5));

        System.out.println("- 5 weeks removed");
        System.out.println(zdt3.minusWeeks(5));

        System.out.println();
        System.out.println("Europe / San_Marino withMonth 10 = Oktoner");
        ZoneId zone4 = ZoneId.of("Europe/San_Marino");
        //ZonedDateTime zdt4 = zdt1.withZoneSameInstant(zone4);
        //System.out.println(zdt4);
        ZonedDateTime zdt4 = zdt1.withMonth(10)
                .withZoneSameInstant(zone4);
        System.out.println(zdt4);
        zdt4=zdt4.plus(23, ChronoUnit.HALF_DAYS);
        System.out.println(zdt4);

    }
}
