package org.noip.mrgreenleaves.chapter10;

public class PrintExercise {

    public static void main(String[] args)
    {

        Rectangle2 oneRect = new Rectangle2(10, 20);
        Circle02 oneCircle = new Circle02(13);


        System.out.printf("This Rectangle is %g long and %g wide and, therefore, it has an area of %g and a perimetre of %g%n", oneRect.getLength(), oneRect.getWidth(), oneRect.getArea2(), oneRect.getPerimeter());
        System.out.printf("This one Circle has a %g radius and, therefore, it has an area of %g and a perimetre of %g%n", oneCircle.getRadius2(), oneCircle.getArea2(), oneCircle.getPerimeter());
    }


}
