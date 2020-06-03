package org.noip.mrgreenleaves.chapter12.theorie.specialmethods;

import java.util.Random;

public class NumberList {

    private static double[] anArray;

    public static double[] list(){
        anArray = new double[10];
        return anArray;
    }

    public static void print(){
        for(double n: anArray){
            System.out.println(n+" ");
        }
    }


    public static double randomFill(){
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
    }

    public static void main(String args[]) {
        list();
        for(int i = 0; i < anArray.length; i++){
            anArray[i] = randomFill();
        }
        print();
    }
}
