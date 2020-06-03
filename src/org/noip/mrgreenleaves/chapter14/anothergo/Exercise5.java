package org.noip.mrgreenleaves.chapter14.anothergo;

public class Exercise5 {
    public Exercise5()
    {
        try {
            System.out.println("10111011 ist " + BinaryStringToNumber.parseBinary("10111011"));
            String s = "10511011";
            System.out.println(s + " ist " + BinaryStringToNumber.parseBinary(s));
        }
        catch (NoBinaryNumberException t)
        {
            System.out.println("This is the error message from the catch");
            throw t;
        }
        finally {
            System.out.println("This is the message from the finally: Game over");
        }
    }
    public static void main(String[] args)
    {
        Exercise5 ConvertingBinary = new Exercise5();
    }
}
