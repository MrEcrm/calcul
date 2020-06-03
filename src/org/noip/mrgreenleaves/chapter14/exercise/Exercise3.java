package org.noip.mrgreenleaves.chapter14.exercise;

public class Exercise3 {

    public Exercise3()
        {
            //V1: input & output
            System.out.println("1011101 ist " + BinaryStringToNumber.parseBinary("1011101"));


            //v2: input
            String s = "10511011"; //5 ist das nicht zulässige zeichen, es kann nur 0 oder 1 sein.
            //String s = "1011101"; // würde das selbe resultat wie in zeile 7 ergeben.

            //v2output
            System.out.println(s + " ist " + BinaryStringToNumber.parseBinary(s));
        }
        public static void main(String[] args)
        {
            Exercise3 ConvertingBinary = new Exercise3();
        }
    }

