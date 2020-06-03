package org.noip.mrgreenleaves.chapter10;

public class Cubic02 extends Rectangle2{

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    Cubic02()
    {
        this(1,1,1);
    }

    Cubic02(double length, double width, double height)
    {
        super(length, width);
        setHeight(height);
    }

    @Override
    public double getArea2() {
        return super.getArea2()*getHeight();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter()*2+4*getHeight();
    }
}
