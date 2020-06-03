package org.noip.mrgreenleaves.chapter14.retry02;

public class Exercise03 {
    public Exercise03()
    {
        System.out.println("10111011 ist " + BinaryStringToNumber.parseBinary("10111011"));
        String s = "10511011";
        System.out.println(s + " ist " + BinaryStringToNumber.parseBinary(s));
    }
    public static void main(String[] args)
    {
        Exercise03 ConvertingBinary = new Exercise03();
    }
}
