package org.noip.mrgreenleaves.chapter10;

public class Rectangle2 implements Geometry2D{

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle2()
    {
        this (1,1);
    }
    public Rectangle2(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    @Override
    public double getArea2() {
        return getLength()*getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2*(getLength()+getWidth());
    }
}
