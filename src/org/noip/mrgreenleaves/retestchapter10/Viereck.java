package org.noip.mrgreenleaves.retestchapter10;

public class Viereck implements Formen2D{

    private double laenge;
    private double breite;

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public Viereck()
    {
        this(1,1);
    }
    public Viereck(double laenge, double breite) {
        setLaenge(laenge);
        setBreite(breite);
    }

    @Override
    public double getUmfang() {
        return (2*(getBreite()*getLaenge()));
    }

    @Override
    public double getFläche() {
        return getBreite()*getLaenge();
    }
}
