package org.noip.mrgreenleaves.repeat10again.rules;

public class Rule03overrideanddefine implements InterFaceMiddleMan02, AnotherInterface03{

    //werden 2 Interfaces implementiert, welche die selbe Methoden bereitstellen, dann muss im Programm spezifisch definiert werden, welche genommen werden soll. Diese Definiton macht man am besten mit einem Override.


    public String saySomething() // ist keine defaultmethode mehr
    {
        return AnotherInterface03.super.saySomething();
    }

/*


    public String saySomething() // ist keine Default-Methode mehr
    {
        return InterFaceMiddleMan02.super.saySomething();
    }


 */


    //define the printing

    public static void main(String[] args)
    {

        Rule03overrideanddefine test03 = new Rule03overrideanddefine();

        System.out.println(test03.saySomething());

    }
}
