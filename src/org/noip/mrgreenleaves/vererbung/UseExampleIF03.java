package org.noip.mrgreenleaves.vererbung;

public class UseExampleIF03 implements ExampleIF, AnotherIF{

    public String saySomething()
    {
        return AnotherIF.super.saySomething();
        /*
        Error:(3, 8) java: types org.noip.mrgreenleaves.vererbung.ExampleSuperIF and org.noip.mrgreenleaves.vererbung.AnotherIF are incompatible;
  class org.noip.mrgreenleaves.vererbung.UseExampleIF03 inherits unrelated defaults for saySomething() from types org.noip.mrgreenleaves.vererbung.ExampleIF and org.noip.mrgreenleaves.vererbung.AnotherIF
*/

    }



/*
    mit







     public String saySomething()
    {
        return ExampleIF.super.saySomething();
        //wäre das resultat: Hallo aus dem Interface ExampleIF.
        }


     */


    public static void main(String[] args)
    {
        UseExampleIF03 test03 = new UseExampleIF03();
        System.out.println(test03.saySomething());

       // just picked the other saySomething not good since for the reader it will not be clear
        // System.out.println(test03.saySometing());
    }


}
