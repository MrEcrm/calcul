package org.noip.mrgreenleaves.chapter14.onemoretime;

public class Exercise05 {
    public Exercise05()
    {
        try {
            System.out.println("10111011 ist " + BinaryStringToNumber.parseBinary("10111011"));
            String s = "10511011";
            System.out.println(s + " ist " + BinaryStringToNumber.parseBinary(s));
        }
        catch (NoBinaryNumberException p)
        {
            System.out.println("achtung, wir haben ein Problem mit ");
            throw p;
        }
        finally {
            System.out.println("das ist nun das ende");
        }
    }
    public static void main(String[] args)
    {
        Exercise05 ConvertingBinary = new Exercise05();
    }
}
