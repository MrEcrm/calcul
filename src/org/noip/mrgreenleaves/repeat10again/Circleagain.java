package org.noip.mrgreenleaves.repeat10again;
import static org.noip.mrgreenleaves.geometry.MyQuare.*;
import static java.lang.Math.PI;

public class Circleagain implements Forms2D{

    private double radiusagain;

    public double getRadiusagain() {
        return radiusagain;
    }

    public void setRadiusagain(double radiusagain) {
        this.radiusagain = radiusagain;
    }

    public Circleagain()
    {
        this(1);
    }

    public Circleagain(double radiusagain) {
    setRadiusagain(radiusagain);
    }

    @Override
    public double getAreaagain() {
        return getSquare(getRadiusagain())*PI;
    }

    @Override
    public double getPerimetreagain() {
        return 2*getRadiusagain()*PI;
    }
}
