package org.noip.mrgreenleaves.PackageTest;
import org.noip.mrgreenleaves.geometry.*;

public class PackageExercise03 {
    public static void main(String[] args)
    {
        Cuboid newCuboid = new Cuboid(11, 12, 55, true, false);


        System.out.printf("The cuboid is %g long, %g large, %g high and the base is filled? %b! but the volume is filled? %b!", newCuboid.getLength(), newCuboid.getWidth(), newCuboid.getHeight(), newCuboid.getIsFilledBase(), newCuboid.getIsFilled());
    }
}
