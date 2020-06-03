package org.noip.mrgreenleaves.retestchapter10.defaultmethods;

public class PrintText03Rule03 implements Interface02Test, Interface03Test{

    //mit override klar definieren, aus welchem Interface nun die Methode Text01 aufgerufen werden soll

    /*
    public void Text01()
    {
        Interface03Test.super.Text01();
    }


     */

    public void Text01()
    {
        Interface02Test.super.Text01();
    }

    public static void main(String[] args)
    {



        //objekt erstellen
        PrintText03Rule03 text003 = new PrintText03Rule03();

        //objekt ausgeben

        text003.Text01();


        //erbt eine Klasse aus mehreren Interfaces die gleichen Methoden, muss im Programm spezifiziert werden, welche Methode genau genommen wird
        //Erwartung: es wird jene Methode gezogen, die spezifiziert ist.
    }
}
