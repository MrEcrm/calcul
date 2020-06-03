package org.noip.mrgreenleaves.chapter12.theorie.enumerationz;

import org.noip.mrgreenleaves.chapter12.theorie.enumerationz.ausporbieren.Test;



public class Enumerations {
    enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
    enum WorkDays {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}
    enum Grades {VERYGOOD, GOOD, SATISFACTORY, ADEQUATE, FAIL}

     public static void main(String[] args)
     {
         Enumerations.Days day = Enumerations.Days.MONDAY;
         System.out.println(day);
     }

}
