package org.noip.mrgreenleaves.PackageTest;
import org.noip.mrgreenleaves.geometry.Rectangle;

public class PackageExercise02 {
    public static void main (String[] args)
    {

        Rectangle newRect = new Rectangle(44,55,true);

        System.out.printf("This is a Rectangle with a length of %g, a width of %g, and its filling status is %b, while the area is %g", newRect.getLength(), newRect.getWidth(), newRect.getIsFilled(), newRect.getArea());



    }
}
