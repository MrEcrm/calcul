package org.noip.mrgreenleaves.chapter12.theorie;

//Beispiel für Definition, Erzeugung und Initialisierung von Arrays
public class Beispiel01 {


   // Definition array mit 2 separaten Anweisungen mit 15 Elementen vom typ double:
    double[] field1;
    //field1 = new double[15];

    // Definition und Erzeugung array mit 20 Elementen vom type int:
    int[] field2 = new int[20];

    // aarays Definieren, mit individuellen Werten erzeugen
    //Feldelemente mit Literalen initialisieren
    double[] field3 = {1.2, 42.3, 27.0,12.567};

    int a = 1;
    int b = 6;
    int c = 4;

    //Ausdrücke verwenden
    int[] field4 ={a,b,c, a+b+c};

    /*
    public static void main(String[] args)
    {
     System.out.printf("%d%n", field2[]);
    }

     */
}
