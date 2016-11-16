package recursion;

import java.util.ArrayList;

public class CoinChange {

    public static void coinChange(String sofar, int[] coins, int sum, int n) {
        if (sum == 0)
            System.out.println(sofar);
        if (( n > 0 && sum > 0))
        {
            coinChange(sofar + coins[n-1], coins,sum - coins[n-1], n);
            coinChange(sofar, coins, sum, n - 1);
        }
    }


    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        coinChange("", coins, 4, 3);

    }
}
