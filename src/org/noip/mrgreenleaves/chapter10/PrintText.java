package org.noip.mrgreenleaves.chapter10;

public class PrintText implements Text {

    public static void writeTextStatic()

    {
      System.out.println("Tschüss!");
    }




    public static void main(String[] args)
    {

      PrintText oneText = new PrintText();

      //create the outline since it has not been done before, it is a return.
      System.out.println(oneText.supplyText());
      //indicate the interface to avoid the overwritten version to be taken
      Text.writeTextStatic();
      oneText.writeText();
      //oneText.writeTextStatic();
        writeTextStatic();
        System.out.println(oneText.getClass());

        if(oneText.supplyText() instanceof String)
        {
            System.out.println(true);
        }


    }

}