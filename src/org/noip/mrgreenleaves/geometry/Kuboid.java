package org.noip.mrgreenleaves.geometry;

public class Kuboid extends Rektangle {

    private double height;
    private boolean kuboidFilled;

    //getters and setters

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height=height;
    }

    public boolean getIsCuboidFilled()
    {
        return kuboidFilled;
    }

    public void setCuboidFilled(boolean cuboidFilled)
    {
        this.kuboidFilled=cuboidFilled;
    }

    //constructors

    public Kuboid()
    {
        this(1,1,1, false, false);
    }

    Kuboid(double length)
    // a special cuboid with each side of the same length
    {
        this(length, length, length, false, false);
    }

    public Kuboid(double length, double width, double height, boolean filled, boolean kuboidFilled)
    {
        super(length, width, filled);
        setHeight(height);
        setCuboidFilled(kuboidFilled);
    }


    //methods

    public double getBase()
    {
        return super.getArea();
    }

    public boolean getIsFilledBase()
    {
        return super.getIsFilled();
    }


    //override

    public boolean getIsFilled()
    {
        return kuboidFilled;
    }

    public double getArea()
    {
        return getLength()*getWidth()*2+getWidth()*getHeight()*2+getLength()*getHeight()*2;
    }

    public double getVolume()
    {
        return getLength()*getWidth()*getHeight();
    }

}
