package org.noip.mrgreenleaves.chapter14;

public class TryMyException {

    public static void main(String[] args)
    {
    int i = -1;

    try {
        if ((i < 1) || (i > 100))
           throw new IndexOutOfBoundsException("i liegt nicht im intervall 1...100");
            System.out.println("i ist zwischen 1 und 100");
    }


        catch(IndexOutOfBoundsException e)
        {
         throw e;
        }
    }

}
