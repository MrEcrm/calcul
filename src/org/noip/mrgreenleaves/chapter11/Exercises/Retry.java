package org.noip.mrgreenleaves.chapter11.Exercises;

import javax.swing.*;

public class Retry {

       //variablen definieren
        String s1 = "Sehr geehrte/r Frau/Herr,";
        String s2 = "\nWir Gratulieren Ihnen zur Lösung der Aufgabe - Sie haben die Prüfung bestanden\nBeste Grüsse\nEric Mayer\nDirector Educations\n\n";

        String n1 = "Streber";
        String n2 = "Collodi";

        //Konstruktor erstellen

        Retry()
        {
            //sortierung programmieren alphabetical sort order

            if(n1.compareTo(n2)>=0)
            {
                printLetter(n2);
                printLetter(n1);
            }
            else
            {
                printLetter(n1);
                printLetter(n2);
            }


        }

        //objekt erstellen
        public static void main(String[] args)
        {
            Retry test = new Retry();
        }

        public void printLetter(String name)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(s1);
            sb.append(s2);
            sb.insert(24, " "+name);
            System.out.println(sb.toString());
        }

}
