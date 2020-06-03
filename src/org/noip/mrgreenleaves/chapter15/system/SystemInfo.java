package org.noip.mrgreenleaves.chapter15.system;

import java.util.Enumeration;

public class SystemInfo {

    static void printSysInfo()
    {
        Enumeration props = System.getProperties().propertyNames();
        System.out.println("Systemeigenschaften:\n");
        while (props.hasMoreElements())
        {
            String prop = props.nextElement().toString();
            System.out.print(prop + ":");

            for(int i = prop.length(); i < 30; i++)
                System.out.print(" ");
            System.out.println(System.getProperty(prop));
        }
    }

    public static void main(String[] args)
    {
        printSysInfo();
    }
}
