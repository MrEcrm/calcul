package org.noip.mrgreenleaves.chapter15.dateandtime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattedTimes {
    public static void main(String[] args)
    {
        String formatted;
        DateTimeFormatter formatter;

        LocalDateTime test = LocalDateTime.now();
        ZoneId zone = ZoneId.of("Africa/Cairo");
        ZonedDateTime testTime = test.atZone(zone);

        //Standard Formatierer
        formatted = DateTimeFormatter.ISO_DATE_TIME.format(testTime);
        System.out.println();
        System.out.println("DateTimeFormatter.ISO_DATE_TIME.format(nowComplete)");
        System.out.println(formatted);

        //Local specific formatter
        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        formatted = formatter.format(testTime);
        System.out.println();
        System.out.println("DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)");
        System.out.println(formatted);

        //Local specific formatter2
        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        formatted = formatter.format(testTime);
        System.out.println();
        System.out.println("DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)");
        System.out.println(formatted);

        //custom format
        formatter = DateTimeFormatter.ofPattern("E yyyy-MM-dd HH:mm");
        formatted = formatter.format(testTime);
        System.out.println();
        System.out.println("DateTimeFormatter.ofPattern(\"E yyyy-MM-dd HH:mm\")");
        System.out.println(formatted);

        //format with am and pm 12 hour format
        formatter = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy, hh:mm a");
        formatted = formatter.format(testTime);
        System.out.println();
        System.out.println("DateTimeFormatter.ofPattern(\"EEEE dd.MM.yyyy, hh:mm a\")");
        System.out.println(formatted);

    }
}
