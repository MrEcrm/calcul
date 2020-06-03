package org.noip.mrgreenleaves.repeat10again;

public class UseForms2Adapter {
    public static void main(String[] args)
    {
        Forms2D2 oneForm2 = new Rectangleagain2(34, 25);

        System.out.println(oneForm2.getAreaagain());
        System.out.println(oneForm2.getPerimetreagain());

        if(oneForm2 instanceof Forms2D2)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        if(oneForm2 instanceof Forms2D)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        if(oneForm2 instanceof Rectangleagain2)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        if(oneForm2 instanceof Rectangleagain)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        if(oneForm2 instanceof Forms2D2DAdapter)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
