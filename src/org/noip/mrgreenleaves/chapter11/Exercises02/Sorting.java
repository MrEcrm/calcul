package org.noip.mrgreenleaves.chapter11.Exercises02;

public class Sorting {
    public static void main(String[] args)
    {
        String s1 = "Meier";
        String s2 = "Mayer";
        s1= s1.toLowerCase();
       s2= s2.toLowerCase();



        if(s1.compareTo(s2)==0)
        {
            System.out.println(s1);
            System.out.println(s2);
        }
        else if( s1.compareTo(s2)>0)
        {
            System.out.println(s2);
            System.out.println(s1);
        }
        else if(s1.compareTo(s2)<0)
        {
            System.out.println(s1);
            System.out.println(s2);
        }



    }
}
