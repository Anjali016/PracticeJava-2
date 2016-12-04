package dynamicprogramming;

import java.util.Scanner;

public class KnapSack {

    static int[][] dp;
    public static int knapSack(int capacity, int[] weights, int[] values, int n) {
        dp = new int[capacity + 1][n+1];
        for (int i = 0; i < dp.length; i++)
            for (int j = 0;j < dp[0].length; j++) dp[i][j] = -1;
        return solve(capacity, weights, values, n);
    }
    public static int solve(int capacity, int[] weights, int[] values, int n) {

        if (capacity == 0 || n == 0) return 0;
        if(capacity < weights[n - 1]) return solve(capacity, weights, values, n - 1);
        if(dp[capacity][n] != -1) return dp[capacity][n];
        else
            dp[capacity][n] = Math.max(values[n - 1] + solve(capacity - weights[n - 1], weights, values, n - 1),
                solve(capacity, weights, values, n - 1) );

        return dp[capacity][n];
    }

    //Bottom Up
    public static int knapSackBottomUp(int capacity, int[] weights, int[] values, int n) {
        int[][] dp = new int[capacity + 1][n + 1];


        for (int c = 0; c <= capacity; c++) {
            for (int j = 0; j <= n; j++){
                if(c == 0 || j == 0) dp[c][j] = 0;
                else if(c < weights[j - 1] ) dp[c][j] = dp[c][j - 1];
                else
                dp[c][j] = Math.max(dp[c][j - 1], values[j - 1] + dp[c - weights[j - 1]][j - 1]);
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] +"  ");
            }
            System.out.println();
        }
        return dp[capacity][n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


   /*    int capacity = in.nextInt();
        int n = in.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];
        for(int i = 0; i < n ; i++ ) {
            weights[i] = in.nextInt();
            values[i] = in.nextInt();
        }*/
        int capacity = 3;
        int[] weights = {1, 1, 1};
        int[] values = {100, -100, 100};
        System.out.print(knapSackBottomUp(capacity, weights, values, weights.length));
    }

}
