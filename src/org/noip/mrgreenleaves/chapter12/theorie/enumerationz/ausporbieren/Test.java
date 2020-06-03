package org.noip.mrgreenleaves.chapter12.theorie.enumerationz.ausporbieren;

public class Test {
    enum Days {MONDAY, TUESDAY, WEDNESDAY, THHURSDAY, FRIDAY, SATURDAY, SUNDAY}
    enum WorkDays {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}
    enum SatisFaction {VERYBAD, BAD, OKAY, GOOD, VERYGOOD}


    public static void main(String[] args)
    {
        SatisFaction satis = SatisFaction.OKAY;
        System.out.println(satis);

    }

}
