package org.noip.mrgreenleaves.chapter12.theorie.specialmethods;

public class ParameterInfo {
    public static void main(String[] args)
    {

        double invoiceAmount =0.00;

        invoiceAmount = Double.parseDouble(args[0]);

        for (int i =0; i < args.length; i++)

        {
            System.out.println();

            System.out.println("Array " +i);
            //args[0] = 1;
            System.out.println(args[i]);
        }

    }
}
