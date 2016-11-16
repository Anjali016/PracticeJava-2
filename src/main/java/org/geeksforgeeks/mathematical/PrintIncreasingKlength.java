package org.geeksforgeeks.mathematical;

public class PrintIncreasingKlength {

    public static void print(int n, String sofar, int k, int start) {
        if(k == 0) System.out.println(sofar +" ");
        else {
        for (int i = start; i <= n; i++)
            print(n, sofar + i, k-1, i+1);
        }
    }

    public static void main(String[] args) {

        print(5, "", 3, 1);
    }
}
