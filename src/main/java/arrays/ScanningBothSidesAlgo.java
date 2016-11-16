package arrays;

public class ScanningBothSidesAlgo {

    /* Tapping of Rain water
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



    /*Candies
    * There are N children standing in a line. Each child is assigned a rating value.
    * You are giving candies to these children subjected to the following requirements:
    * 1. Each child must have at least one candy.
    * 2. Children with a higher rating get more candies than their neighbors.
    * */

    public static void main(String[] args) {

        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print(findWater(arr));
    }

}
