package recursion;

import java.util.ArrayList;

public class KnapSackWithoutRep {

    public static class Item {
        int weight, value;

        public Item(int weight, int value) {
            this.value = value;
            this.weight = weight;
        }
    }

    public static int knapsackWithoutRep(int capacity, ArrayList<Item> items, int n) {

        if(capacity <= 0 || n < 0) return 0;
        if(capacity < items.get(n).weight) return knapsackWithoutRep(capacity, items, n - 1);
        else {
            return Math.max(knapsackWithoutRep(capacity, items, n - 1), items.get(n).value + knapsackWithoutRep(capacity - items.get(n).weight, items, n - 1));
        }
    }


    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(6, 30));
        items.add(new Item(3, 14));
        items.add(new Item(4, 16));
        items.add(new Item(2, 9));

        System.out.print(knapsackWithoutRep(10, items, items.size() - 1));
    }
}

