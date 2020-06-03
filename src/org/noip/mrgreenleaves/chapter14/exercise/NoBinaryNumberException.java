package org.noip.mrgreenleaves.chapter14.exercise;

public class NoBinaryNumberException extends RuntimeException{

    public NoBinaryNumberException()
    {
        super();
    }

    public NoBinaryNumberException(String msg)
    {
        super(msg);
    }

    public NoBinaryNumberException(String s, int pos)
    {

        //String entegegen nehmen, der Exception auslöst
        super(s + " ist keine Binärzahl." + (pos + ". Stelle"));


        //Entgegennahme der Position, die eine Exception ausgelöst hat.

    }
}
