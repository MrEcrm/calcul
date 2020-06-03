package org.noip.mrgreenleaves.chapter13.uebung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.*;

public class Exercise {

    //define an array to store 6 Objects in it.
    Book[] books = new Book[6];

    Exercise(String part)
    {
        books[0] = new Book ("Goethe", "Faust", (1126));
        books[1] = new Book ("Manfred", "Faust", (1156));
        books[2] = new Book ("Thomas", "Faust", (156));
        books[3] = new Book ("Mann", "Faust", (156));
        books[4] = new Book ("Thom", "Faust", (116));
        books[5] = new Book ("Thom", "Faust", (56));

        //wenn mitgelifertes argument = 6 ist dann führe part6() aus.
        if (part.equals("6"))
            part6();
        else if(part.equals("7"))
            part6();
        else if(part.equals("8"))
            part6();
        else
            System.out.println("please provied an argument that is either 6, 7 or 8");

    }

    public void part6()
    {
        //array liste für bücherverwaltung machen
        ArrayList<Book> arrList = new ArrayList<>();

        //einfügen der bücher in die arrList
        for(int i = 0; i <books.length; i++)
            arrList.add(books[i]);

        //unsortierte Ausgabe
        System.out.println();
        System.out.println("Unsortierte Ausgabe");
        show(arrList);


        //aufsteigende Ausgabe
        System.out.println();
        System.out.println("ascending sortierte Ausgabe");
        Collections.sort(arrList);
        show(arrList);

        //absteigende Ausgabe
        System.out.println();
        System.out.println("descending sortierte Ausgabe");
        Collections.sort(arrList, Collections.reverseOrder());
        show(arrList);

    }

    private void show(Collection l)
    {
        //erstellen eines iterators um alle aus der collection durchzugehen
        Iterator iter = l.iterator();

        while(iter.hasNext())
        {
            //was darin machen? die ausgabe!
            // wovon? vom buch. dessen variable wir aber noch erstellen müssen:

            Book b = (Book)iter.next();
            // es ist jeweils das nächste buch
            System.out.println(b.getAuthor() + " " + b.getTitle()+" " +b.getIssuesize());

        }
    }

    public static void main(String[] args)
    {
        if(args.length !=1)
            System.out.println("Please indicate an argument between 1 and 9");
        else
        {
            Exercise us = new Exercise(args[0]);
            //wie oben definiert im constructor, muss beim erstellen des Objektes mind 1 argument mitgegeben werden
        }
    }

}
