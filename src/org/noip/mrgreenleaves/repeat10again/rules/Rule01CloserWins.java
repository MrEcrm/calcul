package org.noip.mrgreenleaves.repeat10again.rules;

public class Rule01CloserWins
        implements SuperInterface01, InterFaceMiddleMan02 {

    public static void main(String[] args)

            //Wird eine Default-Methode überschrieben, dann wird diejenige genutzt, welche zur aktuellen Klasse am nächsten steht
    {
        Rule01CloserWins test01 = new Rule01CloserWins();

        System.out.println(test01.saySomething());
    }


}
