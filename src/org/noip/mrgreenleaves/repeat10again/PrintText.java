package org.noip.mrgreenleaves.repeat10again;

public class PrintText
        implements Text {

    public static void writeTextStatic()
    {
        System.out.println("Das ist ein override in der PrintText Class. Die Meldung aus dem Interface wird ersetzt");
    }

    //define printout

    public static void main(String[] args)
    {
        PrintText oneText = new PrintText();

        //supplytext hat keine Ausgabe, diese muss nun erst gemacht werden:

        System.out.println(oneText.supplyText());

        //text aus dem Interface, da static Method kein Object nötig
        Text.writeTextStatic();

        //objektgebundene Ausgabe der default-methode
        oneText.writeText();

        // nicht objektgebundene ausgabe der überschriebenen defaultmethode

        writeTextStatic();

        //statische methode über objekt ausgegeben, um die überschriebne defaultmethode zu nehmen.
        oneText.writeTextStatic();
    }
}
