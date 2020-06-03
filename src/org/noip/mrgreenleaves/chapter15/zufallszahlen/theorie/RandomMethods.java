package org.noip.mrgreenleaves.chapter15.zufallszahlen.theorie;

import java.util.Random;

public class RandomMethods {
    public static void main(String[] args)
    {
        int n = 100;
        Random rd = new Random();
        double randomNum = rd.nextDouble();
        System.out.println("Double " +randomNum);
        System.out.println();

        Random rd1 = new Random();
        int randomNum1 = rd1.nextInt();
        System.out.println("int "+randomNum1);
        System.out.println();

        Random rd2 = new Random();
        long randomNum2 = rd2.nextLong();
        System.out.println("long "+randomNum2);
        System.out.println();

        Random rd3 = new Random();
        float randomNum3 = rd3.nextFloat();
        System.out.println("float "+randomNum3);
        System.out.println();

        Random rd4 = new Random();
        boolean randomNum4 = rd4.nextBoolean();
        System.out.println("boolean "+randomNum4);
        System.out.println();

        Random rd5 = new Random();
        double randomNum5 = rd5.nextGaussian();
        System.out.println("double nextGaussian "+randomNum5);
        System.out.println();

        Random rd6 = new Random();
        int randomNum6 = rd6.nextInt(200);
        System.out.println("int nextInt(200) "+randomNum6);
        System.out.println();

        Random rd7 = new Random( 200);
        double randomNum7 = rd7.nextDouble();
        System.out.println("double seed "+randomNum7);
        System.out.println();

        //seed mit int machen
        Random rd8 = new Random( 200);
        int randomNum8 = rd8.nextInt();
        System.out.println("int seed "+randomNum8);
        System.out.println();

        //seed mit nextGaussian machen
        Random rd9 = new Random( 200);
        double randomNum9 = rd9.nextGaussian();
        System.out.println("gaussian seed "+randomNum9);
        System.out.println();

        //setSeed ausprobieren
        Random rd10 = new Random();
        rd10.setSeed(200);
        int randomNum10 = rd10.nextInt();
        System.out.println("rd10.setSeed(200) \nrd10.nextInt() "+randomNum10);
        System.out.println();

        //setSeed ausprobieren
        Random rd11 = new Random();
        rd10.setSeed(200);
        double randomNum11 = rd11.nextDouble();
        System.out.println("rd11.setSeed(200) \nrd11.nextDouble() "+randomNum11);
        System.out.println();

        //setSeed ausprobieren
        Random rd12 = new Random();
        rd10.setSeed(200);
        double randomNum12 = rd12.nextGaussian();
        System.out.println("rd12.setSeed(200) \nrd12.nextGaussian() "+randomNum12);
        System.out.println();

        //setSeed ausprobieren
        Random rd13 = new Random();
        rd10.setSeed(200);
        long randomNum13 = rd13.nextLong();
        System.out.println("rd13.setSeed(200) \nrd13.nextLong() "+randomNum13);
        System.out.println();

        //setSeed ausprobieren
        Random rd14 = new Random();
        rd10.setSeed(200);
        boolean randomNum14 = rd14.nextBoolean();
        System.out.println("rd14.setSeed(200) \nrd14.nextBoolean() "+randomNum14);
        System.out.println();

        //nextBytes(byte[] bytes) ausprobieren
        //setSeed ausprobieren
        Random rd15 = new Random();
        byte[] randomByte = new byte[30];
        rd15.nextBytes(randomByte);
        System.out.println("Value of the byte array: " +randomByte);
        for(byte x: randomByte)
            System.out.println(x);



    }
}
