package org.noip.mrgreenleaves.chapter13.theorie.uebung002;

//to access collection, iterator methods
import java.util.*;

public class Exercise {

    //first make the show method show to iterate through the ArrayList and show the results from the iterations

    public void show(Collection l)
    {
        //create the iterator  and set the first point to the variable itera using the iterator() method
        Iterator itera = l.iterator();

        //make a while loop to to it for every item until there is no "next item" left using the hasNext() method
        while (itera.hasNext()) {
            // create a variable b of book type and pick the next item, type cast it to the book type before adding it
            // to the variable b
            Book b = (Book) itera.next();
            //print out some book variables for the picked book saved against that b Book variable
            System.out.println(b.getAuthor() + " " + b.getTitle() + " " + b.getIssues());
        }
    }

    // then make the part method to create the ArrayList to manage (incl. adding) the books from the book array and then
    // define the Collection bookList sort order before printing it out.
    public void part6()
    {
        //create the bookList Collection with a diamond operator
        ArrayList<Book> bookList = new ArrayList<>();

        //put all the book objects as elements into the bookList Collection
        for(int i =0 ; i <books.length; i++)
         bookList.add(books[i]);

        System.out.println();
        System.out.println("Here is the book list as entered");
        show(bookList);

        //natural sort order
        System.out.println();
        //sort it first
        Collections.sort(bookList);
        System.out.println("Here is the book list in ascending sort order");
        show(bookList);

        //descending sort order
        System.out.println();
        //sort it first in descending sort order
        Collections.sort(bookList, Collections.reverseOrder());
        System.out.println("Here is the book list in descending sort order");
        show(bookList);
    }

    // then create the Exercise constructor to add the books to a book array including if statements with the parameters
    Exercise(String part)
    {

        //add the books to the books array
        books[0] = new Book("Schiller", "Die Räuber", 20000);
        books[1] = new Book("Anthony Burgess", "A Clockwork Orange", 30000);
        books[2] = new Book("Heinrich von Kleist", "Michael Kohlhaas", 100000);
        books[3] = new Book("Stephen King", "IT", 70000);
        books[4] = new Book("Bertrand Biccard", "Changer d'Altitude", 800);
        books[5] = new Book("Gogol", "Die Nase", 90000);

        //define the actions depending on the parameter

        if(part.equals("6"))
            part6();
        else if(part.equals("7"))
            part6();
        else if(part.equals("8"))
            part6();
        else
            System.out.println("Please enter an argument that equals eiter 6,7 or 8");
    }

    // create the book array
    Book[] books = new Book[6];

    // create the exercise object to work on
    public static void main(String[] args)
    {
        //if the argument is null or e.g. two digit, is is centainly not 6, 7 or 8
        if(args.length !=1)
            System.out.println("Please enter a valid argument, it must be 6,7 or 8");
        else
        {
            Exercise ex = new Exercise(args[0]);
        }
    }
}
