package org.noip.mrgreenleaves.chapter11;

public class WrapperClasses{
    public static void main(String[] args)
    {
        String s = "12324";
        System.out.println("String" +s);
        Integer i1 =  Integer.valueOf(s);
        System.out.println(s);

        int i = i1.intValue();
        System.out.println(i);

        String s2 = "394589";
        System.out.println("String:" +s2);

        int i2 = Integer.parseInt(s2);
        System.out.println(i2);

        String s3 = i1.toString();
        System.out.printf("%s%n",s3);

        //String s4 = i2.toString(); i2 is not an Integer, but only an int.
        String s4 = Integer.toString(i2); // vermutlich ein typecast?
        System.out.println(i2);
        System.out.printf("%s%n", i2);

        int i3 = 10;
        System.out.printf("%d%n", i3);

        //boxing: ein neues Integer objekt j erstellen und den wert von i3 Zuweisen.
        Integer j = Integer.valueOf(i3);
        System.out.printf("%d%n", j);

        //Unboxing: gespeicherten wert von Integer j liefern.
        int k = j.intValue();
        System.out.printf("%d%n", k);


    }
}
