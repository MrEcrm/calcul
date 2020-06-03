package org.noip.mrgreenleaves.Uebung;

public class TestMedia {

    public static void main(String[] args)
    {

        Media test03 = new Audio();
        Media test01 = new Picture();
        Media test02 = new Video();

        System.out.println("Media1:");
        test01.display();

        System.out.println("Media2:");
        test02.display();
        test02.play();
        test02.stop();

        System.out.println("Media3:");
        test03.play();
        test03.stop();
    }
}
