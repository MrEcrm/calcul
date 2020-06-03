package org.noip.mrgreenleaves.retestchapter10.defaultmethods;

public class TextImplementierungdirekt implements TestDefaultINterface {

    // zuerst einen Override des Textes03 machen



    public static void Text03() {
        System.out.println("Das ist ein in der Klasse überschriebener Text03");
    }

    //Ausgabe programmieren

    public static void main(String[] args)
    {
        //text objekt erstellen
        TestDefaultINterface text01 = new TextImplementierungdirekt();
        //für den Text 01 muss erst noch eine Ausgabe gemacht werden.

        System.out.println(text01.Text01());

        //Ausgabe Text 02
        text01.Text02();

        //Ausgabe Text03 direkt aus interface möglich, da static

        TestDefaultINterface.Text03();

        //Ausgabe Text03 aus override

        Text03();

        //ausgabe Text03 aus override mit angabe des objektes

        TextImplementierungdirekt.Text03();


    }
}
