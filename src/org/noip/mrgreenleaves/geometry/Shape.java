package org.noip.mrgreenleaves.geometry;

public abstract class Shape {

    private boolean filled;

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

}
