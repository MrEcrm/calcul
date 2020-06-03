package org.noip.mrgreenleaves.repeat10again;

public interface Text {


    public default String supplyText()
    {
        return "Hallo aus dem Interface Text. String supplyText default methode ohne Ausgabe-Definition";
    }

    public default void writeText()
    {
        System.out.println("Hallo aus dem Interface Text. writeText() gibt den String aus");
    }

    public static void writeTextStatic()
    {
        System.out.println("Hallo aus dem Interface Text. Static Method braucht kein Objekt. Ausgabe bereits definiert");
    }
}
