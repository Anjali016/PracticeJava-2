package dp;

public class MinCoinChange {

    public static int minCoinChange(int money, int[] coinSet) {

        int[] dp = new int[money + 1];

        for (int i = 1; i <= money; i++) {
            int minCoins = Integer.MAX_VALUE;
            for (int coin: coinSet) {
                if(i >= coin) {
                    minCoins = Math.min(minCoins, 1 + dp[i - coin]);
                }
            }
            dp[i] = minCoins;
        }

        return dp[money];
    }

    public static void main(String[] args) {

        int[] coinSet = {1, 8, 20};
        System.out.print(minCoinChange(24, coinSet));
    }
}
