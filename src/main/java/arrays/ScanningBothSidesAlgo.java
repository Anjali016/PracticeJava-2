package arrays;

public class ScanningBothSidesAlgo {

    /*
    * 136.
    * Problem: Tapping of Rain water
    * Given n non-negative integers representing an elevation map where the width of each bar is 1,
    * compute how much water it is able to trap after raining.
    * For example, given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
    * */

    public static int findWater(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int water = 0;
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) left[i] = Math.max(left[i - 1], arr[i]);
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) right[i] = Math.max(right[i + 1], arr[i]);

        for (int i = 0; i < arr.length; i++) water += Math.min(left[i], right[i]) - arr[i];
        return water;
    }

    /*
    * 41.
    * Problem: Given an array arr[], find the maximum j – i such that arr[j] > arr[i].
    *
    * Solution : Create LeftMin and LeftMax
    * Compare both array at each index and update maxDiff.
    * */
    public static int maxDiff(int[] arr) {
        int maxDiff = -1, x = 0, y = 0;
        int[] leftMin = new int[arr.length];
        int[] rightMax = new int[arr.length];
        leftMin[0] = arr[0];
        for (int i = 1; i < arr.length; i++) leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >=0; i--) rightMax[i] = Math.max(rightMax[i + 1], arr[i]);

        while (x < arr.length && y < arr.length) {

            if (arr[x] < arr[y]) {
                maxDiff = Math.max(maxDiff, y - x);
                y++;
            }else x++;
        }

        return maxDiff;
    }

    /*Candies
    * There are N children standing in a line. Each child is assigned a rating value.
    * You are giving candies to these children subjected to the following requirements:
    * 1. Each child must have at least one candy.
    * 2. Children with a higher rating get more candies than their neighbors.
    * */

    public static int findCandies(int[] ratings) {
        int dp[] = new int[ratings.length];
        int candies = 0;
        for (int i = 0; i < dp.length; i++) dp[i] = 1;

        for (int i = 1; i < dp.length; i++)
            if (ratings[i - 1] < ratings[i])
                dp[i] = dp[i - 1] + 1;

        for (int i = ratings.length - 2; i >=0; i--)
            if (ratings[i + 1] < ratings[i])
                dp[i] = Math.max(dp[i + 1] + 1, dp[i]);

        for (int num : dp) candies += num;
        return candies;

    }




    public static void main(String[] args) {

        int[] arr = {1, 2, 2};
        System.out.print(findCandies(arr));

    }

}
