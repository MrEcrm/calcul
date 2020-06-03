package org.noip.mrgreenleaves.repeat10again.rules;

public class Rule02Classwins
        implements InterFaceMiddleMan02 {

    // Wird ein Interface implementiert, das über eine gleichlautende Methode verfügt, wie die Klasse welche eingesetzt wird, dann wird die Methode, die von der SuperKlasse geerbt wurde eingesetzt.
    public static void main(String[] args)
    {
        ClassbeforeInterface test02 = new ClassbeforeInterface();

        System.out.println(test02.saySomething());

    }
}
