package org.noip.mrgreenleaves.chapter11;

public class PrintfString {


    public static void main(String[] args) {
        String text = "Rechteck";

        int i = 4;

        System.out.printf("Ein %s hat %d Ecken", text, i);


        String s1 ="Develop";
        String s2 = "ment";

        System.out.println();

        System.out.println(s1+s2);
        System.out.printf("%s%s%n",s1,s2);
        System.out.println();
        String s3 = s1+s2;
        System.out.printf("%s", s3);

    }
}
