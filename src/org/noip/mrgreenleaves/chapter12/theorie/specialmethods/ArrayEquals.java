package org.noip.mrgreenleaves.chapter12.theorie.specialmethods;

public class ArrayEquals {

    public static void main(String[] args) {

        int[] test1 = new int[12];
        System.out.println("Array 1");

        for (int i = 0; i < test1.length; i++)
        {
            test1[i] = i+1;


            System.out.println(test1[i]);
        }

        System.out.println();
        System.out.println("Copy the array");

        int[] test2 = java.util.Arrays.copyOf(test1,12);
        System.out.println();
        System.out.println("Array 2");
        for(int array2: test2)
            System.out.println(array2);

        System.out.println();

        //if the statement below is commented, the arrays are identical, if un-commented they are NOT identical
       // test2[4] = 22;

        if(java.util.Arrays.equals(test1,test2))
        {
            System.out.println("The arrays are identical");
        }
        else
        {
            System.out.println("The arrays are NOT identical");
        }

    }
}
