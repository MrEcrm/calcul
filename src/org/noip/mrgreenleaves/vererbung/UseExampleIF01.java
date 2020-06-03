package org.noip.mrgreenleaves.vererbung;

public class UseExampleIF01 implements ExampleIF {

    public static void main(String[] args)
    {
        // erstellen eines Objektes dieser Klasse
        UseExampleIF01 test01 = new UseExampleIF01();

        //weil wir ExampleIF implementiert hatten, ist diese näher als die ExampleSuperIF
        System.out.println(test01.saySomething());


    }
}
