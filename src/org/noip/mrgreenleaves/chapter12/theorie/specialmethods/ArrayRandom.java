package org.noip.mrgreenleaves.chapter12.theorie.specialmethods;
import java.util.Random;

public class ArrayRandom {

//make two methods one for double and one for int values
    public static double randomDoubleFill(){
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
    }

    public static int randomIntFill()
    {
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return  randomNum;
    }


//create output
    public static void main(String[] args)
    {
        System.out.println();
        // create a Random double Array
        System.out.println("Random double:");
               double[] test = new double[4];

        for (int i = 0; i < test.length; i++) {

            //fill the array with random variables use the double method
            test[i] = randomDoubleFill();
        }
        //for each loop to pint out each single item of the array
        for (double printOut : test)
            System.out.println(printOut);

        System.out.println();

        // create a Random integer Array
        System.out.println("Random integer");

        int[] test1 = new int[3];
        for(int i = 0; i < test1.length; i++)
        {
            // fill it with integer numbers using the integer Method
            test1[i] = randomIntFill();
        }

        //for each loop to pint out each single item of the array
        for (int printOut: test1)
            System.out.println(printOut);
        System.out.println();

        // create two Random integer Arrays
        System.out.println("Random with 3 Arrays");
        System.out.println();
        int[][] test2 = new int [3][2];

        for(int i = 0; i < test2.length;i++)
        {
            System.out.println("Array "+i);

            for (int j = 0; j < test2[i].length; j++)
            {
                // fill them with integer numbers using the integer Method
                test2[i] [j] =randomIntFill();
            }

            //for each loop to pint out each single item of both of the arrays
            for(int printOut: test2[i])
                System.out.println(printOut);
        }

   }
}
