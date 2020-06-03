package org.noip.mrgreenleaves.chapter14;

public class IndexOutOfMinMaxException extends Exception{

    public IndexOutOfMinMaxException(String msg)
    {
        super(msg);
    }

    public IndexOutOfMinMaxException()
    {
        super();
    }

    public IndexOutOfMinMaxException(int min, int max)
    {
        super("Der Index liegt nicht zwischen " +min +" und " +max+".");
    }
}
