package org.noip.mrgreenleaves.chapter15.zufallszahlen.theorie;

import java.util.Random;

public class Gauss {
    public static void main(String[] args)
    {
        // anzahl Messwerte = 35
        int n = 35;

        //zufallsgenerator objekt ohne seed erstellt
        Random rd = new Random();

        //Array x erstellen, es soll der Abspeicherung der emittelten zufallszahlen dienen
        double[] x = new double[n];

        //variablen mittel und streuung erstellen und mit 0.0 initiieren
        double mittel = 0.0;
        double streuung = 0.0;

        //wiederholter aufruf
        for(int i =0; i<n; i++)
        {
            //x werte werden mit nextGaussian() erzeugt und in der Array x abgespeichert
            x[i] = rd.nextGaussian();

            //für die berechnung des mittelwertes werden die Zufallszahlen aufsummiert
            mittel += x[i];
        }

        //berechnung des mittelwertes Summe dividiert durch die n Messerte
        mittel /=n;

        //für alle Elemente im Array x
        for(double g: x)
        {
            //wird die Streuung aufsummiert
            streuung += (g-mittel) * (g-mittel);

            //berechnung der steuung (((1/((n-1))* Summe von = ((x(i)-mittel)^2)) ^(- (1/2))
            //berechnung der steuung ((1/((n-1))* streuung)^(-(1/2))
            streuung = Math.sqrt(streuung/(n-1));


        }
        //ausgabe der endergebnisse
        System.out.println();
        System.out.println("End-Ergebnisse");
        System.out.println("arithmetischer Mittelwert: "+ mittel);
        System.out.println("Streuung: " + streuung);
    }
}
