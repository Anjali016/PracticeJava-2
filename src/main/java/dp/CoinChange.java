package dp;

public class CoinChange {

    //Bottom up
    public static int coinChange(int[] coins, int sum, int n) {

        int[][] dp = new int[sum + 1][n + 1];

        for (int i = 0 ; i < dp[0].length; i++)
            dp[0][i] = 1;
        for (int s = 1; s <= sum; s++){
            for (int c = 0; c <= n; c++) {
                if(c == 0) dp[s][c] = 0;
                else if (s < coins[c - 1]) dp[s][c] = dp[s][c - 1];
                else
                    dp[s][c] = dp[s][c - 1] + dp[s - coins[c - 1]][c];
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] +"  ");
            }
            System.out.println();
        }

        return dp[sum][n];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 3;

        System.out.println(coinChange(coins, sum, coins.length));
    }
}
