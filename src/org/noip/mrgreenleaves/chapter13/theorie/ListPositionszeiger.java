package org.noip.mrgreenleaves.chapter13.theorie;
import java.util.*;

public class ListPositionszeiger {
    public static void main(String[] args) {
        // eine Einfache Liste erstellen

        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            aList.add(i);
        System.out.println();
        System.out.println(aList);


        System.out.println("has Next: " +aList.iterator().hasNext());
        System.out.println("next value: "+aList.iterator().next());

        Iterator<Integer> test = aList.iterator();
        while(test.hasNext())
        {
            System.out.println(test.next());
        }

        System.out.println();

        //System.out.println(aList.iterator().next());



        List<String> bList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            bList.add(String.valueOf(i));
        System.out.println();
        System.out.println(bList);
        System.out.println("has next string: "+bList.iterator().hasNext());
        System.out.println("next value String: "+aList.iterator().next());
        Iterator<Integer> test01 = aList.iterator();
        while(test01.hasNext())
        {
            System.out.println(test01.next());
        }

        System.out.println();
        System.out.println("ABCDE List");
        List<String> cList = new ArrayList<>();
        cList.add("A");
        cList.add("B");
        cList.add("C");
        cList.add("D");
        cList.add("E");

        Iterator<String> test02 = cList.iterator();
        while(test02.hasNext())
        {
            System.out.println(test02.next());
        }

        System.out.println("remove D");
        System.out.println(cList.remove("D"));
        cList.remove("D");

        System.out.println();
        Iterator<String> test03 = cList.iterator();
        while(test03.hasNext())
        {
            System.out.println(test03.next());
        }





    }
}
