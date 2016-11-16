package org.geeksforgeeks.mathematical;

public class NonFibbo {

    public static int nonFibbonacci(int nthTerm) {

        int previousTerm = 0, nextTerm = 1;
        int result = 0;

        while (nthTerm > 0) {
            if(nextTerm > previousTerm)
                for (result = previousTerm + 1; result < nextTerm && nthTerm > 0; result++)
                    nthTerm--;

            int temp = previousTerm;
            previousTerm = nextTerm;
            nextTerm = temp + nextTerm;
        }

        return result - 1;
    }

    public static void main(String[] args) {

        System.out.print(nonFibbonacci(2));
    }
}
