package org.noip.mrgreenleaves.chapter10;
import org.noip.mrgreenleaves.geometry.*;


public class UseGeometry2D {
    public static void main(String[] args)
    {
        Geometry2D firstForm = new Rectangle2(10, 20);
        Geometry2D secondForm = new Circle02(13);
        Geometry2D thirdForm = new Cubic02(10, 20, 30);


        System.out.printf("This Rectangle has area of %g and a perimetre of %g%n", firstForm.getArea2(), firstForm.getPerimeter());
        System.out.printf("This one Circle has an area of %g and a perimetre of %g%n", secondForm.getArea2(), secondForm.getPerimeter());
        System.out.printf("This one Cuboid02 has an area of %g and a perimetre of %g%n", thirdForm.getArea2(), thirdForm.getPerimeter());


        if (firstForm instanceof Rectangle2)
        {
            System.out.printf("true%n");
        }

        else
        {
            System.out.printf("false%n");

        }

        if (firstForm instanceof Geometry2D)
        {
            System.out.printf("true%n");
        }
        else
        {
            System.out.printf("false%n");

        }

        if(firstForm instanceof Circle02)
        {
            System.out.printf("true");
        }
        else
        {
            System.out.printf("false%n");

        }


    }
}
