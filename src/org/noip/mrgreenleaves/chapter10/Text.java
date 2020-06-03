package org.noip.mrgreenleaves.chapter10;

public interface Text
{

    public default String supplyText()
    {
        return "Guten Tag.";
    }

    public default Integer supplyNumber()
    {
        return Integer.valueOf("234");
    }
    public default Integer supplyNumber2()
    {
        return 232;
    }

    public default void writeText()
    {
     System.out.println("Noch da?");
    }

    public static void writeTextStatic()
    {
        System.out.println("Auf Wiedersehen!");
    }

}
