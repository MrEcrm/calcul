package org.noip.mrgreenleaves.chapter15.Console;

import java.util.*;
import java.io.*;

public class UseConsole {
    public static void main(String[] args)
    {

        Console con = System.console();

        //checks if executed from the console

        /*
        move to
        /Documents/Java Projects/calcul/src/org/noip/mrgreenleaves/chapter15/Console
            find there the file: UseConsole.java
            enter the folling command:
            javac UseConsole.java
            java UseConsole.java
         */
        if (con != null)
        {
            con.printf("Login:%n");
            String s = con.readLine("Please enter your name...");
            con.printf("Good morning, %s,%n", s);


            char[] pwchars = con.readPassword("Please enter your passowrd now:");

            String pw = new String(pwchars);
            con.printf("Checking password... '%s'",pw);

        }

        //if not executed from the console
        else
            System.out.print("No console available");

    }
}
