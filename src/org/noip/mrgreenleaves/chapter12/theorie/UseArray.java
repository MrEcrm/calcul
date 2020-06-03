package org.noip.mrgreenleaves.chapter12.theorie;

public class UseArray {
    public static void main(String[] args)
    {
        //definition von Variablen
        int a = 2;
        int b = 6;

        //Definition und Erzeugung und Initialisierung eines Arrays mit individuellen Werten, das aus 4 elementen besteht, das 4. Element wird zusammengebaut
        int[] field = {3,4,5, a+b};

        //Wertzuweisung an das dritte Feldelement (0, 1,2 ) die Nummer 5 wird also mit der Nummer 7 überschrieben
        field[2] = 7;

        //Ausgabe, wieviele Elemente es gibt mit field.length
        System.out.printf("Anzahl Elemente: %d %n", field.length);

        //für jedes Array-Element wird der Index und der Wert ausgegeben

        for (int i = 0; i < field.length; i++)
        System.out.printf("Element %d: %d%n", i, field[i]);

    }
}
