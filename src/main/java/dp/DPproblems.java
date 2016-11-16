package dp;

import java.math.BigInteger;
import java.util.Scanner;

public class DPproblems {

    /*
    *              5    4     3
    *            4
    * */

    public  int minCoinChange(int[] coins, int sum) {
        int min = Integer.MAX_VALUE;
        if (sum <= 0 || coins.length < 1) return 0;
        else {
            for (int coin : coins)
                if (coin <= sum)
                    min = Math.min(min, 1 + minCoinChange(coins, sum - coin));
        }
        return min;
    }

    public static BigInteger fibbModified(int n, BigInteger[] dp) {

        for(int i = 2; i < n; i++) {
            dp[i] = dp[i - 2].add(dp[i - 1].multiply(dp[i - 1]));
        }

        return dp[n - 1];
    }

//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//      int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80 };
//      System.out.print(LISDP(arr, arr.length));
//    }


    public static int coinChangeProblem(int[] coins, int money, int start) {

        if (money == 0) return 1;
        else if (money < 0 || start >= coins.length) return 0;
        if (money < coins[start]) return coinChangeProblem(coins, money, start + 1);
        else {
            return coinChangeProblem(coins, money, start + 1) +
                     coinChangeProblem(coins, money - coins[start], start);
        }
    }

    public static BigInteger coinChangeProbDP(int[] coins, int money) {

        BigInteger[][] dp = new BigInteger[money + 1][coins.length + 1];
        for (int i = 0; i < dp[0].length; i++) dp[0][i] = BigInteger.ONE;

        for (int sum = 1; sum < dp.length; sum++) {
            for (int numCoins = 0; numCoins < dp[0].length; numCoins++) {
                if ( numCoins == 0) dp[sum][numCoins] = BigInteger.ZERO;
                else if (sum < coins[numCoins - 1]) dp[sum][numCoins] = dp[sum][numCoins - 1];
                else
                    dp[sum][numCoins] = dp[sum][numCoins - 1].add( dp[sum - coins[numCoins - 1]][numCoins]);
            }
        }

        return dp[money][coins.length];
    }

    public static int LIS(int[] arr, int n) {
        int maxlength = 1;
        if (n == 1) return 1;
        for (int i = 1; i < n; i++) {
            int res = LIS(arr, i);
            if (arr[i - 1] < arr[n - 1] && res + 1 > maxlength) maxlength = ( 1 + res);
        }
        return maxlength;
    }

    public static int LISDP(int[] arr, int n) {

        int[] dp = new int[n];
        for (int i = 0; i< dp.length; i++) dp[i] = 1;

        for (int i = 1; i< dp.length; i++) {
            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = 0;
        for (int num : dp)
            if(num > max) max = num;

        return max;
    }

    public static void printSubSet(String sofar, String rest) {

        if (rest.isEmpty()) System.out.println(sofar);
        else {
            printSubSet(sofar + rest.charAt(0), rest.substring(1));
            printSubSet(sofar, rest.substring(1));
        }
    }




    public static int minCoinChangeDP(int[] coins, int sum) {

        int[] dp = new int[sum + 1];
        for (int s = 0; s <= sum; s++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < coins.length; i++) {
                if (sum > i)
                    min = Math.min(min, 1 + dp[sum - coins[i]]);
            }
            dp[s] = min;
        }
        return dp[sum];


    }



    public static void main(String[] args) {
        printSubSet("", "aba");

    }

}
