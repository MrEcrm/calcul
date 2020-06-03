package org.noip.mrgreenleaves.chapter12.theorie;

import javax.sound.midi.SysexMessage;

//copyOf(), copyOfRange(), --> java.util.Arrays.
// System.arraycopy()

public class CopyArray {

    //Ausgabe
    public static void main(String[] args)
    {

        //ein array mit 10 Werten erstellen; die werte beginnen bei 0 und erhöhen sich um 2 pro mal

        int[] field = new int [10];
        //array befüllen
        for(int i = 0; i<field.length;i++)
        {
            field[i] = 2*i;
            //Ausgabe machen

            System.out.printf("Element %d: %d%n", i, field[i]);
        }

        System.out.println();
        //die ersten 5 Arrays copieren mit copy of
        System.out.println("Die Ersten fünf Elemente:"); System.out.println();

        //copy machen mit copyOf
        int[] firstFive = java.util.Arrays.copyOf(field, 5);
        //kopie ausgeben
        for(int i =0; i < firstFive.length; i++)
            System.out.printf("Element %d: %d%n", i, firstFive[i]);

        System.out.println();
        //die Elemente 3-7 kopieren mit copyOfRange
        System.out.println("Element 3 bis Element 7:");System.out.println();
        int [] threetoSeven = java.util.Arrays.copyOfRange(field,3,7);

        //Ausgabe machen
        for(int i =0; i < threetoSeven.length; i++)
            System.out.printf("Element %d: %d three to seven %n", i, threetoSeven[i]);
        System.out.println();

        //kopieren mit System.arraycopy
        int[] lastTwoElements = new int[10];
        for(int i =0; i< lastTwoElements.length; i++)
        {
            lastTwoElements[i] = i;
            System.out.printf("Element %d: %d%n",i,lastTwoElements[i]);
        }

        System.out.println(lastTwoElements.length+ "Elemente");
        System.out.println();

        System.arraycopy(field,3, lastTwoElements,5,3);

        //Ausgabe machen
        for(int i = 0; i < lastTwoElements.length; i++)
            System.out.printf("Element %d: %d%n", i, lastTwoElements[i]);

    }



}
