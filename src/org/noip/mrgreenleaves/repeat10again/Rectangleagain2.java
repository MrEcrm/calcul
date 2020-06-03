package org.noip.mrgreenleaves.repeat10again;

public class Rectangleagain2 extends Forms2D2DAdapter{

    private double length2;
    private double width2;

    public double getLength2() {
        return length2;
    }

    public void setLength2(double length2) {
        this.length2 = length2;
    }

    public double getWidth2() {
        return width2;
    }

    public void setWidth2(double width2) {
        this.width2 = width2;
    }

    public Rectangleagain2()
    {
        this(1,1);
    }

    public Rectangleagain2(double length2, double width2) {
        setLength2(length2);
        setWidth2(width2);
    }

    @Override
    public double getAreaagain() {
        return getLength2()*getWidth2();
    }

    @Override
    public double getPerimetreagain() {
        return (2*(getLength2()*getWidth2()));
    }
}
