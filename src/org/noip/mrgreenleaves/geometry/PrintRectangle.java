package org.noip.mrgreenleaves.geometry;

public class PrintRectangle {
    public static void main(String[] args)
    {
        Rectangle firstRectangle = new Rectangle(23.21, 234.23, true);

        System.out.printf("This rectangle with a length of %g and a width of %g has a circumference of %g and an area of %g and its filling status is %b. %n", firstRectangle.getLength(), firstRectangle.getWidth(), firstRectangle.getCircumference(), firstRectangle.getArea(), firstRectangle.getIsFilled());

    }
}


