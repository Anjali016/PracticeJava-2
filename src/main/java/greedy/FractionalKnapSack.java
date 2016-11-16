package greedy;

import java.text.DecimalFormat;
import java.util.*;

public class FractionalKnapSack {


    public static double fractionalKnapSack( int capacity, PriorityQueue<Item> items){

        if(capacity == 0 || items.isEmpty()) return 0;
        Item currentItem = items.poll();
        if (currentItem.weight <= capacity) {
            return currentItem.value + fractionalKnapSack(capacity - currentItem.weight, items);
        }else {
            return capacity * (double) currentItem.value / (double)currentItem.weight;
        }

    }

    static class Item{
        int value, weight;
        public Item(int value, int weight){
            this.value = value;
            this.weight = weight;
        }
    }


    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        PriorityQueue<Item> items = new PriorityQueue<Item>(new Comparator<Item>() {
            public int compare(Item o1, Item o2) {
                return o2.value / o2.weight - o1.value / o1.weight;
            }
        });
        for (int i = 0; i < values.length; i++) {
            Item item = new Item(values[i], weights[i]);
            items.add(item);

        }

        value = fractionalKnapSack(capacity, items);

        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        double value = getOptimalValue(capacity, values, weights);
        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.print(df.format(value));
    }

}
