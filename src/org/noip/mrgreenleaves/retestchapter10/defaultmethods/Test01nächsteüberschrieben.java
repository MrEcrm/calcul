package org.noip.mrgreenleaves.retestchapter10.defaultmethods;

public class Test01nächsteüberschrieben implements Interface02Test {

    public static void main(String[] args)
    {
        Test01nächsteüberschrieben text001 = new Test01nächsteüberschrieben();

        text001.Text01();
        //erwartung: Hallo aus dem Interface02Test
        // Regel: wird eine Default-Methode überschrieben und existiert ein Interface mit denselben Methoden, dann wird die am nächsten stehende Methode (also jene aus der implementierten) eingesetzt
    }
}
