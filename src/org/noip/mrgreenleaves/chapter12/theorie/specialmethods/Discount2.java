package org.noip.mrgreenleaves.chapter12.theorie.specialmethods;

public class Discount2 {
    public static void main(String[] args)
    {
        double invoiceAmount = 0.0;
        final double DISCOUNT_RATE = 0.05;
        double discountAmount = 0.0;

        invoiceAmount = Double.parseDouble(args[0]);

        if(invoiceAmount>1000)
        {
            discountAmount = invoiceAmount*DISCOUNT_RATE;
            System.out.printf("Sie erhalten %g Prozent bzw CHF %g Rabatt", DISCOUNT_RATE,discountAmount);
        }

        for(int i =0; i < args.length; i++)
        {
            System.out.println();
            System.out.println("Array " +i);
            System.out.println(args[i]);
        }

    }
}
