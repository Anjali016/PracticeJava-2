package org.geeksforgeeks.mathematical;
/*
*
* Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n. Determine the maximum value obtainable by cutting up the rod and selling the pieces. For example, if length of the rod is 8 and the values of different pieces are given as following, then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)
*
* */
public class RodCutting {

    public static int rodCutting(int[] length, int[] price, int size, int n) {

        if (size <= 0 || n > price.length - 1) return 0;
        if (size < length[n]) return rodCutting(length, price, size, n + 1);
        return Math.max(price[n] + rodCutting(length, price, size - length[n], n), rodCutting(length, price, size, n + 1));
    }

    public static int rodCutting2(int[] length, int[] price, int size) {

        if (size <= 0) return 0;
        int maxValue = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                maxValue = Math.max(maxValue, price[i] + rodCutting2(length, price, size - length[i]));
            }
        return maxValue;
    }

    public static int rodCuttingDP(int[] price, int size) {
        int[] revenue = new int[size + 1];
        revenue[0] = 0;
        for (int i = 1; i <= size; i++){
            int max = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++)
                max = Math.max(max, price[j - 1] + revenue[i - j]);
            revenue[i] = max;
        }
        return revenue[size];
    }


    public static void main(String[] args ){
        int[] length = {1, 2};
        int[] price = {1, 5};
//        int[] length = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] price = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        System.out.print(rodCuttingDP(price, 2));
    }
}
