package org.noip.mrgreenleaves.retestchapter10.defaultmethods;

public interface Interface02Test extends InterfaceSuper01test {

    public default void Text01()
    {
        System.out.println("Hallo aus dem Interface02 Test - wir haben die Message von InterfaceSuper01test überschrieben");
    }
}
