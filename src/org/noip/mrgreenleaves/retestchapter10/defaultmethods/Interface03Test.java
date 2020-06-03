package org.noip.mrgreenleaves.retestchapter10.defaultmethods;

public interface Interface03Test {

    //neues interface, gleiche methode Text01

    public default void Text01()
    {
        System.out.println("Hallo aus dem Interface03Test");
    }
}
