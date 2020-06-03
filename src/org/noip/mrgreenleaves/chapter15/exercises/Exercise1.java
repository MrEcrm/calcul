package org.noip.mrgreenleaves.chapter15.exercises;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.*;
import java.io.*;
import java.math.*;

//exercise zu random und array

public class Exercise1 {
    public static void main(String[] args)
    {

        try {
            System.setOut(new PrintStream(new FileOutputStream("OutPut.txt")));
        }

        catch (FileNotFoundException e)
        {
            System.out.println("Error in creating the file");
            System.exit(1);
        }
        //define variables for the max lenght of the arrays
        int DayCountMax = 14;
        int Measurements = 10;

        //create a randomVariable
        Random randomVariable = new Random();


        //create an two-dimensional array, with the 14 days as rows and the 10 measurements per day as columns
        int[][] tableMeasurements = new int[DayCountMax][Measurements];


        // create and initionalise the variables for average and average total
        long average = 0;
        long averageTotal = 0;


        //make a headline
        System.out.printf("Temperatures in Celsius%n-----------------------%n");

        //create the array with 14 rows (days) and 10 columns (measurements per day)
        for (int i = 0; i < DayCountMax; i++)
        {
            average = 0;
            //begin with 0 for each of the 14 days and re-do it until it is before 10 but not 10; 0 to 9 is 10 samples
            for(int j = 0; j < Measurements; j++)
            {
                //create a table with random variables
                tableMeasurements[i][j] = Math.abs(randomVariable.nextInt(15)+20);
                /*
                Math.abs(randomVariable.nextInt(15)+20) means the random values to 15
                this would generate from 0 to 15 numbers
                but it needs to be between 20 and 35
                therefore, add to each random value +20
                so that 0 = 20 at minimum
                and 15 = 35 maximum
                 */

                //print it out without a linebreak but with a space as a delimiter
                System.out.print(tableMeasurements[i][j] + " ");

                // sum up the table in i and j for all 10 measurements per day
                average+=tableMeasurements[i][j];
            }

            //we are still in a for-each loop for the 14 days
            // take the average (which contains the sum of each day's average and divide it by the total
            // of measurements taken per day and save it again into the variable: average
            average/=Measurements;

            // at each end of the day-row pint the day's average temperature
            System.out.println("Average Temperature is: " + average);
            // finally calculate the averageTotal
            averageTotal += average;

        }
        // we have left the for-each loops, both of them.
        System.out.println("The sum of each row day average total is is: " +averageTotal);

        //now calculate the sum of the averages of all days by the number of days and save that vaulue back to averageTotal
        averageTotal /=DayCountMax;

        //print it out
        System.out.println("Total average Temperature: " +averageTotal);
        System.out.println();
        LocalDate today = LocalDate.now();
        LocalTime rightNow = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);

        System.out.println("Created on:" +today+ " at "+rightNow);
        System.out.println("under " +System.getProperties().getProperty("os.name")+" "+System.getProperties().getProperty("os.version")+" bit version "+System.getProperties().getProperty("os.arch") +" and the java version is "+System.getProperties().getProperty("java.runtime.version"));


    }

}
