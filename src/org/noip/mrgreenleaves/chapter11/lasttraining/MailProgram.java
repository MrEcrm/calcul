package org.noip.mrgreenleaves.chapter11.lasttraining;

public class MailProgram {
    //variablen definieren
    String s1 = "Sehr geehrte(r) Herr/Frau,";
    String s2 = "\n\nwir gratulieren Ihnen zum Geburtstag";

    String a1 = "Müller";
    String a2 = "Maurer";


    //konstruktor erstellen; inkl alphabetisch sortieren
    public MailProgram() {
        if (a1.compareTo(a2) <= 0) {
            printLetter(a1);
            printLetter(a2);
        } else if (a1.compareTo(a2) > 0) {
            printLetter(a2);
            printLetter(a1);
        }
    }

    //Ausgabe methode machen und darin ein objekt erstellen
    public static void main(String[] args)
    {
        MailProgram test01 = new MailProgram();
    }

    public void printLetter(String name)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        sb.insert(25, " "+(name));                    ;
        System.out.println(sb.toString());
        System.out.println();
        System.out.println();
        System.out.println();
    }

}
