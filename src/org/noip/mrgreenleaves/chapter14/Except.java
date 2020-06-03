package org.noip.mrgreenleaves.chapter14;

public class Except {
    public static void main(String[] args)
    {

        int field[] = new int[10];
        try
        {
            for (int j = 0; j <=field.length; j++)
                field[j] = j;
        }

        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Sie haben die Feldgrenzen verletzt");
            System.out.println();
            System.out.println("ex.getMessage()");
            System.out.println(ex.getMessage());
            System.out.println();
            System.out.println("ex.toString()");
            System.out.println(ex.toString());
            System.out.println();
            System.out.println();
            System.out.println("ex.getCause()");
            System.out.println(ex.getCause());
            System.out.println();

        }

    }
}
