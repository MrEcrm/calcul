package org.noip.mrgreenleaves.chapter11;

public class WeitereMethoden {

    public static void main(String[] args)
    {

      String s = "Testen";

        char c = s.charAt(2);

        System.out.println(c);
        System.out.println();

        System.out.printf("%s endet auf en %b%n", s, s.endsWith("en") );

        String s2 = "Testen";
        String s3 ="en";
        String s4 = "    ";
        String s5 = "";

        System.out.printf("%s endet auf %s: %b%n", s, s2, (s.endsWith(s2)));
        System.out.println();


        int i = s.indexOf(s2);
        System.out.println(i);

        int i2 = s.indexOf(s3);
        System.out.println(i2);

        System.out.printf("%s ist leer: %b%n", s4, (s4.isEmpty()));
        System.out.printf("%s ist leer: %b%n", s5, (s5.isEmpty()));

        System.out.println();

        String s6 = String.join("*", "Text", "mit", "Trennzeichen", "Delimiter");
        System.out.println(s6);

        System.out.println();

        int len = s.length();
        System.out.println(len);

        //s = s.replace('x', 's');
        //s = s.replace("en", "tt");

        System.out.println(s);

        System.out.println();

        s = s.substring(3,6);
        System.out.println(s);

        String s7 = "Panama";
        s7 = s7.toUpperCase();
        System.out.println(s7);

        s7 = s7.toLowerCase();
        System.out.println(s7);

        String s8 = "    Text mit Abständen   ";
        String s9 = s8.trim();
        System.out.println(s8);
        System.out.println(s9);

        System.out.println();

        int i4 = 10;
        String s10;
        s10 = String.valueOf(i4);
        System.out.println(s10);




    }
}
