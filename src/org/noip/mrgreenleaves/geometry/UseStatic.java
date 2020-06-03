package org.noip.mrgreenleaves.geometry;

public class UseStatic {
    public static void main(String[] args)
    {
        double inputValue = Double.parseDouble(args [0]);

        double result = Formula.getSquare(inputValue);
        System.out.printf("The value is %g", result);

    }
}
