package recursion;

import java.util.ArrayList;
import java.util.Map;

public class KnapSackWithRepetition {

    public static class Item {
        int weight, value;

        public Item(int weight, int value) {
            this.value = value;
            this.weight = weight;
        }
    }
    public static int knapSack(int capacity, ArrayList<Item> items) {
        if (capacity <= 0) return 0;
        int maxValue = Integer.MIN_VALUE;
        for (Item item : items) {
            if(capacity >= item.weight)
                 maxValue = Math.max(maxValue, item.value + knapSack(capacity - item.weight, items));
        }
        return maxValue;
    }

    public static int knapSackBottomUp(int capacity, ArrayList<Item> items) {
        int[][] dp = new int[capacity + 1][items.size()];

        for (int cap = 1; cap <= capacity; cap++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = 0; j < dp[0].length; j++) {
                if (cap >= items.get(j).weight){
                    maxValue = Math.max(maxValue, items.get(j).value  + dp[cap - items.get(j).weight][j]);
                }
                dp[cap][j] = maxValue;

            }
        }
        return dp[capacity][items.size() - 1];
    }

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(6, 30));
        items.add(new Item(3, 14));
        items.add(new Item(4, 16));
        items.add(new Item(2, 9));

        System.out.print(knapSackBottomUp(10, items));
    }
}
