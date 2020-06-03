package org.noip.mrgreenleaves.geometry;

public class Execution {
    public static void main(String[] args)
    {

        Triangle aTriangle = new Triangle(2,4);
        Zircle aZircle = new Zircle(23.4);

        System.out.printf("This is a %s and its area is %g.%n", aTriangle.getClass(), aTriangle.getArea());
        System.out.printf("This is a %s and its area is %g. %n", aZircle.getClass(), aZircle.getArea());
    }
}
