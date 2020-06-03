package org.noip.mrgreenleaves.chapter14.andagain;

public class Exercise04 {
    public Exercise04()
    {
        try {
            System.out.println("10111011 ist " + BinaryStringToNumber.parseBinary("10111011"));
            String s = "10511011";
            System.out.println(s + " ist " + BinaryStringToNumber.parseBinary(s));
        }
        catch (NoBinaryNumberException p)
        {
            System.out.println("try und hier ist der catch");
            throw p;
        }
    }
    public static void main(String[] args)
    {
        Exercise04 ConvertingBinary = new Exercise04();
    }
}
