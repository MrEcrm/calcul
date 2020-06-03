package org.noip.mrgreenleaves.chapter14.exercise;

public class Exercise5 {

     public Exercise5() {
         try {
             System.out.println("1011101 ist " + BinaryStringToNumber.parseBinary("1011101"));
             String s = "10511011"; //5 ist das nicht zulässige zeichen, es kann nur 0 oder 1 sein.
             //String s = "1011101"; // würde das selbe resultat wie in zeile 7 ergeben.
             System.out.println(s + " ist " + BinaryStringToNumber.parseBinary(s));
         } catch (NoBinaryNumberException e) {
             System.out.println("Konvertierung Fehlgeschlagen!");
             throw e;
         }
         finally{
             System.out.println("Programmende");
         }
     }
    public static void main(String[] args)
    {
        Exercise5 ConvertingBinary = new Exercise5();
    }

}
