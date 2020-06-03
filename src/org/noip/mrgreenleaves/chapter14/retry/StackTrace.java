package org.noip.mrgreenleaves.chapter14.retry;

public class StackTrace {
    public static void main(String[] args)
    {
        String s = "ABC";
        try
        {
            int i = Integer.parseInt(s);
            System.out.println("Die Zahl ist "+i);
        }
        catch (NumberFormatException e)
        {
            //was wurde als parameter übergeben?
            System.out.println(e.getStackTrace());

            //array mit error messages als Array-Elemente des Typs StacktraceElement erstellen
            StackTraceElement[] stacktre = e.getStackTrace();

            //was ist in diesem Array drinn?

            System.out.println(stacktre.length);
            for (StackTraceElement test: stacktre)
                System.out.println(test);

            //speichere im platzhalter ste das erste Element des Arrays
            StackTraceElement ste = stacktre[0];

            //was ist im ersten element drinn?
            System.out.println("Fehler in Datei " +ste.getFileName() + ", Zeile "+ste.getLineNumber());
            //alternative schreibweise, falls keine variable definiert wurde instead of ste
            System.out.println("Fehler in Datei " +stacktre[0].getFileName() + ", Zeile "+stacktre[0].getLineNumber());
            System.out.println("Klasse" + ste.getClassName());
            System.out.println("Methode " +ste.getMethodName());


        }
    }
}
