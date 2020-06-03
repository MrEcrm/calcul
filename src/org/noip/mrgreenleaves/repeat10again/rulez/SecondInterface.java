package org.noip.mrgreenleaves.repeat10again.rulez;

public interface SecondInterface extends SuperInterface {

    public default void saySomething()
    {
        System.out.println("Override der SuperInterface aus dem SecondInterface");
    }
}
