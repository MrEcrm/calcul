package org.noip.mrgreenleaves.retestchapter10;
import static java.lang.Math.PI;
import static org.noip.mrgreenleaves.geometry.MyQuare.*;


public class Kreis implements Formen2D {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Kreis()
    {
        this(1);
    }
    public Kreis(double radius) {
        setRadius(radius);
    }

    @Override
    public double getUmfang() {
        return 2*(getRadius()*PI);
    }

    public double getFläche()
    {
        return getSquare(getRadius())*PI;
    }
}
