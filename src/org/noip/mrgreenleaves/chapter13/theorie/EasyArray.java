package org.noip.mrgreenleaves.chapter13.theorie;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

//List, ArrayList, LinkedList, Set, Map
// create & fill such a list, add, retrieve a specific number (not for the set), retrieve all, print as string, check if empty,

public class EasyArray {

    public static void main(String[] args)
    {
        //list
        System.out.println();
        System.out.println("List:");
        List<String> liste = List.of("Montag", "Mittwoch", "Freitag");
        System.out.println("Length of the list "+ liste.size());
        System.out.println("Return number n-1 "+ liste.get(0));
        //for each
        for (int i = 0; i <liste.size(); i++)
            System.out.println(liste.get(i));
        System.out.println("Same output as a String " +liste.toString());
        System.out.println("Status of the list, empty? " +liste.isEmpty());
        System.out.println("End of List");
        System.out.println();


        //arraylist
        System.out.println();
        System.out.println("ArrayList:");
        ArrayList<String> arrList = new ArrayList <String>();
        for (int i = 1; i <= 10; i++)
            arrList.add("Arraylist " +i);

        arrList.add(new Integer (12).toString());
        System.out.println("Length of the array list list "+ arrList.size());
        System.out.println("Return number n-1 - Fast "+ arrList.get(8));
        //for each
        for (int i = 0; i <arrList.size(); i++)
            System.out.println(arrList.get(i));
        System.out.println("Same output as a String  arrayList" +arrList.toString());
        System.out.println("Status of the list, empty? " +arrList.isEmpty());
        System.out.println("End of ArrayList");
        System.out.println();

        //LinkedList
        System.out.println();
        System.out.println("LinkedList:");
        LinkedList<String> linkdList = new LinkedList<>();
        for (int i = 1; i <= 10; i++)
            linkdList.add("LinkedList " +i);

        linkdList.add(new Integer (12).toString());
        System.out.println("Length of the linked list list "+ linkdList.size());
        System.out.println("Return number n-1 slow: "+ linkdList.get(8)); //slow
        //for each
        for (int i = 0; i <linkdList.size(); i++)
            System.out.println(linkdList.get(i));
        System.out.println("Same output as a String LinkedList" +linkdList.toString());
        System.out.println("Status of the list, empty? " +linkdList.isEmpty());
        System.out.println("End of LinkedList");
        System.out.println();



        //Set
        System.out.println();
        System.out.println("Set:");
        System.out.println();
        Set<String> set2 = Set.of("Java", "C#", "VB.net", "C");
        System.out.println("Length of the set "+set2.size());
        System.out.println( "Return the complete set: "+set2);
        System.out.println("Same output as a String " +set2.toString());

        //for each
        for (String d: set2)
            System.out.println("Result " +d);
        //System.out.println("Return number 2 (n-1)"); does not work might work via
        //Map<E,E> instead of a Set<E> -->
        /*
        You have no other option but to use the iterator": that is a linear search over a collection which is totally inefficient for large sets (ironically, internally the Set is organized as hash map or tree that could be queried efficiently). Don't do it! I have seen severe performance problems in real-life systems by using that approach. In my opinion what is terrible about the missing get() method is not so much that it is a bit cumbersome to work around it, but that most programmers will use the linear search approach without thinking of the implications.

        Mathematically, elements in sets are not individualised. Their only identity is derived from their presence in the set. Therefore, there is no point in getting the "first" element in a set, as conceptually such a task is illogical.

         */

        System.out.println("Status of the set, empty? " +set2.isEmpty());
        System.out.println("End of Set");
        System.out.println();



        //Map
        System.out.println();
        System.out.println("Map:");
        System.out.println();
        Map<String, Integer> DotNumber = Map.of("A", 1, "B", 2, "C", 3);
        System.out.println("Length of the Map: " +DotNumber.size());
        // Get the first entry that the iterator returns
        Map.Entry<String, Integer> testvar01 = DotNumber.entrySet().iterator().next();
        System.out.println("Printing out the very first pair \n Key: " +testvar01.getKey()+" Value: " +testvar01.getValue());
        //for each loop for a map
        for(Map.Entry<String, Integer> testvar02 : DotNumber.entrySet())
            System.out.println("Letter: " +testvar02.getKey()+ " Value: " +testvar02.getValue());
        System.out.println(DotNumber);
        System.out.println(DotNumber.toString());
        System.out.println("Status of the map, empty? " +DotNumber.isEmpty());
        System.out.println("End of Map");
        System.out.println();





    }
}
