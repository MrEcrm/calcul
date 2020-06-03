package org.noip.mrgreenleaves.geometry;

public class Triangle extends Shape {

    double base = 3.4;
    double altitude = 4.3;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public Triangle(double base, double altitude) {
        setBase(base);
        setAltitude(altitude);
    }

    double getArea()
    {
        return getAltitude()*getBase()/2;
    }

}
