package org.noip.mrgreenleaves.chapter14.onemoretime;

public class NoBinaryNumberException extends RuntimeException{

    public NoBinaryNumberException()
    {
        super();
    }

    public NoBinaryNumberException(String msg)
    {
        super(msg);
    }

    public NoBinaryNumberException(String msg, int position)
    {
        super(msg + " an der Stelle " +position);

    }
}
