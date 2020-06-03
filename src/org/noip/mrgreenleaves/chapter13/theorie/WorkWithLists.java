package org.noip.mrgreenleaves.chapter13.theorie;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class WorkWithLists {
    public static void main(String[] args)
    {
        //LinkedList
        System.out.println("LinkedList");
        LinkedList<Integer> myNumbers = new LinkedList<>();
        myNumbers.add(10);
        myNumbers.add(12);
        myNumbers.add(13);
        myNumbers.add(23);
        myNumbers.add(27);
        myNumbers.add(10);
        for(Integer myNumber: myNumbers)
        {
            System.out.println("Number: " +myNumber);
        }
        System.out.println(myNumbers);

        //liste Bearbeiten

        myNumbers.get(4);
        System.out.println("Get number 4 takes the 5th element "+myNumbers.get(4));
       // System.out.println("Get number 4 takes the 5th element "+myNumbers.get(11));
        //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 11, Size: 5

        myNumbers.indexOf(23);
        System.out.println("get the index of the value 23 which is: " +myNumbers.indexOf(23));
        System.out.println("get the index of the value 666 (not existing) which is: " +myNumbers.indexOf(666));
        System.out.println("get the index of the value 10 which exists twice: " +myNumbers.indexOf(10));
        System.out.println("it only picks the first one found");
        myNumbers.set(3, 44);
        System.out.println("Result of the myNumbers.set(3, 44) it replaces the 4th item: "+myNumbers);



    //array
        System.out.println();
        System.out.println("Array");
        int[] geburtsjahre = new int[3];
        geburtsjahre[0]  = 1983;
        geburtsjahre[1] = 1954;
        geburtsjahre[2]= 1978;

        for(int a: geburtsjahre)
            System.out.println(a);

        //List
        System.out.println();
        System.out.println("List");

        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(12);
        listNumbers.add(13);
        listNumbers.add(15);
        System.out.println(listNumbers);

        System.out.println();
        System.out.println("List double");

        List<Double> listNumbers2 = new ArrayList<>();
        listNumbers2.add(12.0);
        listNumbers2.add(13.45);
        listNumbers2.add(15.2);
        System.out.println(listNumbers2);

        System.out.println();
        System.out.println("Tree set");

        Set<Double> setTree = new TreeSet<>();
        setTree.add(12.0);
        setTree.add(13.3);
        setTree.add(15.345);
        for(Double s: setTree)
        System.out.println(s);

        System.out.println();
        System.out.println("Hash set");

        Set<Integer> setHash = new HashSet<>();
        setHash.add(12);
        setHash.add(13);
        setHash.add(15);
        System.out.println(setHash);


    }
}
