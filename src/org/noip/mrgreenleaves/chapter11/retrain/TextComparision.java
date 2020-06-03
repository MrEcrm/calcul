package org.noip.mrgreenleaves.chapter11.retrain;
import static java.lang.System.*;

public class TextComparision {

    public static void main(String[] args)
    {
        //mit equals - inkl ignore cases
        // mit comparTo - inkl ignore cases
        //mit contains
        //==

        String s1 = "text";
        String s2 = new String ("Text");
        String s3 = new String ("Context");
        String s4 = "text";

        out.println();
        out.println("Test 1 equals");
        out.printf("%s und %s : %b%n", s1, s2, (s1.equals(s2)));

        out.println();
        out.println("Test 1 equals ignore Cases");
        out.printf("%s und %s : %b%n", s1, s2, (s1.equalsIgnoreCase(s2)));

        out.println();
        out.println("Test 1 compareTo");
        out.printf("%s und %s : %d%n", s1, s2, (s1.compareTo(s2)));

        out.println();
        out.println("Test 1 comparetoIgnoreCases");
        out.printf("%s und %s : %d%n", s1, s2, (s1.compareToIgnoreCase(s2)));

        out.println();
        out.println("Test 1 contains");
        out.printf("%s und %s : %b%n", s3, s2, (s3.contains(s2)));

        out.println();
        out.println("Test 1 contains");
        out.printf("%s und %s : %b%n", s3, s1, (s3.contains(s1)));

        if(s1==s4)
            System.out.println("s1 == s4");






    }
}
