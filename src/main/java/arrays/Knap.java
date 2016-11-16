package arrays;

import java.util.Scanner;

public class Knap {

    static int optimalWeight(int W, int[] w) {
        //write you code here
        int[][] dp = new int[w.length + 1][W + 1];

        for (int goldBarindex = 1; goldBarindex <= w.length; goldBarindex++) {
            for (int bagSize = 1; bagSize <= W; bagSize++) {
                if(bagSize < w[goldBarindex - 1]) dp[goldBarindex][bagSize] = dp[goldBarindex - 1][bagSize];
                else
                    dp[goldBarindex][bagSize] = Math.max(dp[goldBarindex - 1][bagSize], w[goldBarindex - 1] + dp[goldBarindex - 1][bagSize - w[goldBarindex - 1]]);

            }
        }
        return dp[w.length][W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}
