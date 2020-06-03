package org.noip.mrgreenleaves.chapter15.exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Exercise2 {


    public static void main(String[] args) {

        //define Variables
        int month = 0;
        int year = 0;
        //int day = 0 not used

        //fill the variables with the value from the Parameters given
        // 1) here we could work with a try catch and throw a new Runtime Exception if the argument is less than 2 ("Please indicate month and year")
        // 2) here we could work with another check as the month and  must be bigger than 0 and less than 13 at the same time a throw new ("Pleas enter 1...12 for months only.")
        month = Integer.parseInt(args[0]);
        year = Integer.parseInt(args[1]);

        //and add the catch
        //print a message
        //Systen.exit(1);

        //Variable for the first day in the month
        LocalDate lDate = LocalDate.of(year, month, 1);
        printCalender(lDate);
    }

    //create methods

    //draw the calender
    static void printCalender(LocalDate ld) {

        //local variable for the position
        int pos;

        // number between 1 and 12
        int month = ld.getMonthValue();

        //create the headline1 using the method months() from below to extract only the month from (ld)
        System.out.println("\nCalender for " + months(ld) + " " + ld.getYear());

        //create the headline2
        System.out.println("We\tMo\tTu\tWe\tTh\tFr\tSa\tSu");

        //get the Calenderweek
        WeekFields week = WeekFields.of(Locale.getDefault());
        System.out.print(ld.get(week.weekOfYear()));

        //gets the day of the week and matches that day with the position 1 to 7 for the columns
        switch (ld.getDayOfWeek()) {
            case MONDAY:
                pos = 1;
                break;
            case TUESDAY:
                pos = 2;
                break;
            case WEDNESDAY:
                pos = 3;
                break;
            case THURSDAY:
                pos = 4;
                break;
            case FRIDAY:
                pos = 5;
                break;
            case SATURDAY:
                pos = 6;
                break;
            case SUNDAY:
                pos = 7;
                break;
            default:
                pos = 0;
        }


        // for every position add a tab
        for (int i = 1; i <= pos; i++)
            System.out.print("\t");

        //do this as long you stay in this very month
        while (month == ld.getMonthValue()) {
            System.out.print(ld.getDayOfMonth() + "\t");
            //step through every day in the month
            ld = ld.plusDays(1);

            //for every Monday get the calender week number
            if (ld.getDayOfWeek() == DayOfWeek.MONDAY)
                System.out.print("\n" + ld.get(week.weekOfYear()) + "\t");

 }



    }

    //function with the name month to map the Month with it's name instead fo the date 1965-07-01
    static String months(LocalDate date)
    // the date parameter serves as input such as 1965-07-01 actually it overrides it
    {
        switch (date.getMonth())
        // just get the month from 1965-07-01 in nondigit format
        {
            case JANUARY:
                return ("January");
            case FEBRUARY:
                return ("February");
            case MARCH:
                return ("March");
            case APRIL:
                return ("April");
            case MAY:
                return ("May");
            case JUNE:
                return ("June");
            case JULY:
                return ("July");
            case AUGUST:
                return ("August");
            case SEPTEMBER:
                return ("September");
            case OCTOBER:
                return ("Octomber");
            case NOVEMBER:
                return ("November");
            case DECEMBER:
                return ("December");
            default:
                return ("");
        }

    }

    // create object not required

}
