package org.noip.mrgreenleaves.chapter10;
import static java.lang.Math.PI;


public class Circle0202 extends Geometry2D2Adapter {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle0202()
    {
        this(1);
    }
    public Circle0202(double radius) {
        setRadius(radius);
    }

    @Override
    public double getArea2() {
        return PI*getRadius()*getRadius();
    }

    @Override
    public double getPerimeter() {
        return PI*2*getRadius();
    }

    //vorhandene Methode turn90 in der Adapter-Klasse zwar implementiert, hier aber nicht verwendet, darum weggelassen
}
