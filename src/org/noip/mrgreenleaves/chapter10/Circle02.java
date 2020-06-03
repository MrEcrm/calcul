package org.noip.mrgreenleaves.chapter10;
import static java.lang.Math.PI;
import static org.noip.mrgreenleaves.geometry.MyQuare.*;

public class Circle02
        implements Geometry2D {

    private double radius2;

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    public Circle02() {
        this(1);
    }

    public Circle02(double radius2) {
        setRadius2(radius2);
    }


    @Override
    public double getArea2() {
        return getSquare(radius2)*PI;
    }

    public double getPerimeter()
    {
        return 2 * getRadius2()*PI;
    }
}
