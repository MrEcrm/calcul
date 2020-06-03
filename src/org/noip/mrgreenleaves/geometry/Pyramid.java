package org.noip.mrgreenleaves.geometry;

public class Pyramid extends Rectangle {
    private double height;
    private boolean filled;

    //getters and setters

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height=height;
    }

    public boolean getIsFilled()
    {
        return filled;
    }

    public void setIsFilled(boolean filled)
    {
        this.filled=filled;
    }

    //Methods

    //Method / Constructors
    public Pyramid()
    {
        this(1,1,false,1);
    }

    public Pyramid(double length, double width, boolean filled, double height)
    {
        super(length, width, filled);
        setHeight(height);
    }

    //Method / functions

    public double getArea()
    {
        return -1;
    }

    public double getVolume()
    {
        return getHeight()*getLength()*getWidth()*(1/3);
    }

}
