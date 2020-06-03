package org.noip.mrgreenleaves.geometry;

public class Polymorphism {
    public static void main(String[] args)
    {
        Rectangle myRect = new Rectangle(1,4,true);
        Rectangle myQuad = new Cuboid(23, 11, 33, false, true);
        Rectangle myPyram = new Pyramid(11,22, false,33);

        System.out.printf("this is a rectangle with length of %g width of %g and the filling status is %b%n", myRect.getLength(), myRect.getWidth(), myRect.getIsFilled());
        System.out.printf("this is a cuboid with length of %g width of %g, and an area of % g and the filling status is %b%n", myQuad.getLength(), myQuad.getWidth(), myQuad.getArea(), myQuad.getIsFilled());
        System.out.printf("this is a rectangle with length of %g width of %g and an area of %g and the filling status is %b%n", myPyram.getLength(), myPyram.getWidth(), myPyram.getArea(), myPyram.getIsFilled());
    }
}
