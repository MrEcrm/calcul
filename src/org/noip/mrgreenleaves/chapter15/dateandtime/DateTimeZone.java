package org.noip.mrgreenleaves.chapter15.dateandtime;
import java.time.*;
import java.time.ZonedDateTime;

public class DateTimeZone {
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        ZoneId zone = ZoneId.of("Europe/Berlin");
        ZonedDateTime zdt = now.atZone(zone);
        System.out.println(zdt.toString());

        ZonedDateTime zdt1 = ZonedDateTime.of(1995, 5 ,23, 15, 0, 0, 0, ZoneId.of ("America/New_York"));
        System.out.println(zdt1.toString());
    }
}
