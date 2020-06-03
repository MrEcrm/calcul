package org.noip.mrgreenleaves.chapter11;
import static java.lang.System.out;

public class StringCompare {

    public static void main(String[] args)
    {
        //erstelle 3 Strings

        String s1 = "text";
        String s2 = new String("Text");
        String s3 = new String("Context");
        String s4 = new String("text ");

        out.println("Gross- und Kleinchreibung berücksichtigen:");

        out.printf("%s und %s: %b%n", s1, s2, (s1.equals(s2)));

        out.println("Gross- und Kleinchreibung NICHT berücksichtigen:");

        out.printf("%s und %s: %b%n", s1, s2, (s1.equalsIgnoreCase(s2)));


        out.println("lexikografischer Vergleich");

        out.printf("%s und %s: %d%n", s1, s2, (s2.compareTo(s1)));

        out.println("lexikografischer Vergleich");

        out.printf("%s und %s: %d%n", s1, s2, (s1.compareTo(s1)));

        out.println("lexikografischer Vergleich");

        out.printf("%s und %s: %d%n", s1, s2, (s2.compareTo(s1)));

        out.println("lexikografischer Vergleich");

        out.printf("%s und %s: %d%n", s1, s4, (s1.compareTo(s4)));

        out.println("lexikografischer Vergleich");

        out.printf("%s und %s: %d%n", s4, s1, (s4.compareTo(s1)));

        out.println("lexikografischer Vergleiche ignoring");

        out.printf("%s und %s: %d%n", s1, s2, (s1.compareToIgnoreCase(s2)));

        out.println("\nPrüfen ob ein String in einem anderen enthalten ist:");

        out.printf("%s in %s: %b%n", s1, s3, (s3.contains(s1)));

        out.println("\nPrüfen ob ein String in einem anderen enthalten ist:");

        out.printf("%s in %s: %b%n", s3, s1, (s1.contains(s3)));

        out.println("\nPrüfen ob ein String Text in einem anderen Context enthalten ist:");

        out.printf("%s in %s: %b%n", s2, s3, (s3.contains(s2)));






    }
}
