package org.noip.mrgreenleaves.chapter10;

public class UseCircle0202 {
    public static void main(String[] args)
    {
        Geometry2D2 oneTest = new Circle0202(23);

        System.out.printf("The Circle 0202 has an area of %g and a Perimeter of %g%n", oneTest.getArea2(), oneTest.getPerimeter());


        if(oneTest instanceof Geometry2D)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("false");
        }
        if(oneTest instanceof Circle0202)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("false");
        }
    }
}
