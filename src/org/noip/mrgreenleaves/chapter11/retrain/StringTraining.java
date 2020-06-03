package org.noip.mrgreenleaves.chapter11.retrain;

public class StringTraining {
    public static void main(String[] args)
    {

        String s1 = "Test";
        String a1 = new String("Test");
        String s2 = "Test";
        String s2v2 ="test";


        String s3 = "Develop";
        String s4 = "ment";
        String s4v2 ="Ment";

        String s5 = s3+s4;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s3+s4);

        //equals
        System.out.printf("%s and %s equals (true) %b%n", s1, s2, s1.equals(s2));
        System.out.printf("%s and %s equals (false) %b%n", s1, s2v2, s1.equals(s2v2));
        System.out.printf("%s and %s equals (true) ignore lowercase %b%n", s1, s2v2, s1.equalsIgnoreCase(s2v2));

        //contains
        System.out.printf("%s and %s contains (true) %b%n", s3, s5, s5.contains(s3));
        System.out.printf("%s and %s contains (false) does not ignore lowercase %b%n", s5, s4v2, s1.contains(s4v2));

        //equals
        System.out.printf("%s and %s compareTo (true) %d%n", s1, s2, s1.compareTo(s2));
        System.out.printf("%s and %s equals (false) %d%n", s1, s2v2, s1.compareTo(s2v2));
        System.out.printf("%s and %s equals (true) ignore lowercase %d%n", s1, s2v2, s1.compareToIgnoreCase(s2v2));

        if(s1==s2)
            System.out.println(true);
        else
            System.out.println(false);

        if(s1==s2v2)
            System.out.println(true);
        else
            System.out.println(false);

        System.out.printf("%s ends with (true) %s %b%n", s5, s4, s5.endsWith(s4));
        System.out.printf("%s ends with %s (false) %b%n", s5, s4v2, s5.endsWith(s4v2));

        System.out.printf("%s starts with (true) %s %b%n", s5, s3, s5.startsWith(s3));
        System.out.printf("%s starts with %s (false) %b%n", s5, s3, s5.startsWith(s3.toLowerCase()));

        String s6 = "";
        System.out.printf("%s isEmpty %b%n", s6, s6.isEmpty());
        System.out.printf("%s isblank %b%n", s6, s6.isBlank());

        String s7 = "    Test   ";
        System.out.println(s7);
        System.out.println(s7.trim());

        System.out.println(s7.length());
        String s8 = s7.trim();
        System.out.println(s8.length());

        System.out.println(s7.charAt(6));
        System.out.println(s7.toUpperCase());

        int i = 2345;
        String s9 = String.valueOf(i);
        System.out.println(s9);

        System.out.println(s7.substring(0,5));
        System.out.println(s1.replace('x', 's'));

        System.out.println(s5.indexOf(s4));

        String s10 = String.join(";","Joe", "Sue", "John");
        System.out.println(s10);









    }
}
