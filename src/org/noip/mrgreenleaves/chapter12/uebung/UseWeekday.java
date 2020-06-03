package org.noip.mrgreenleaves.chapter12.uebung;

public class UseWeekday {

    public void writeWeekday(Weekday day)
    {
        System.out.println("Heute ist " + day.toString().substring(0,1).substring(0).toUpperCase()+day.toString().substring(1).toLowerCase());

    }

    public static void main(String[] args)
    {
        Weekday.writeAllDays();
        System.out.println();

        UseWeekday test = new UseWeekday();
        test.writeWeekday(Weekday.MONDAY);
    }
}
