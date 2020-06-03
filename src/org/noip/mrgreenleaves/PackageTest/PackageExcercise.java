package org.noip.mrgreenleaves.PackageTest;

public class PackageExcercise {
    public static void main(String[] args)
    {

        //direktbezug auf eine Class

        org.noip.mrgreenleaves.geometry.Rectangle oneRect = new org.noip.mrgreenleaves.geometry.Rectangle(11,23,false);

        System.out.printf("The rectangle is %g long and %g large and its filling status is %b", oneRect.getLength(), oneRect.getWidth(), oneRect.getIsFilled());
    }
}
