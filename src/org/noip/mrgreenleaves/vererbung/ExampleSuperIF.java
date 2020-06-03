package org.noip.mrgreenleaves.vererbung;

public interface ExampleSuperIF {

    public default String saySomething()
    {
        return "Hallo aus dem Interface ExampleSuperIF.";
    }

}
