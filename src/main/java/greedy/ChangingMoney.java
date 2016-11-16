package greedy;

import java.util.Scanner;

public class ChangingMoney {

    static int minCoins = 0;
    public static boolean moneyChanging(int[] coins, int money) {
        if(money <= 0) return true;

        for (int coin : coins) {
            if (money >= coin) {
                minCoins++;
                if(moneyChanging(coins, money - coin)) return true;
            }
        }
        return false;

    }


    private static int getChange(int m) {
        int[] coins = {10, 5, 1};
        moneyChanging(coins, m);
        return minCoins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
    /*static int minCoins = 0;
    public static boolean moneyChanging(int[] coins, int money) {
        if(money <= 0) return true;

            for (int coin : coins) {
                if (money >= coin) {
                    minCoins++;
                   if(moneyChanging(coins, money - coin)) return true;
                }
            }
        return false;

    }

    public static void main(String[] args) {
        int[] coins = {10, 5, 1};
        System.out.print(moneyChanging(coins, 28));
        System.out.print(minCoins);
    }*/
}
