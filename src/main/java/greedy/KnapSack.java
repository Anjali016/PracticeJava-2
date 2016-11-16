package greedy;

public class KnapSack {

    public static int knapsak(int[] weights, int[] values, int capacity, int n) {

        if(capacity <= 0 || n == 0) return 0;
        return values[n] + knapsak(weights, values, capacity - weights[n], n - 1);
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4};
        int[] values = {14, 18, 20};
        System.out.println(knapsak(weights, values, 7, weights.length - 1));
    }
}
