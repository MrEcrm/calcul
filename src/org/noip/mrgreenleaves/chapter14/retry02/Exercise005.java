package org.noip.mrgreenleaves.chapter14.retry02;

public class Exercise005 {
    public Exercise005()
    {
        try {
            System.out.println("10111011 ist " + BinaryStringToNumber.parseBinary("10111011"));
            String s = "10511011";
            System.out.println(s + " ist " + BinaryStringToNumber.parseBinary(s));
        }
        catch (NoBinaryNumberException p)
        {
            System.out.println("epic fail");
            throw p;
        }
        finally {
            System.out.println("Das letzte Wort haben.");
        }
    }
    public static void main(String[] args)
    {
        Exercise005 ConvertingBinary04 = new Exercise005();
    }
}
