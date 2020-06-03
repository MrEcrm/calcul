package org.noip.mrgreenleaves.chapter15.system;

import java.util.*;

public class SystemInfoList {

    static void printInfoSys() {
        Properties props = System.getProperties();
        System.out.println("Systemproperties:\n");
        props.list(System.out);
    }

    public static void main(String[] args)
    {
        printInfoSys();
    }

}
