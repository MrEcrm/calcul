package org.noip.mrgreenleaves.chapter13.theorie.uebung002;

public class Book implements Comparable<Book>{

    //variables
    private String author;
    private String title;
    private int issues;

    // setters and getters

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

    public int getIssues() {
        return issues;
    }

    public void setIssues(int issues) {
        this.issues = issues;
    }

    //Constructor

    Book(String author, String title, int issues)
    {
        setAuthor(author);
        setTitle(title);
        setIssues(issues);
    }

    //Methods

    //to sort first by author, then by title and finally by issue number
     public int compareTo(Book o)
    {
        //check precondition same classes, and contains content
        if(this.getClass()!=o.getClass() && o ==null)
        return -1;

        if(o.author != null)
            return this.author.compareTo(o.author);

        else
        {
            if(o.title != null)
                return this.title.compareTo(o.title);

            else
            {
                return this.issues-o.issues;
            }
        }



    }


}
