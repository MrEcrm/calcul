package org.noip.mrgreenleaves.chapter12.uebung02;

import org.noip.mrgreenleaves.geometry.Rectangle;

//nr1
public class CompareRectangle {

    //nr2 & 3
    Rectangle[][] oneRect = new Rectangle[8][8];

    CompareRectangle()
    {
        //nr 3
        for(int i = 0; i < oneRect.length; i++)
            for(int j = 0; j < oneRect.length; j++)
                oneRect[i][j] = new Rectangle((double) i, (double)j, true);

            for(int i =0; i<oneRect.length; i++)
                for(Rectangle d: oneRect[i])
                    compare(d);



    }

    //nr 4

    void compare(Rectangle rect)
    {
        for (int i = 0; i < oneRect.length; i++)
            for(int j = 0; j < oneRect.length; j++)
            {
                if(rect != oneRect[i][j] && rect.getArea()==oneRect[i][j].getArea())
                    System.out.println(
                            "Die Rechtecke ("
                            +rect.getWidth()
                            +" x "
                            +rect.getLength()
                            +") und ("
                            +oneRect[i][j].getWidth()
                            +" x "
                            +oneRect[i][j].getLength()
                            +") sind gleich gross"
                    );
            }
    }
    public static void main(String[] args)
    {
        CompareRectangle oneTest = new CompareRectangle();
    }
}
