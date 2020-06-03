package org.noip.mrgreenleaves.chapter11.Exercises;

public class Exercise04 {

    // Erstellen der Strings

    private String s1 = "Mayer";
    private String s2 = "Müller";

    //Konstruktor erstellen und strings zuweisen

    public Exercise04()
    {
        printLetter1(s1);
        printLetter1(s2);
    }

    //Ausgabe erfassen
    public static void main(String[] args) {
        //objekt erstellen
        new Exercise04();
    }

        //methode erstellen
        public void printLetter1(String name1)
        {
            StringBuilder abb = new StringBuilder();
            abb.append("Sehr geehrter Herr/Frau,");
            abb.append("\nwir gratulieren Ihnen zur erfolgreichen Lösung der Prüfung");
            abb.insert(23, " "+22+name1);
            System.out.println(abb.toString());

        }


    }
