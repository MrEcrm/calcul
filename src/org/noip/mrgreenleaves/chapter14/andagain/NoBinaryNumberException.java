package org.noip.mrgreenleaves.chapter14.andagain;

public class NoBinaryNumberException extends RuntimeException{

    public NoBinaryNumberException()
    {
        super();
    }

    public NoBinaryNumberException(String message)
    {
        super(message);
    }

    public NoBinaryNumberException(String message, int position)
    {
        super(message +" an der Position " +position);
    }
}
