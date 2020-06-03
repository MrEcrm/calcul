package org.noip.mrgreenleaves.retestchapter10.Uebung01;

public class Audio extends MediaAdapter {

    @Override
    public void play() {
        System.out.println(this.getClass() + ": Play audio");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + ": Audio stopped");
    }
}
