package org.noip.mrgreenleaves.chapter13.theorie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration {

    //shows the application of an iterator and a ListIterator
    // fill first an ArrayList with elements, afterwards single elements will be removed and it will checked if a specific given element is contained as an element whithin this list
    // by the use of a ListIterator, a sub list will be created and run through

    //as a special flavour, we convert the String values into Integers and continue with analyses instead of creating an additional counter int x = 0;

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();

        //manually
        //arrList.add("A");

        //automatically add 10 elements

        //start with 1 since 0 is unclear in regards of even or uneven number
        for (int i = 1; i <= 20; i++)
            arrList.add(String.valueOf(+i));

        //output of the list

        System.out.println();
        System.out.println("Output of the list");

        for(String s: arrList)
            System.out.println(s);

        System.out.println();

        //for the arrList, create a Method called 'iterator'
        // the object testIterator points to the first element on the list
        Iterator<String> testIterator = arrList.iterator();
        //.iterator() is the method

        //with the help of a while loop we run through the list until all elements within the list(object) have been worked off
        // the job ends when the method 'hasNext' returns  'false'

        while (testIterator.hasNext()) {

            //the method next() picks the actual element and then puts the pointer on the next element
            //1.
            int value = Integer.parseInt(testIterator.next());

            //  if we were constantly working with a typecast of tst Iterator.next() (A) it would always shift the pointer further forward to (B) and this would lead to escapes
            // we do not wish.
            /*

            if it where not a String type but e.g. an integer, we would have to put it into a toString before output
            remove every second Element of this list and leave the even numbers
            */

            if (value % 2 != 0)

                    /*
                    Integer.valueOf(testIterator.next())
                    testIterator.next() is a String value, but we know its a number therefore we just pick the first character
                    However we are unable to use
                    if (Integer.valueOf(testIterator.next()) % 2 == 0.00)
                    because it would pick the value (from B)  and shift the pointer again one forward to (c).

                     */ {
                System.out.println(value + " removed");
                testIterator.remove();
                //again we use value and not
                // Integer.valueOf(testIterator.next())
                // for it would pick the value (c) and shift the pointer to (D) from where it  would
                // restarts with E

            } else {
                System.out.println(value + " not removed");
                // or it might pick the value from (C) and shift the pointer to (C) from where it would restart
                // at the beginning of this clause at E.
            }


        }
        System.out.println();
        System.out.println("Output of the new list");

        /*
        for (String p: arrList)
            System.out.println(p);


         */

        //set the pointer to the first element of arrList
        testIterator = arrList.iterator();

        while(testIterator.hasNext())
            System.out.println(testIterator.next() + " - ");
            System.out.println("\nTest:");

        //use the contains method to check if number 8 is contained in this list

        //we first introduce a variable as a number so that you can dynamically test the results below instead of hard-coding figures
        // then, we typecast it into a String s value. to continue from there our analysis since the List is a <String> List
        int value2 = 14;
        String s = String.valueOf(value2);

        if(arrList.contains(s))
        {
            System.out.println("The list contains " + s);
        }
        else
        {
            System.out.println("The list does not contain the value " +s);

        }

        System.out.println();
        System.out.println("\nRun the list from the actual position backwards");

        //instead of setting the pointer to the first element, we set the pointer to the element from value2
        ListIterator<String> tstIterator2 = arrList.listIterator(arrList.indexOf(s));

        System.out.println("the index of the value " + s+ " is: "+arrList.indexOf(s));


        while (tstIterator2.hasPrevious())
            System.out.println("Value: " + tstIterator2.previous() + " index " + tstIterator2.nextIndex());
        System.out.println();

    }


}



