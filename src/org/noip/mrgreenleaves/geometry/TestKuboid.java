package org.noip.mrgreenleaves.geometry;

public class TestKuboid {

    public static void main(String[] args)
    {
        Kuboid oneKub = new Kuboid(12,14,13, false,true);

        System.out.printf("The base of the Cuboid is %g", oneKub.getBase());
    }
}
