package org.noip.mrgreenleaves.chapter12.uebung02;

public class CalcSquare {
    public static void main(String[] args) {
        int[] prime = new int[]{2, 3, 5, 7, 11, 13};
        for (int d : prime)
            System.out.println(d);

        System.out.println();
        double[] squares = new double[10];

        for (int i = 0; i < squares.length; i++) {
            squares[i] = (double) (i * i);
            System.out.println("Das Quadrat von " + i + " ist " + squares[i] + ".");
        }

        double[] squaresCopy = squares.clone();
        for (int i = 0; i < squaresCopy.length; i++) {
            squaresCopy[i] = 0.5;
            System.out.println(
                    "Wert von Squares: "
                            + squares[i]
                            + " Wert von SquaresCopy "
                            + squaresCopy[i]
            );
        }
    }
}
