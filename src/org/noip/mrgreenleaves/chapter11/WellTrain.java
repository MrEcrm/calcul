package org.noip.mrgreenleaves.chapter11;

public class WellTrain {
    public static void main(String[] args)
    {
        String s1 = "Text";
        String s2 = "Text";
        String s3 = "text";
        String s4 = new String("Text");

        if(s1==s2)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        if(s1==s3)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
        if(s1==s4)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        //erwartung 1 x true, 2 x false

        String s5 = "Develop";
        String s6 = "ment";
        String s8 = "Shipment";

        String s7 = s5+s6;

        System.out.println("Ways of Building Development");
        System.out.println(s5+s6);
        System.out.println(s7);

        //equals
        System.out.printf("%s equals %s, True? %b!%n", s5, s7, ((s5+s6).equals(s7)));

        //lowercase
        String s9 = s7.toLowerCase();
        System.out.println(s9);

        //equals ignore lower case
        System.out.printf("%s equals %s, True? ignore cases! %b!%n", s7, s9, (s7.equalsIgnoreCase(s9)));

        //contains
        System.out.printf("%s contains %s?, %b%n", s7, s6, (s7.contains(s6)));

        //compareTo
        System.out.printf("%s compare to %s, %d%n", s7, (s5+s6), ((s7.compareTo(s5+s6))));
        System.out.printf("%s compare to %s, not ignoring cases: %d%n", s7, s9, (s7.compareTo(s9)));

        //compareToignore cases
        System.out.printf("%s compare to %s, ignoring cases: %d%n", s7, s9, (s7.compareToIgnoreCase(s9)));

        String s10 = String.valueOf(s9.charAt(0));
        System.out.println(s10);
        String s11 = s10.toUpperCase();
        System.out.println(s11);
        String s12 = s9.replace('d', 'D');
        System.out.println(s12);
        String s13 = "";
        String s14 = "    ";
        String s15 = "   Contect   ";
        System.out.println(s13.isEmpty());
        System.out.println(s14.trim()+"TEST");
        System.out.println(s15.trim());
        System.out.println(s14.trim().isEmpty());
        System.out.printf("%s ends with %s? %b%n", s7, s6, s7.endsWith(s6));
        System.out.printf("%s begins with %s, %b%n", s7, s5, (s7.startsWith(s5)));
        String s16 = String.join(";", "Peter", "Thomas", "Anja");
        System.out.println(s16);
        int i = 16;
        System.out.printf("%d as an int %n", i);
        String s17 = String.valueOf(i);
        System.out.printf("%s als sting%n", s17);
        System.out.println(s9.length()+" from s9");

        System.out.println(s9.indexOf("v") +" from n-1 s9 "+s9);

        System.out.println(s8.substring(0,4) +" no leading 0, therfore 4 = p");


    }
}
