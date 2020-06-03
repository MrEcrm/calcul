package org.noip.mrgreenleaves.chapter14.twistagain;

public class Exercise05 {
    public Exercise05()
    {
        try {
            System.out.println("10111011 ist " + BinaryStringToNumber.parseBinary("10111011"));
            String s = "10511011";
            System.out.println(s + " ist " + BinaryStringToNumber.parseBinary(s));
        }
        catch (NoBinaryNumberException x)
        {
            System.out.println("ein weiterer Ausgabetext");
            throw x;
        }

        finally {
            System.out.println("this is the finally statement");
        }
    }
    public static void main(String[] args)
    {
        Exercise05 ConvertingBinary = new Exercise05();
    }
}
