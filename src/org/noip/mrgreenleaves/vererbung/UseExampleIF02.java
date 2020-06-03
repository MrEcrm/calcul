package org.noip.mrgreenleaves.vererbung;

public class UseExampleIF02
implements  ExampleIF{
    public static void main(String[] args)
    {
        ExampleClass test02 = new ExampleClass();
        //superklasse = basisklasse = ExampleClass; das ExampleIF stellt die Defaultmethode saySomething()
        //Regel 02: superklassen haben vorrang vor Default-Methoden von Interfaces; Erwartung: saySomething von ExampleClass kommt zum Zuge
        System.out.println(test02.saySomething());

        UseExampleIF01 test02v1 = new UseExampleIF01();
        //superklasse = basisklasse = UseExampleIF01, das ExampleIF stellt die Defaultmethode saySomething().
        //was ist in der UserExampleIF01? einerseits die implementierte ExampleIF (die davon am nahestehendste; aber auch die geerbte Methode von ExampleSuperIF).
        //was hat Vorrang? Mit Type UseExampleIF01, wird die in dieser geerbte Methode von ExampleSuperIF und in ExampleIf überschriebene an die UseExampleIF02 weitervererbt. Erwartung: Hallo aus der ExampleIF
        System.out.println(test02v1.saySomething());

        UseExampleIF02 test02v2 = new UseExampleIF02();
        //ebenfalls aus ExampleIF
        System.out.println(test02v2.saySomething());
    }

}
