package org.noip.mrgreenleaves.geometry;

public class Cuboid extends Rectangle {

    private double height;
    private boolean cuboidFilled;

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
        return cuboidFilled;
    }

    public void setCuboidFilled(boolean cuboidFilled)
    {
        this.cuboidFilled=cuboidFilled;
    }

    //constructors

    public Cuboid()
    {
        this(1,1,1, false, false);
    }

    Cuboid(double length)
    // a special cuboid with each side of the same length
    {
        this(length, length, length, false, false);
    }

    public Cuboid(double length, double width, double height, boolean filled, boolean cuboidFilled)
    {
       super(length, width, filled);
        setHeight(height);
        setCuboidFilled(cuboidFilled);
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
        return cuboidFilled;
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
