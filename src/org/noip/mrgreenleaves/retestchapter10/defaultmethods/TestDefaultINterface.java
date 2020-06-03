package org.noip.mrgreenleaves.retestchapter10.defaultmethods;

public interface TestDefaultINterface {


    public default String Text01()
    {
        return "Hallo, das ist eine String Message ohne Ausgabe im Interface.";
    }

    public default void Text02()
    {
        System.out.println("Das ist der Text02 mit Ausgabe im Interface");
    }

    static void Text03()
    {
        System.out.println("Das ist ein Text03 aus dem Interface mit Ausgabe");
    }
}
