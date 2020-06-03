package org.noip.mrgreenleaves.retestchapter10;
import org.noip.mrgreenleaves.repeat10again.Forms2D2DAdapter;

import static java.lang.Math.PI;
import static org.noip.mrgreenleaves.geometry.MyQuare.*;

public class Kreis02 extends UseFormen2D02ZAdapter {
    private double radius2;

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    public Kreis02()
    {
        this(1);
    }
    public Kreis02(double radius2) {
        setRadius2(radius2);
    }

    @Override
    public double getFläche() {
        return getSquare(getRadius2()*PI);
    }

    @Override
    public double getUmfang() {
        return (2*getRadius2()*PI);
    }
}

