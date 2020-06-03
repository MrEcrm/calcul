package org.noip.mrgreenleaves.chapter13.theorie.last;

import org.noip.mrgreenleaves.chapter13.theorie.another.Exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Execute {

    //first,     create an array of books for 5 books
    //second,    create an Excecute object if the input parameters are between 0 and 9 om the main method
    //third,     create an excecute constructor that includes 5 book items created and added to the array of books from before
    //           if else clause to analyse the parameter provided, 6,7,8 if none of these require one of these and run the respective method part6()
    //forth,     define part6() to create an ArrayList Collection and sort that ArrayList ascending, descending, entering sort order and show() the content
    //sixth,     create the show method: create an iterator and iterate through the ArrayList Collection as long there is a next item available, print out every item of arraylist collection


    //start
    //first,     create an array of books for 5 books
    Book[] books = new Book[5];

    //second,    create an Excecute object if the input parameters are between 0 and 9 in the main method
    public static void main(String[] args)
    {
        if(args.length !=1)
        {
            System.out.println("Please provide a parameter betweeen 0 and 9");
        }
        else
        {
            Execute ux = new Execute(args[0]);
        }
    }

    //third,     create an excecute constructor that includes 5 book items created and added to the array of books from before
    //           if else clause to analyse the parameter provided, 6,7,8 if none of these require one of these and run the respective method part6()


    Execute(String part)
    {
        //generate 5 book objects and add them to the array books:

        books[0] = new Book("Mark Twain", "Tom Sawyer & Huckleberry Fin", 20322);
        books[1] = new Book("Stephen Kind", "IT", 2352354);
        books[2] = new Book("Günter Grass", "Die Blechtrommel", 34234);
        books[3] = new Book("Heinrich Heine", "Steppenwolf", 675435);
        books[4] = new Book("Friedrich Schiller", "Die Räuber", 8976786);

        //analyse the parameter
        if(part.equals("6"))
            part6();
        else if(part.equals("7"))
            part6();
        else if (part.equals("8"))
            part6();
        else
            System.out.println("Please indicate 6,7 or 8 as a valid parameter.");
    }

    //forth,     define part6() to create an ArrayList Collection and sort that ArrayList ascending, descending, entering sort order and show() the content

    public void part6()
    {

        //put all the books from the Array books into the ArrayList Collection
        ArrayList<Book> thisList = new ArrayList<>();
        for (int i = 0; i <books.length; i++)
            thisList.add(books[i]);

        //sort it ascending sort order
        System.out.println();
        System.out.println("Ascending sort order");
        Collections.sort(thisList);
        show(thisList);

        System.out.println();
        System.out.println("descending sort order");
        Collections.sort(thisList, Collections.reverseOrder());
        show(thisList);

        System.out.println();
        System.out.println("Sort order as entered in the System");
        show(thisList);
    }

    //sixth,     create the show method: create an iterator and iterate through the ArrayList Collection as long there is a next item available, print out every item of arraylist collection

    public void show(Collection l)
    {
        //create the iterator
        Iterator<Book> itera = l.iterator();

        while (itera.hasNext())
        {
            //create a book variable  and save the next Element from the ArrayList collection of the Array against this variable and typecast it to a book type.
            Book b = (Book) itera.next();
            System.out.println(b.getAuthor() + " " + b.getTitle() + " " + b.getIssuessold());
        }
    }

}
