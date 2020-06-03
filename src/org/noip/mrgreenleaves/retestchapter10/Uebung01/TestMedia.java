package org.noip.mrgreenleaves.retestchapter10.Uebung01;

public class TestMedia {

    public static void main(String[] args)
    {

        Media makepicture = new Picture();
        Media makevideo = new Video();
        Media makeaudio = new Audio();


        makepicture.display();
        System.out.println();
        makevideo.display();
        makevideo.play();
        makevideo.stop();
        System.out.println();
        makeaudio.play();
        makeaudio.stop();
        makeaudio.display(); //witzlos, witzbold
    }
}
