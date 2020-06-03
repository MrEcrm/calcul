package org.noip.mrgreenleaves.chapter11.again;

import java.awt.*;

public class basicCodes {

    public static void main(String[] args)
    {

        //s mehrfach beschreiben
        String s = "Good Monrning";

        // s wurde bereits als String definiert
        s = "Good evening";

        System.out.println(s);
        System.out.println();

        //printf

        String a = "Rechteck";
        int i = 4;

        String a1 = "Rechteck";

        System.out.printf("Ein %s hat %d Ecken%n", a, i);

        if(a1 == a) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        String s1 = "Develop";
        String s2 = "ment";
        System.out.println();
        System.out.println(s1+s2);

        String s3 = s1+s2;
        System.out.println(s3);

        System.out.printf("%s%s%n",s1,s2);
        System.out.println();

        String s5 = new String("Development");

        System.out.printf("%s and %s: Contains? %b%n", s3, s1, ((s3.contains(s1))));

        System.out.printf("%s and %s: CompareTo? %d%n", s3, (s1+s2), ((s3.compareTo(s1+s2))));


        //compare if Develop + ment = Development
        System.out.printf("%s and %s: %b%n", s1+s2, s3, (((s1+s2).equals(s3))));

        System.out.printf("%s and %s ends with ment %b%n", s3, s2, (s3.endsWith(s2)));
        System.out.printf("%s and %s starts with Develop %b%n", s3, s1, (s3.startsWith(s1)));




        s1=s1.toLowerCase();
        System.out.println(s1);
        //compare if Develop + ment = Development; result: no!
        System.out.printf("%s and %s: %b%n", s1+s2, s3, (((s1+s2).equals(s3))));

        //compare if Develop + ment = Development, ignoring cases; result: yes!
        System.out.printf("%s and %s: %b%n", s1+s2, s3, (((s1+s2).equalsIgnoreCase(s3))));

        System.out.printf("%s and %s: Contains? No! %b%n", s3, s1, ((s3.contains(s1))));

        System.out.printf("%s and %s: CompareTo? %d%n", s3, (s1+s2), (((s1+s2).compareTo(s3))));

        System.out.printf("%s and %s: CompareToIgnoreCases? %d%n", s3, (s1+s2), (((s1+s2).compareToIgnoreCase(s3))));

        s1 = s1.toUpperCase();
        System.out.println(s1);
        s1 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s1.charAt(0));
        System.out.println(s1.length());


        String s6 = "   Text    ";
        System.out.println(s6);
        System.out.println("s6:"+s6.trim());

        String s7 = s6.replace('x', 's');
        System.out.println(s7);

        String s8 = "";
        System.out.printf("%s is empty? yes! %b%n", s8, (s8.isEmpty()));

        int i2 = 234232;
        String s9;
        s9 = String.valueOf(i2);

        String s10 = String.valueOf(i2);
        System.out.println(i2);
        System.out.println("String s9:" + s9);
        System.out.println("String made directly s10:" +s10);

        System.out.println(s3);
        System.out.println(s2);

        int i3 = s3.indexOf(s2);
        System.out.println("s3 = Development index of s2 = ment; m von ment ist nummer 8; n-1 = 7 = v :" +i3);


        String s11 = String.join("-", "John", "Sue", "Anna");
        System.out.println(s11);

        String s12 = s3.substring(1,11);
        System.out.println(s12);

        s3 = s3.toUpperCase();
        String s13 = s3.substring(1,11).toLowerCase();
        System.out.println(s13);
        System.out.println(s3);
        System.out.println(s3.charAt(0)+s13);












    }
}
