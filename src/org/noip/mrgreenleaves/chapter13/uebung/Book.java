package org.noip.mrgreenleaves.chapter13.uebung;

public class Book implements Comparable<Book> {


    //Variables
    private String author;
    private String title;
    private int issuesize;

    // getters & setters
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

    public int getIssuesize() {
        return issuesize;
    }

    public void setIssuesize(int issuesize) {
        this.issuesize = issuesize;
    }

    //constructor
    Book(String author, String title, int issuesize) {
        setAuthor(author);
        setTitle(title);
        setIssuesize(issuesize);
    }


    @Override
    public int compareTo(Book o) {

        // klassen müssen gleich sein, o muss einen wert enthalten
        if (this.getClass() != o.getClass() && o == null) {
            return -1;
        }

        //wenn author content hat, dann sortiere nach author
        if (o.author != null)
        {
            return author.compareTo(o.author);
        }

        else
            //weiter

            {

                //wenn title content hat, dann sortiere nach title
            if (o.title != null) {
                return title.compareTo(o.title);
            }

            else
                //weiter
                {
                    //sortiere nach issuesize
                 return this.issuesize-o.issuesize;
                }
            }
        }


}