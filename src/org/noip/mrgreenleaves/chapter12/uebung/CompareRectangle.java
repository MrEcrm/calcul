package org.noip.mrgreenleaves.chapter12.uebung;
import org.noip.mrgreenleaves.geometry.Rectangle;
import org.noip.mrgreenleaves.geometry.Rectangle.*;

//nr 1
public class CompareRectangle {

    //nr 2 und 3
    Rectangle[][] oneRect = new Rectangle[8][8];

    //nr 3
    CompareRectangle()
    {
        for(int i = 0; i <oneRect.length; i++)
            for (int j = 0; j <oneRect[i].length; j++)
                oneRect[i][j] = new Rectangle((double) i, j, true );


        //nr 5
        for(int i = 0; i < oneRect.length; i++)
        for(Rectangle d: oneRect[i])
            compare(d);
    }

    //nr 4
    void compare(Rectangle rect)
    {
        for(int i = 0; i < oneRect.length; i++)
            for(int j = 0; j < oneRect[i].length; j++)
                if(rect != oneRect[i][j] && rect.getArea() == oneRect[i][j].getArea())
                    System.out.println(
                            "Die Rechtecke ( "+
                                    rect.getWidth()+
                                    " x "+
                                    rect.getLength()+
                                    " ) und ( "+
                                    oneRect[i][j].getWidth()+
                                    " x "+
                                    oneRect[i][j].getLength()+
                                    " ) sind gleich gross."
                    );
    }

    //nr 6
    public static void main(String[] args)
    {
        CompareRectangle test = new CompareRectangle();
    }
}
