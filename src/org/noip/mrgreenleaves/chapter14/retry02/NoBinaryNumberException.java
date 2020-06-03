package org.noip.mrgreenleaves.chapter14.retry02;

public class NoBinaryNumberException extends RuntimeException{

    public NoBinaryNumberException()
    {
        super();
    }

    public NoBinaryNumberException(String test)
    {
        super(test);
    }

    public NoBinaryNumberException(String test, int b)
    {
        super(test +" ist der Fehler " + " an der Position" + b);
    }

}
