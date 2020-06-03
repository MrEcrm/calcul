package org.noip.mrgreenleaves.retestchapter10.defaultmethods;

public class PrintText01Rule02 implements Interface02Test{

    public static void main(String[] args)
    {
        ClasswithMethod test02 = new ClasswithMethod();

        test02.Text01();
        //Regel: wird ein Interface implementiert und gleichzeitig kommt eine Klasse zur anwendung, die eine selbige Methode wie das implementierte Interface verfügt, dann wird die Methode aus der Klasse eingesetzt
        // Erwartung: hallo aus der klasse
    }
}
