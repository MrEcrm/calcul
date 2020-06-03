package org.noip.mrgreenleaves.repeat10;

public class Regtangle
implements Formen{

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

    public Regtangle()
    {
        this(1,1);
    }

    public Regtangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    public double getFlaeche() {
        return getLength()*getWidth();
    }

    @Override
    public double getUmfang() {
        return 2*getWidth()+2*getLength();
    }
}
