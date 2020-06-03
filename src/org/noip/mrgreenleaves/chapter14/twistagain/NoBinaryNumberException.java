package org.noip.mrgreenleaves.chapter14.twistagain;

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
        super("Fehler: " +message+" an der Stelle: " +position);
    }
}
