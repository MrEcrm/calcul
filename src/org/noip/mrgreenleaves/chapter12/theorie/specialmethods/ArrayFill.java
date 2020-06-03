package org.noip.mrgreenleaves.chapter12.theorie.specialmethods;

public class ArrayFill {

    public static void main(String[] args)
    {
        System.out.println("with only one array");
        int [] test = new int[23];

        for(int i = 0; i < test.length; i++)
        {
            java.util.Arrays.fill(test, 23);
        }

        for(int foreach: test)
            System.out.println(foreach);
        String s = java.util.Arrays.toString(test);
        System.out.printf("%s \n as a toString", s);

        System.out.println();
        System.out.println("with mutltiple arrays");

        int [] [] test1 = new int[3][7];

        for(int i = 0; i < test1.length; i++)
        {
            System.out.println("array " +i);
            System.out.println();
            for (int j = 0; j < test1[i].length; j++)
                java.util.Arrays.fill(test1[i], 22);

            for(int foreach: test1[i])
                System.out.println(foreach);


         }

    }
}
