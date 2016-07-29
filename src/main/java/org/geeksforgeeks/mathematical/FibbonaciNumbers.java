package org.geeksforgeeks.mathematical;

public class FibbonaciNumbers {

    public  int fibbonacciNum(int n) {
        if(n < 2) return n;
        else return fibbonacciNum(n-1) + fibbonacciNum(n-2);
    }


    public  int fibbonacciNumRec(int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <=n; i++) dp[i] = dp[i-1] + dp[i-2];
        return dp[n];
    }

}
