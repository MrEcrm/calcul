package org.noip.mrgreenleaves.chapter15.system;

import java.util.HashMap;
import java.util.*;

//https://www.baeldung.com/java-verbose-gc ist aber veraltet

public class Application {
    //use of garbage collector
    private static Map<String, String> stringContainer = new HashMap<>();

    public static void main(String[] args)
    {
        System.out.println("Start of the program!");
        String stringWithPrefix = "stringWithPrefix";

        //load java heap with 3 M java.lang.Sting instances
        for (int i = 0; i <3000000; i++) {
            String newString = stringWithPrefix + i;
            stringContainer.put(newString, newString);
        }
        System.out.println("MAP size: " +stringContainer.size());

        //explicit GC
        System.gc();


    //vm option
        //https://docs.oracle.com/javase/10/jrockit-hotspot/logging.htm#JRHMG125

        //-Xlog:gc:file=tesst.txt
        //tesst.txt file created in: /home/magpiech/Documents/Java Projects/calcul
        // add more detail by just adding other options with a space as a separator
        //-Xlog:gc::uptime,tid -Xlog:gc+task=trace -Xlog:gc:file=tesst.txt

        //enter another file location such as docments or desktop:
        // -Xlog:gc::uptime,tid -Xlog:gc+task=trace -Xlog:gc:file=/home/magpiech/Documents/tesst.txt


        //remove 2 m of 3 million
        for (int i = 0; i < 2000000; i++)
        {
            String newString = stringWithPrefix + i;
            stringContainer.remove(newString);
        }
        System.out.println("MAP size : "+stringContainer.size());
        System.out.println("End of the program!");
    }

}
