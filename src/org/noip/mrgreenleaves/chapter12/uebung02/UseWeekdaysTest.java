package org.noip.mrgreenleaves.chapter12.uebung02;

import org.junit.Test;

import static org.junit.Assert.*;

public class UseWeekdaysTest {

    @Test
    public void testprintWeekday() throws Exception{
        //create object
        UseWeekdays test1 = new UseWeekdays();

        // add value to this obejct
        Weekdays day = Weekdays.TUESDAY;
        https://blog.parasoft.com/junit-tutorial-setting-up-writing-and-running-java-unit-tests


       assertEquals("Tuesday", day.toString().substring(0,1).substring(0).toUpperCase() +day.toString().substring(1).toLowerCase());



    }

    @Test
    public void main() {
        /*
        Weekdays.printAllDays();
        System.out.println();

        UseWeekdays test= new UseWeekdays();
        test.printWeekday(Weekdays.TUESDAY);

         */
    }
}