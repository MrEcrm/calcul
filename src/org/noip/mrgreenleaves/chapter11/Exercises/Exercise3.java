package org.noip.mrgreenleaves.chapter11.Exercises;

public class Exercise3
{
    private String s1 = "Meier";
    private String s2 = "Mayer";

    public Exercise3()
    {
        printLetter(s1);
        printLetter(s2);
    }

    public static void main(String[] args)
    {
        Exercise3 ex = new Exercise3();

    }

    public void printLetter(String name)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Sehr geehrte(r) Frau/Herr, ");
        sb.append(name);
        // auch möglich sb.insert(25, " "+name);
        // \n ist eine Escape-Sequenz, die einen Zeilenvorschub bewirkt
        sb.append("\nwir gratulieren Ihnen zur erfolgreichen Lösung der Übungsaufgabe.");
        System.out.println(sb.toString());
    }
}