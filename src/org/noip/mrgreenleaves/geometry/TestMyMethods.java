package org.noip.mrgreenleaves.geometry;

public class TestMyMethods {
    public static void main(String[] args)
    {
        MyMethods one = new MyMethods();
        MyMethods two = new MyMethods();
        one.setData(123124);

        if(one.equals(two))
        {
            System.out.println("One and Two are identical");
        }
        else {
            System.out.println("One and Tow are NOT identical");
            System.out.println();
        }

        MyMethods three = (MyMethods)one.clone();

        if(one.equals(three))
        {
            System.out.println("One equals three"); System.out.println();
        }
        else
        {
            System.out.println("One and three are NOT identical");
        }

    }
}
