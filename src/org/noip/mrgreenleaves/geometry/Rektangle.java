package org.noip.mrgreenleaves.geometry;

public class Rektangle extends Shape{

    //variables

    private double length;
    private double width;
    private boolean filled;

    //getters and setters

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public boolean getIsFilled()
    {
        return filled;
    }

    public void setLength(double length)
    {
        this.length=length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setIsFilled(boolean filled)
    {
        this.filled=filled;
    }



    //methods
    //method / constructors

    public Rektangle()
    {
        this(1,1, false);
    }

    public Rektangle(double length)
    //constructor for a special rectangle of a square where length=width= length*length
    {
        this(length, length, false);
    }

    public Rektangle(double length, double width, boolean filled)
    {
        setLength(length);
        setWidth(width);
        setIsFilled(filled);
    }

    //methods further methods

    public double getCircumference()
    {
        return 2*getLength()+2*getWidth();
    }

    public double getArea()
    {
        return getLength()*getWidth();
    }
}
