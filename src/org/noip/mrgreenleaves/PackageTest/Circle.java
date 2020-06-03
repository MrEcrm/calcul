package org.noip.mrgreenleaves.PackageTest;
import org.noip.mrgreenleaves.geometry.*;
import static org.noip.mrgreenleaves.geometry.MyQuare.*;
import static org.noip.mrgreenleaves.geometry.MyQuare.MYPI;
//import static org.noip.mrgreenleaves.geometry.Formula.getSquare;

public class Circle {
    public static void main(String[] args)
    {
        Zircle testZircle = new Zircle(22);

        double area = getSquare(testZircle.getRadiuz())*MYPI;

        System.out.println(area);

        MyQuare test1 = new MyQuare();

        System.out.println(test1.MYPI);

    }
}
