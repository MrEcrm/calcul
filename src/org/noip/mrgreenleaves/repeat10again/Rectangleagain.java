package org.noip.mrgreenleaves.repeat10again;

public class Rectangleagain
        implements Forms2D{

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangleagain()
    {
        this(1,1);
    }

    public Rectangleagain(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    public double getAreaagain() {
        return getLength()*getLength();
    }

    @Override
    public double getPerimetreagain() {
        return (2*(getLength()+getWidth()));
    }
}
