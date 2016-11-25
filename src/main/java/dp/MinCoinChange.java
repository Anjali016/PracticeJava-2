package dp;

public class MinCoinChange {

    public static int minCoinChange(int sum, int[] coins) {
        int[] dp = new int[sum + 1];
        for (int i = 1; i <= sum; i++) {
            int minCoins = Integer.MAX_VALUE;
            for (int coin: coins)
                if(i >= coin)
                    minCoins = Math.min(minCoins,  (dp[i - coin] != Integer.MAX_VALUE) ? 1 + dp[i - coin] : dp[i - coin]);
                dp[i] = minCoins;
        }
        return dp[sum];
    }


    public static void main(String[] args) {

        int[] coinSet = {2};
        System.out.print(minCoinChange(3, coinSet));
    }
}
