package org.noip.mrgreenleaves.chapter13.theorie.another;

import java.util.ArrayList;
import java.util.*;


// to run it: right click with the mouse on the Excercise Item, select: Edit 'Exercise.main()'...
// set Programm arguments: 8, 7 or 6, apply, OK
public class Exercise {

    //make an array of Book objects
    // create the main method and require a parameter that is either 6,7 or 8, then create the object of this class
    // create a constructor which adds the required number of objects to the Book array above and include a parameter upon which the printout rule will be selected include a decision making process
    // create the method part6() where you create a collection and add the books from the array to the collection, sort the collection in different manners and print these out
    // create the method show() which iterates through the collection and prints out all the books from the collection of the array

    //make an array of Book objects

    Book[] bookarray = new Book[6];
    // create the main method and require a parameter that is either 6,7 or 8, then create the object of this class
    public static void main(String[] args)
    {
        if (args.length != 1)
            System.out.println("Please enter a vaild number between 0 and 9");
        else
        {
            //create the Excercise object
            Exercise ex = new Exercise(args[0]);
        }
    }

    // create a constructor which adds the required number of objects to the Book array above and include a parameter upon which the printout rule will be selected include a decision making process

    Exercise(String part)
    {
        // add some Book objects to the bookarray.
        bookarray[0] = new Book("Theodor Storm", "Der Schimmelreiter", 123144);
        bookarray[1] = new Book ("Friedrich Schiller", "Die Räuber", 98832);
        bookarray[2] = new Book("Gogol", "Die Nase", 9775);
        bookarray[3] = new Book ("Heinrich Mann", "Der Untertan", 231232);
        bookarray[4] = new Book("Gunter Grass", "Die Blechtrommel", 9855454);
        bookarray[5] = new Book("Heinrich Heine", "Der Steppenwolf", 3242344);

        //create the if clauses to execute the part6()
        if(part.equals("6"))
            part6();
        else if (part.equals("7"))
            part7();
        else if (part.equals("8"))
            part8();
        else System.out.println("Please make sure that the parameter provided matches either 6, 7 or 8");

    }

    // create the method part6() where you create a collection and add the books from the array to the collection, sort the collection in different manners and print these out

    public void part6()
    {
        System.out.println("\n Solution part 6");

        // create the collection arrList
        ArrayList<Book> arrList = new ArrayList<>();

        //add all books from the bookarray to the collection arrList
        for (int i = 0; i < bookarray.length; i++)
            arrList.add(bookarray[i]);

        //print out the arrList in various sort orders
        System.out.println();
        System.out.println("The list shown as entered:");
        show(arrList);

        System.out.println();
        System.out.println("The list in descending sort order:");
        //sort the collection in reverse sort order
        Collections.sort(arrList, Collections.reverseOrder());
        show(arrList);

        System.out.println();
        System.out.println("The list in ascending sort order:");
        //sort the collection in ascending sort order
        Collections.sort(arrList);
        show(arrList);


    }

    public void part7()
    {
        System.out.println("\n Solution part 7 - HashMap or TreeMap");

        // HashMap
        System.out.println();
        System.out.println("HashMap");
        // create the collection HashMap
        HashMap<String, Book> bookMap = new HashMap<>(11);
        for (int i =0; i <bookarray.length; i++)
            // use put
            bookMap.put(""+i, bookarray[i]);

        //print out the bookMap in various sort orders
        System.out.println();
        System.out.println("The list shown as entered:");
        // show the values of the bookMap
        show(bookMap.values());

        // TreeMap
        System.out.println();
        System.out.println("TreeMap");
        // create the collection TreeMap
      TreeMap<String, Book> treeMap = new TreeMap<>();
        for (int i =0; i <bookarray.length; i++)
            // use put
            treeMap.put(""+i, bookarray[i]);

        //print out the treeMap in various sort orders
        System.out.println();
        System.out.println("The list shown as entered:");
        // show the values of the treeMap
        //caution: difficult to sort a "map"
        show(treeMap.values());



    }


    public void part8() {
        System.out.println("\n Solution part 8 - HashSet or TreeSet");

        // HashSet
        System.out.println();
        System.out.println("HashSet");
        // create the collection HashSet
        HashSet<Book> bookSet = new HashSet<>();
        for (int i = 0; i < bookarray.length; i++)
            // use put
            bookSet.add(bookarray[i]);
        bookSet.add(new Book("Goethe", "Faust", 87987));

        //print out the arrList in various sort orders
        System.out.println();
        System.out.println("The list shown as entered:");
        // show the values of the bookSet
        show(bookSet);

        // TreeSet
        System.out.println();
        System.out.println("TreeSet");
        // create the collection TreeSet
        TreeSet<Book> bookTreeSet = new TreeSet<>();
        for (int i = 0; i < bookarray.length; i++)
            // or: bookTreeSet.addAll(bookarray);
            bookTreeSet.add(bookarray[i]);
        bookTreeSet.add(new Book("Marcus Aurelius", "Aurora", 99999));

        //print out the TreeSet in various sort orders
        System.out.println();
        System.out.println("The list shown as entered:");
        // show the values of the bookTreeSet
        show(bookTreeSet);

    }

    // create the method show() which iterates through the collection and prints out all the books from the collection of the array

    public void show(Collection l)
    {
        //create the iterator
        Iterator itera = l.iterator();

        //iterate as long as there is a next element in the collection
        while(itera.hasNext())
        {
            // create a variable b for Book objects and store the next Book element into b
            //therefore you need to typecast the next Element into a Book type.
            Book b = (Book)itera.next();

            //show the book's content! print it out!
            System.out.println(b.getAuthor() + " - " + b.getTitle() + " - " + b.getNbrissues());

        }
    }
//24 min 45 sec
    //plus 11 in for books
    // total 35 45 secs.

}
