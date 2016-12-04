package dynamicprogramming.fibonacci.problems;

public class FibonnaciProblems {

    /**
     * 2.
     * Problem: Recursively break a number in 3 parts to get maximum sum
     * Given a number n, we can divide it in only three parts n/2, n/3 and n/4 (we will consider only integer part).
     * The task is to find the maximum sum we can make by dividing number in three parts recursively and summing up them together.
     * Solution:
     */

    //Naive Recursive
    public static int breakSum(int num) {
        if (num == 0 || num == 1) return num;
        else return Math.max(breakSum(num / 2) + breakSum(num / 3) + breakSum(num / 4), num);
    }

    public static int breakSumDP(int num) {
        int[] sum = new int[num + 1];
        sum[1] = 1;
        for (int i = 2; i <= num; i++) sum[i] = Math.max(sum[i / 2] + sum[i / 3] + sum[i / 4], i);
        return sum[num];
    }
}
