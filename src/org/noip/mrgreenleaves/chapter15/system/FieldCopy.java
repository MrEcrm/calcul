package org.noip.mrgreenleaves.chapter15.system;

import java.io.IOException;
import java.util.*;
import java.io.*;

public class FieldCopy {

    static void copyArray() {
        byte array1[] = new byte[20];
        byte array2[] = new byte[10];
        byte array3[] = new byte[10];
        System.out.print("Please enter 20 characters: ");
        try {
            System.in.read(array1);
            System.arraycopy(array1, 0, array2, 0, 10);
            System.out.print("The first 10 characters are: ");
            System.out.write(array2);

            System.arraycopy(array1, 10, array3, 0, 10);
            System.out.print("\nThe last 10 characters are: ");
            System.out.write(array3);
        } catch (IOException io) {
            System.out.print(io.getMessage());
        }
    }

    public static void main(String[] args)
    {
        //FieldCopy a = new FieldCopy();
        copyArray();
    }
}
