package org.noip.mrgreenleaves.chapter13.theorie;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
    public static void main(String[] args)
    {

        LinkedList<String> testListe = new LinkedList<>();
        testListe.add("A");
        testListe.add("b");
        testListe.add("C");
        testListe.add("D");
        testListe.add("E");
        System.out.println("Length of the list: "+testListe.size());
        System.out.println(testListe);


        System.out.println();
        System.out.println("ListIterator - Forward");
        ListIterator<String> test = testListe.listIterator();
        while (test.hasNext())
        {
            System.out.println(test.next() + " "+test.nextIndex() );

        }

        System.out.println("set the Element 3 to F; where the first Element is 0");
        testListe.set(3,"F");
        ListIterator<String> test2 = testListe.listIterator();

        System.out.println();
        System.out.println("printout");
        while (test2.hasNext())
        {
            System.out.println(test2.next() + " "+test2.nextIndex() );

        }

        System.out.println();
        System.out.println("ListIterator - backward");
        testListe.descendingIterator();
        //System.out.println(testListe.descendingIterator());
        while(test.hasPrevious())
        {
            System.out.println(test.previous() +" "+ test.previousIndex());

        }





        while(test.hasPrevious())
        {
            System.out.println(test.previous() +" "+ test.previousIndex());

        }






    }
}
