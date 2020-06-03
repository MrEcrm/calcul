package org.noip.mrgreenleaves.chapter14.anothergo;

public class NoBinaryNumberException extends RuntimeException{

    NoBinaryNumberException()
    {
        super();
    }

    NoBinaryNumberException(String message)
    {
        super(message);
    }

    NoBinaryNumberException(String message, int position)
    {
        super("the error message is: " +message +" and occurs on the position: " +position);
    }
}
