package org.noip.mrgreenleaves.chapter11.Exercises02;

public class TestStringBuilder {

    //Variablen erstellen
    String s1 = "Sehr geehrte(r) Frau/Herr,";
    String s2 = "\nwir grautulieren Ihnen zur erfolgreichen Lösung der Prüfungsaufgabe";

    String n1 = "Meier";
    String n2 = "Müller";

    //Konstruktor erstellen

    public TestStringBuilder()
    {
        printLetter1(n1);
        printLetter1(n2);
    }

    //in Main Methode Ausgabe machen und objekt erstellen

    public static void main(String[] args) {

        new TestStringBuilder();
    }

    //ausgabemethode

    public void printLetter1(String name)
    {
        StringBuilder sbb = new StringBuilder();
        sbb.append(s1);
        sbb.append(s2);
        sbb.insert(25," "+name);
        System.out.println(sbb.toString());
    }

}
