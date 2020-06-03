package org.noip.mrgreenleaves.chapter11;

public class GleichnichtGleich {

    public static void main(String[] args)
    {
        String s1 = "Text";
        String s2 = "Text";
        String s3 = new String("Text");
        String s4 = new String("Text");
        String s5 = "text";
        String s6 = new String ("text");
        String s7 = "text";


        System.out.println("s1 == s2 :" + (s1==s2));
        System.out.println("s2 == s3 :" + (s2==s3));
        System.out.println("s3 == s4 :" + (s3==s4));
        System.out.println("s5 == s2 :" + (s5==s2));
        System.out.println("s6 == s4 :" + (s6==s4));
        System.out.println("s6 == s5 :" + (s6==s5));
        System.out.println("s7 == s5 :" + (s7==s5));







    }
}
