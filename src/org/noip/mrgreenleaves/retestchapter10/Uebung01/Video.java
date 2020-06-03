package org.noip.mrgreenleaves.retestchapter10.Uebung01;

public class Video extends MediaAdapter{

    @Override
    public void play() {
        System.out.printf("%s: Play video %n", this.getClass());
    }

    @Override
    public void stop() {
        System.out.printf("%s Stop video %n", this.getClass());
    }

    @Override
    public void display() {
        System.out.printf("%s: Display video %n", this.getClass());
    }

}
