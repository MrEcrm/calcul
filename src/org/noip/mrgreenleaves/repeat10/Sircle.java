package org.noip.mrgreenleaves.repeat10;
import static java.lang.Math.PI;
import static org.noip.mrgreenleaves.geometry.MyQuare.*;

public class Sircle implements Formen {

    private double ratuiz;

    public double getRatuiz() {
        return ratuiz;
    }

    public void setRatuiz(double ratuiz) {
        this.ratuiz = ratuiz;
    }

    public Sircle()
    {
        this(1);
    }
    public Sircle(double ratuiz) {
        setRatuiz(ratuiz);
    }

    @Override
    public double getUmfang() {
        return 2*getRatuiz()*PI;
    }

    @Override
    public double getFlaeche() {
        return getSquare(getRatuiz())*PI ;
    }
}
