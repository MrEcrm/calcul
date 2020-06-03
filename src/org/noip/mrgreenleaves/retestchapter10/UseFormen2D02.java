package org.noip.mrgreenleaves.retestchapter10;

public class UseFormen2D02 {

    public static void main(String[] args)
    {
        Formen2D02z kreis02 = new Kreis02(22);

        System.out.printf("%s hat eine Fläche von %g und einen Umfang von %g%n", kreis02.getClass(), kreis02.getFläche(), kreis02.getUmfang());

        if(kreis02 instanceof Formen2D02z)
        {
            System.out.printf("%s ist eine Instanz von Formen2D02%n", kreis02.getClass());
        }
        else
        {
            System.out.printf("%s ist keine Instanz von Formen2D02%n", kreis02.getClass());
        }
        if(kreis02 instanceof Kreis02)
        {
            System.out.printf("%s ist eine Instanz des Objektes Kreis02%n", kreis02.getClass());
        }
        else
        {
            System.out.printf("%s ist keine Instanz des Objektes Kreis02%n", kreis02.getClass());
        }
    }
}
