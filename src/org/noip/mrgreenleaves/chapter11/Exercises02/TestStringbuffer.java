package org.noip.mrgreenleaves.chapter11.Exercises02;

public class TestStringbuffer {


    //Variablen erstellen
    String s1 = "Sehr geehrte(r) Frau/Herr,";
    String s2 = "\nwir grautulieren Ihnen zur erfolgreichen Lösung der Prüfungsaufgabe";

    String n1 = "Meier";
    String n2 = "Müller";

    //Konstruktor erstellen

    public TestStringbuffer()
    {
        printLetter(n1);
        printLetter(n2);
    }

    // objekt erstellen
    // und Ausgabe machen

    public static void main(String[] args) {

        new TestStringbuffer();
    }



        //Methode erstellen
        public void printLetter(String name)
        {
            StringBuffer sb = new StringBuffer();
            sb.append(s1);
            sb.insert(25," "+ name);
            sb.append(s2);
            String s = sb.toString();
            System.out.println(s);

        }

    }


