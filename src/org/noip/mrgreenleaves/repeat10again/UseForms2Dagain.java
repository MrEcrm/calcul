package org.noip.mrgreenleaves.repeat10again;


public class UseForms2Dagain {
    public static void main(String[] args)
    {
        Forms2D oneForm = new Rectangleagain(10,30);
        Forms2D twoForm = new Circleagain(22);

        System.out.printf("This oneForm has an area of %g and a perimetre of %g %n", oneForm.getAreaagain(), oneForm.getPerimetreagain());
        System.out.printf("This twoForm has an area of %g and a permietre of %g %n", twoForm.getAreaagain(), twoForm.getAreaagain());

        if(oneForm instanceof Forms2D)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        if(oneForm instanceof Rectangleagain)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        if(oneForm instanceof Circleagain)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }


    }
}
