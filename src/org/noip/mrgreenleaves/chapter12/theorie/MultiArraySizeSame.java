package org.noip.mrgreenleaves.chapter12.theorie;

public class MultiArraySizeSame{
    public static void main(String[] args)
    {
        int[][] field = new int[4][7];
        field[0] [0] = 11;
        field[0] [1] =22;
        field[0] [2] =33;
        field[0] [3] =44;
        //field[0] [4] = 55;
        field[1] [0] = 1;
        field[1] [1] = 2;
        field[1] [2] = 3;

        //Ausgabeschleifen

        for (int i = 0; i < field.length; i++)
        {
            //Beschriftung des arrays
            System.out.println("array "+ i);

            //Schleife für Array des arrays
            for(int j =0; j< field[i].length; j++)
                System.out.println(field[i] [j]);
        }

    }
}
