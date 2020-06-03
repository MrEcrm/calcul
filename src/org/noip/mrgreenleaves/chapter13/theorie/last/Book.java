package org.noip.mrgreenleaves.chapter13.theorie.last;

public class Book implements Comparable<Book> {

    //create book variables
    private String author;
    private String title;
    private int issuessold;

    //create getters and setters

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

    public int getIssuessold() {
        return issuessold;
    }

    public void setIssuessold(int issuessold) {
        this.issuessold = issuessold;
    }

    //create book constructor

    Book(String author, String title, int issuessold)
    {
        setAuthor(author);
        setTitle(title);
        setIssuessold(issuessold);
    }

    //create comparable method to sort first by author, then by title and finally by issuessold
    // use comparable Book

    public int compareTo(Book b)
    {
        //rule out the case of no content or no matching classes
        if(b == null && this.getClass()!=b.getClass())
            // a non real value
            return -1;

        if(b.author!=null)
            return this.author.compareTo(b.author);

        else{
            if(b.title!=null)
                return this.title.compareTo(b.title);

                else
            {
                return this.issuessold-b.issuessold;
            }
        }
        //8 min

    }
}
