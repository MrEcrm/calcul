package org.noip.mrgreenleaves.chapter12.theorie.specialmethods;

import java.util.Collections;

public class SortArryDescending {
    public static void main(String[] args)
    {
        Integer[] someNumbers = {11,23,4,17,6};
        java.util.Arrays.sort(someNumbers,
                Collections.reverseOrder());

        for(int value: someNumbers)
            System.out.println(value);

        System.out.println();
        String s = java.util.Arrays.toString(someNumbers);
        System.out.println(s);

    }
}

