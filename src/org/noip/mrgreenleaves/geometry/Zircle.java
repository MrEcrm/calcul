package org.noip.mrgreenleaves.geometry;
import static java.lang.Math.PI;

public class Zircle extends Shape
{

    double radiuz = 32.4;

    public double getRadiuz() {
        return radiuz;
    }

    public void setRadiuz(double radiuz) {
        this.radiuz = radiuz;
    }

    public Zircle(double radiuz) {
        setRadiuz(radiuz);
    }

    double getArea()
    {
        return Formula.getSquare(getRadiuz())*3.14159;
    }


}
