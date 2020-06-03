package org.noip.mrgreenleaves.repeat10again.rules;

public interface InterFaceMiddleMan02 extends SuperInterface01 {

    //erben aus dem SuperInterface01 und gleich überschreiben.
    public default String saySomething()
    {
        return "Hallo aus dem Interface InterFaceMiddleMan02 mit einem override aus dem SuperInterface01";
    }
}
