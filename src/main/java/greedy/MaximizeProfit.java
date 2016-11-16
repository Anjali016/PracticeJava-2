package greedy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class MaximizeProfit {

    public static BigInteger maximProfit(int[] values, int[] clicks) {

        Arrays.sort(values);
        Arrays.sort(clicks);
        BigInteger revenue = BigInteger.ZERO;
        for (int i = values.length - 1 ; i >= 0; i--) {
            revenue = revenue.add(BigInteger.valueOf(values[i]).multiply(BigInteger.valueOf(clicks[i])));
        }

        return revenue;
    }

    public static void main(String[] args) {
        int[] values = {1, 3, -5};
        int[] clicks = {-2, 4, 1};

        System.out.print(maximProfit(values, clicks));
    }
}
