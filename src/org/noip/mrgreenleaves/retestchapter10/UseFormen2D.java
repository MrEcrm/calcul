package org.noip.mrgreenleaves.retestchapter10;

public class UseFormen2D {

    public static void main(String[] args)
    {
        Formen2D viereck = new Viereck(12,10);
        Formen2D kreis = new Kreis(20);

        System.out.printf("%s hat einen Umfang von %g und eine Fläche von %g%n", viereck.getClass(), viereck.getUmfang(), viereck.getFläche());
        System.out.printf("%s hat einen Umfang von %g und eine Fläche von %g%n", kreis.getClass(), kreis.getUmfang(), kreis.getFläche());

        if(viereck instanceof Formen2D)
        {
            System.out.printf("%s ist eine Instanz von Formen2d %n", viereck.getClass());
        }
        else
        {
            System.out.printf("%s ist keine Instanz von Formen2d%n", viereck.getClass());
        }

        if(viereck instanceof Viereck)
        {
            System.out.printf("%s ist eine Instanz von Viereck %n", viereck.getClass());
        }
        else
        {
            System.out.printf("%s ist keine Instanz von Viereck%n", viereck.getClass());
        }
        if(viereck instanceof Kreis)
        {
            System.out.printf("%s ist eine Instanz von Formen2d %n", viereck.getClass());
        }
        else
        {
            System.out.printf("%s ist keine Instanz von Kreis%n", viereck.getClass());
        }



    }
}
