package arrays;

import java.text.DecimalFormat;
import java.util.PriorityQueue;
import java.util.*;

public class ClassTest {

    static class Item{
        int value, weight;
        public Item(int value, int weight){
            this.value = value;
            this.weight = weight;
        }
    }
    public static double fractionalKnapSack( int capacity, PriorityQueue<Item> items){

        if(capacity == 0) return 0;
        while (!items.isEmpty()) {
            Item currentItem = items.poll();
            if (currentItem.weight <= capacity) {
                return currentItem.weight + fractionalKnapSack(capacity - currentItem.weight, items);
            }else {
                int remain = currentItem.weight - capacity;
                double remainingWeight = remain * (double) currentItem.value / (double)currentItem.weight;
                return remainingWeight + fractionalKnapSack(capacity - remain, items);
            }
        }

        return 0;
    }

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;

        PriorityQueue<Item> items = new PriorityQueue<Item>(new Comparator<Item>() {
            public int compare(Item o1, Item o2) {
                return o2.value - o1.value;
            }
        });
        for(int i = 0; i < values.length; i++) {
            Item item = new Item(values[i], weights[i]);
            items.add(item);
        }
        value = fractionalKnapSack(capacity, items);

        return value;
    }

    public static int flip(int element) {

        return (element == 1) ? 0 : 1;
    }

    public static int findMaxSub(int[] array) {
        if (array.length == 0) return 0;
        int currMax = 1;
        int maxSoFar = 1;
        int prev = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] == flip(prev)) currMax++;
            else currMax = 1;
            maxSoFar = Math.max(maxSoFar, currMax);
            prev = array[i];
        }
        return maxSoFar;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < k ; i++) {
            int index = in.nextInt();
            array[index - 1] = flip(array[index - 1]);
            System.out.println(findMaxSub(array));
        }

    }
}
