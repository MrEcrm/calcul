package org.noip.mrgreenleaves.chapter13.theorie.another;

public class Book implements Comparable<Book>{

    //define variables
    private String author;
    private String title;
    private int nbrissues;

    //getter and setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNbrissues() {
        return nbrissues;
    }

    public void setNbrissues(int nbrissues) {
        this.nbrissues = nbrissues;
    }

    //Constructors

    Book(String author, String title, int nbrissues)
    {
        setAuthor(author);
        setTitle(title);
        setNbrissues(nbrissues);
    }

    //Methods

    //use compareTo to sort the books first by author, then by title and finally by number of issues
    //this requires Comparable<Book> be implemented

    public int compareTo(Book o)
    {
        //first make sure that the book contains values and that the values compared are of the same class
        if(o==null && o.getClass()!=this.getClass())
            //return -1 for invalidity declaration
            return -1;

        //first sort by author if author contains a value
        if(o.author!= null)
            return this.author.compareTo(o.author);

        else
        {
            //afterwards sort by title, if title contains a value
            if(o.title!= null)
                return this.title.compareTo(o.title);

            else
            {
                //lastly, sort by the number of issues.
                return this.nbrissues-o.nbrissues;
            }
        }

    }
    //11 min

}
