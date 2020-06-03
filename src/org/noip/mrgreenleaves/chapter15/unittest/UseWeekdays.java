package org.noip.mrgreenleaves.chapter15.unittest;

public class UseWeekdays {

    public void printWeekday(Weekdays day)
    {
        System.out.println("Today is: " +day.toString().substring(0,1).substring(0).toUpperCase() +day.toString().substring(1).toLowerCase());
    }

    public static void main(String[] args)
    {
        Weekdays.printAllDays();
        System.out.println();

        UseWeekdays test= new UseWeekdays();
        test.printWeekday(Weekdays.TUESDAY);
    }
}
