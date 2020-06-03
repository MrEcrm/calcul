package org.noip.mrgreenleaves.chapter11.Exercises;

public class Exercises {
    public static void main(String[] args) {

        String s1 = "Meier";
        String s2 = "Mayer";

        if (s1.compareTo(s2) == 0)
        {
            System.out.println(s1);
            System.out.println(s2);
            //reihenfolge egal, weil s1 und s2 identisch sind
        }

        if (s1.compareTo(s2) > 0)
        {
            System.out.println(s2);
            System.out.println(s1);
            System.out.printf("the value is now %d%n", s1.compareTo(s2));

        }


        if (s1.compareTo(s2) < 0)
        {
            System.out.println(s1);
            System.out.println(s2);
            System.out.printf("the value is %d%n", s1.compareTo(s2));

            System.out.println();

        }


        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());
    }
}
