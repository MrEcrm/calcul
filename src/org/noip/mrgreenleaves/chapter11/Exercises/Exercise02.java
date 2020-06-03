package org.noip.mrgreenleaves.chapter11.Exercises;

public class Exercise02
    {
        //2 Strings mit Familien Namen erstellen
        private String s1 = "Meier";
        private String s2 = "Mayer";

        //Konstruktor erstellen und PrintLetter mit s1 oder s2 befüllen

        public Exercise02()
        {
            printLetter(s1);
           printLetter(s2);
        }

        //Ausagbe Anweisung erstellen
        public static void main(String[] args)

        //neues Exercise objekt erstellen.

        {
            new Exercise02();
        }

        //methode erstellen zur ausgabe; mit String-Input als Argument verwenden
        public void printLetter (String Name)
        {

            //Stringbuffer erstellen
            StringBuffer sb = new StringBuffer();
            sb.append("Sehr geeerte Frau/Herr ");
            //den Input des Arguments nehmen und appenden
            sb.append(Name);
            sb.append(",\n");
            sb.append("Wir gratulieren Ihnen zur erfolgreichen Lösung der Prüfungsaufgabe");

           // System.out.println(sb); // geht ebenso
            //in einen String-Wert übergeben
            System.out.println(sb.toString());
            System.out.printf("%s %n", sb.toString());

        }
    }


