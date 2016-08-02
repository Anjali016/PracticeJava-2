package org.geeksforgeeks.mathematical;

public class PrintNumbers {

    public static void printNumber(int n, String sofar, int start) {

        if(n == 0) System.out.println(sofar);
        else {
            for (int i = start ; i<10 ;i++){

                printNumber(n-1, sofar + i,i+1);
            }
        }

    }

    public static void main(String[] args) {

        printNumber(2, "", 0);
    }
}
