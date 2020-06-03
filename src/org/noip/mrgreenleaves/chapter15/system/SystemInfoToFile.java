package org.noip.mrgreenleaves.chapter15.system;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class SystemInfoToFile {
    public static void main(String[] args)
    {
        try
        {
            System.setOut(new PrintStream(new FileOutputStream("SystemTest.txt")));
            // generated in: /home/magpiech/Documents/Java Projects/calcul
        }
        catch (FileNotFoundException fnfex)
        {
            System.out.println(fnfex);
            System.exit(1);
        }
        System.out.println();
        printSysInfo();
        System.out.println();
        //this will also be written into the file
        System.out.println("the file SystemTest.txt has been created!");

        //wie kann ich eine meldung am bildschirm hinterlassen, dass das file erfolgreich im folder XY erstellt wurde?


    }
    static void printSysInfo() {
        Enumeration props = System.getProperties().propertyNames();
        System.out.println("Systemeigenschaften:\n");

        while (props.hasMoreElements()) {
            String prop = props.nextElement().toString();
            System.out.print(prop + ":");
            for (int i = prop.length(); i < 30; i++)
                System.out.print(" ");
            System.out.println(System.getProperty(prop));
        }
    }
}
