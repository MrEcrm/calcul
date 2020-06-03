package org.noip.mrgreenleaves.Uebung;

public class Picture extends MediaAdapter {


    @Override
    public void play() {
        System.out.println(this.getClass() + "");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + "");

    }

    @Override
    public void display() {
        System.out.println(this.getClass() + ": Display Picture");
    }
}

