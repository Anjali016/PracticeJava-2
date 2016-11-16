package greedy;

import java.math.BigInteger;
import java.util.Scanner;

public class MinCoinChange {

    public static int minCoinChange(int money, int[] coinSet) {

        int count = 0;
        int n = coinSet.length - 1;
        while (money > 0) {

                if(money - coinSet[n] >= 0) {
                    count++;
                    money -= coinSet[n];
                }else {
                    n--;
                }

        }
        return count;
    }

    public static int minCoinChangeRecur(int money, int[] coinSet) {

        if(money == 0) return 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < coinSet.length; i++){
            if(money >= coinSet[i]) {
                int noCoins = minCoinChangeRecur(money - coinSet[i], coinSet);

                if (noCoins != Integer.MAX_VALUE && noCoins + 1 < res)
                    res = noCoins + 1;
            }
        }


        return res;
    }

    private static BigInteger getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return BigInteger.valueOf(n);

        BigInteger previous = BigInteger.ZERO;
        BigInteger current  = BigInteger.ONE;

        for (int i = 0; i < n - 1; ++i) {
            BigInteger tmp_previous = previous;
            previous = current;
            current = tmp_previous.add(current);
        }

        return current.mod(new BigInteger("10"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }

    public static int minCoinChangeDP(int money, int[] coinSet) {
        int[] dp = new int[money + 1];

        for (int i = 1; i < dp.length; i++) {
            int minValue = Integer.MAX_VALUE;
            for (int coin: coinSet) {

                if(i >= coin) {
                    minValue = Math.min(minValue, 1 + dp[i - coin]);
                }
            }
            dp[i] = minValue;
        }
        return dp[money];
    }

//    public static void main(String[] args) {
//
//        int[] coinSet = {1, 8, 20};
//
//        System.out.print(minCoinChangeRecur(32, coinSet));
//    }
}
