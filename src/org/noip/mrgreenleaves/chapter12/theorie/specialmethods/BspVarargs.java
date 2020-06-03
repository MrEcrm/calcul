package org.noip.mrgreenleaves.chapter12.theorie.specialmethods;

public class BspVarargs {



    //constructor
    //Definition of the Method method name = class name; its a constructor!
    BspVarargs()
    {
        //definition of the variable result using the method average and its parameters
        double result1 = average(1.2, 9.3, 4.5, 6.7);
        double result2 = average(4.8, 9.2);
        //anonymous array!
        double result3 = average(new double[]{4.8, 9.2});

        //Printing the result
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    //create an object
    public static void main(String[] args)
    {
     // create an object to work on
     new BspVarargs();
    }
    //define a method
    //create the average method and its arguments which the method contain
    double average(double ... values)
    {
        //build the average logic: average is sum divided by number of array

        //ccreate the sum variable
        double sum = 0.0;

        //creae a for-eachloop
        for(double d: values)
            //define what it needs to to within this foreach loop
            //sum up each value and return int to sum
            sum +=d;
        //finally divide the sum by the length of the array
        // which will be returned to the Method, as there is no void statement
        return sum/values.length;

    }


}
