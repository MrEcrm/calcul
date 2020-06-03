package org.noip.mrgreenleaves.Uebung;

public class Audio extends MediaAdapter{

    @Override
    public void play() {
        System.out.println(this.getClass() + ": Play Audio");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + ": Stop audio");

    }

    @Override
    public void display() {
    System.out.println(this.getClass() + "");
    }
}
