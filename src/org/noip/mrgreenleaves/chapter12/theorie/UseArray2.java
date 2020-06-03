package org.noip.mrgreenleaves.chapter12.theorie;

public class UseArray2 {
    public static void main(String[] args)
    {
        //direkt ein Array mit individuellen Werten erstellen
        int[] TestBeispiel = {23,22,12,456,6754, 657, 567, 657, 57,673,3,345,7};

        //Ausgabe der Array länge
        System.out.printf("Das Array hat %d Elemente%n", TestBeispiel.length);

        //Ausgabe des gesamten Arrays
        for(int i =0; i<TestBeispiel.length; i++)
            System.out.printf("%d | %d%n", i, TestBeispiel[i]);
        System.out.println("test");

    }
}
