package org.geeksforgeeks.mathematical;

public class PascalTriangle {

    public static int getPascalTerm(int x, int y) {

        if (x == 0 || x == y) return 1;
        else {
            return getPascalTerm( x - 1, y - 1) + getPascalTerm(x , y - 1);

        }
    }

    public static void drawPascalTriangle(int index) {

        for (int i = 0 ; i <= index; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(getPascalTerm(j, i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        drawPascalTriangle(4);
    }



}
