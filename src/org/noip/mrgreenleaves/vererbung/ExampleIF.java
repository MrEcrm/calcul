package org.noip.mrgreenleaves.vererbung;

public interface ExampleIF extends ExampleSuperIF {

    @Override
    public default String saySomething()
    {
        return "Hallo aus dem Interface ExampleIF.";
    }
}
