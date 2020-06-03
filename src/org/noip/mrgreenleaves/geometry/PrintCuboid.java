package org.noip.mrgreenleaves.geometry;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PrintCuboid {
    public static void main(String[] args)
    {
        Cuboid firstCuboid = new Cuboid(23, 22,21,false,true);
        //Typecast the Rectangle into a cuboid
        Rectangle forthRectangle = new Cuboid(23,22,21,false,true);
        // the reference variable forthRectangle refers to an object of a Cuboid type.
        Cuboid anotherCuboid = (Cuboid)forthRectangle;
        //if i wanted to create a cuboid only with the values and 1 indication of true of false, I would have to create the respective constructors

        System.out.printf("This cuboid has a length of %g and a width of %g and a height of %g, with a base of %g and an area of %g and a volume of %g. %nThe filling status of the base is %b and the filling status of the cuboid is %b%n", firstCuboid.getLength(), firstCuboid.getWidth(), firstCuboid.getHeight(), firstCuboid.getBase(), firstCuboid.getArea(), firstCuboid.getVolume(), firstCuboid.getIsFilledBase(), firstCuboid.getIsFilled());
        System.out.printf("This cuboid has a length of %g and a width of %g and a height of %g, with a base of %g and an area of %g and a volume of %g. %nThe filling status of the base is %b and the filling status of the cuboid is %b%n", anotherCuboid.getLength(), anotherCuboid.getWidth(), anotherCuboid.getHeight(), anotherCuboid.getBase(), anotherCuboid.getArea(), anotherCuboid.getVolume(), anotherCuboid.getIsFilledBase(), anotherCuboid.getIsFilled());

    }
}
