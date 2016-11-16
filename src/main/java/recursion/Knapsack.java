package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
*               B 2(10)       C 12(20)
*                     15
*                           D  13(30)
*
*               A 1(5)
*
*           2  3 3
* */

public class Knapsack {

    public static int solve(int capacity, int[] weights, int[] values, int n) {

        if(n == 0 || capacity == 0) return 0;
        if(capacity < weights[n - 1]) return solve(capacity, weights, values, n - 1);
        else
            return Math.max(values[n-1] + solve(capacity - weights[n-1], weights, values, n - 1),
                    solve(capacity, weights, values, n - 1));
    }
//    public static int knapSackDP(int[] weights, int capacity)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {

            int length = in.nextInt();
            int capacity = in.nextInt();
            int[] weights = new int[length];
            for (int j = 0; j < length; j++)
                weights[j] = in.nextInt();
            System.out.println(knapSack(weights, capacity));
        }
    }


    static int knapSack(int W, int wt[], int val[], int n)
    {
        int i, w;
        int[][] K  = new int[n+1][W+1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= W; w++)
            {
                if (i==0 || w==0)
                    K[i][w] = 0;
                else if (wt[i-1] <= w)
                    K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
                else
                    K[i][w] = K[i-1][w];
            }
        }

        return K[n][W];
    }

    public static int knapSack(int[] weights, int capacity) {
        if (capacity <= 0) return 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
            if (capacity >= weights[i]) {
                max = Math.max(max, weights[i] + knapSack(weights, capacity - weights[i]));
            }
        }

        return max;
    }

    public static int knapSack(int[] weights, int capacity, int n) {

        if(capacity <= 0 || n == 0) return 0;
        else if (weights[n - 1] > capacity) return knapSack(weights, capacity, n - 1);
        else return Math.max(knapSack(weights, capacity, n - 1), knapSack(weights, capacity - weights[n - 1], n) + weights[n-1]);
    }



}
