package org.noip.mrgreenleaves.Uebung;

public class Video extends MediaAdapter {


    @Override
    public void play() {
        System.out.println(this.getClass() + ": Play Video");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + ": Stop Video");

    }

    @Override
    public void display() {
        System.out.println(this.getClass() + ": Display Video");
    }
}

