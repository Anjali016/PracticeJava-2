package dp;

public class MinCoinChange {

    public static int minCoinChange(int sum, int[] coins) {
        int[] dp = new int[sum + 1];
        for (int i = 1; i <= sum; i++) {
            int minCoins = Integer.MAX_VALUE;
            for (int coin: coins)
                if(i >= coin) {
                    dp[i] = Math.min(minCoins, 1 + dp[i - coin]);

                }
        }
        return dp[sum];
    }


    public static void main(String[] args) {

        int[] coinSet = {24};
        System.out.print(minCoinChange(24, coinSet));
    }
}
