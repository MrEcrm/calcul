package org.noip.mrgreenleaves.testpackage;
import org.noip.mrgreenleaves.geometry.Cuboid;
import org.noip.mrgreenleaves.geometry.*;
import static org.noip.mrgreenleaves.geometry.Formula.getSquare;
import static org.noip.mrgreenleaves.geometry.MyQuare.*;
//import static org.noip.mrgreenleaves.geometry.MyQuare.MYPI;


public class UsePackage {

    public static void main(String[] args)
    {
        /*
        //direkter Zugriff via Qualified Classname
        org.noip.mrgreenleaves.geometry.Cuboid oneCub = new org.noip.mrgreenleaves.geometry.Cuboid();

*/
        Cuboid oneCub = new Cuboid(11,12,14,true, false);
        Pyramid onePyr = new Pyramid(22,23,false,44);
        double inputValue = 4;

        System.out.printf("Der Quader hat eine Form von %g x %g x %g, und die Oberfläche ist %g%n", oneCub.getLength(), oneCub.getLength(), oneCub.getHeight(), oneCub.getArea());
        System.out.printf("Die Pyramide hat eine Form von %g x %g x %g Höhe, und eine Fläche von %g%n", onePyr.getLength(), onePyr.getWidth(), onePyr.getHeight(), onePyr.getArea());

        double result = getSquare(inputValue)*MYPI;
        System.out.printf("The value is %g and PI is %g and the test is %g", inputValue, MYPI, result );
    }
}
