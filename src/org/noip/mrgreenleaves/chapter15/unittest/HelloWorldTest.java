package org.noip.mrgreenleaves.chapter15.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    //https://www.javatpoint.com/intellij-idea-unit-test
    @Test
    public void testgetName() throws Exception {

        //variable var1 of HelloWorld type filled with "John" as a = new HelloWorld object
        HelloWorld var1 = new HelloWorld("John");

        //expected hardcoded and compare it with the return value of getName() of the variable john
        assertEquals("John", var1.getName());
    }
}