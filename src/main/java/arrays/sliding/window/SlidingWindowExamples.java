package arrays.sliding.window;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindowExamples {

    /*
  * 138.
  * Problem: Find maximum average subarray of k length
  *
  * Solution use sliding window of k size
  * */
    public static int maxAvg(int[] arr, int k) {
        if (k > arr.length) return 0;
        int  maxSum, currSum = 0, index = 0;
        for (int i = 0; i < k; i++) currSum += arr[i];
        maxSum = currSum;
        for (int windowL = 0; windowL < arr.length - k; windowL++) {
            currSum = currSum - arr[windowL] + arr[windowL + k];
            if (currSum > maxSum){
                index = windowL;
                maxSum = currSum;
            }
        }
        return index;
    }

    /*
    * Find the minimum of every sub-array of size k in an array of size n.
    * O(n) solution required.
    * */

    public static int findMin(int[] arr, int k) {
        int currSum = 0, minSum;
        for (int i = 0; i < k ; i++) currSum += arr[i];
        minSum = currSum;
        for (int windowL = 0; windowL < arr.length - k; windowL++) {
            currSum = currSum - arr[windowL] + arr[windowL + k];
            minSum = Math.min(currSum, minSum);
        }
        return minSum;
    }


    /*
    * You are given with an array of 1s and 0s. And you are given with an integer m,
    * which signifies number of flips allowed.
    * Find the position of zeros which when flipped will produce maximum continuous series of 1s.
    * Example:
    * arr = {1 1 0 1 1 0 0 1 1 1 } m = 1
    * output = {1 1 1 1 1 0 0 1 1 1} position = 2
    *
    *  arr = {1 1 0 1 1 0 0 1 1 1 } m = 2
    *  output = {1 1 0 1 1 1 1 1 1 1} position = 5, 6
    * */

    public static void findFlips(int[] arr, int m) {
        int numZeros = 0, windowL = 0, windowR = 0, maxWindowLen = -1, leftIndex = 0, rightIndex = 0;
        while (windowR < arr.length) {
            if (numZeros <= m){
                if (windowR < arr.length && arr[windowR] == 0) numZeros++;
                windowR++;
            }
            if (numZeros > m) {
                if (windowL < arr.length && arr[windowL] == 0) numZeros--;
                windowL++;
            }
            if (windowR - windowL > maxWindowLen) {
                leftIndex = windowL;
                rightIndex = windowR;
                maxWindowLen = windowR - windowL;
            }
        }
        for (int i = leftIndex; i < rightIndex; i++)
            if (arr[i] == 0) System.out.print(i + " ");
    }

    /**
     * 53.
     * Problem: Find subarray with given sum
     * Given an unsorted array of nonnegative integers,
     * find a continous subarray which adds to a given number.
     * Solution: currSum = arr[0];
     * 2. from 1 to last : currSum += arr[i]
     * 3 if (currSum > sum) remove trailing elements
     */

    public static boolean findSubarray(int[] arr, int sum) {
        int windowL = 0, currSum = 0;
        for (int windowR = 0; windowR < arr.length; windowR++) {
            while (currSum > sum && windowL < windowR - 1) currSum -= arr[windowL++];
            if (sum == currSum) {
                int end = windowR - 1;
                System.out.print(windowL + " to " + end);
                return true;
            }
            if (windowR < arr.length) currSum += arr[windowR];
        }
        return false;
    }

    /**
     * 104.
     * Problem: Smallest subarray with sum greater than a given value
     * Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.
     * Solution: Use sliding window
     *
     */
    public static int minLengthSubAraay(int[] array, int sum) {
        int currSum = 0, minLength = array.length + 1, windowL = 0;
        for (int windowR = 0; windowR < array.length; windowR++) {
            while (currSum <= sum && windowR < array.length) currSum += array[windowR++];
            while (currSum > sum && windowL < array.length) {
                minLength = Math.min(minLength, windowR - windowL);
                currSum -= array[windowL++];
            }
        }
        return minLength;
    }

    /**
     * 123.
     * Problem: Check if a given array contains duplicate elements within k distance from each other

     * Solution: Use hashSet of K size and sliding window of k size
     */

    public static void checkDuplicatesKDistance(int[] arr, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < k; i++)
            if (!set.add(arr[i])) System.out.print(arr[i] + " ");
        for (int windowR = k; windowR < arr.length; windowR++) {
            set.remove(arr[windowR - k]);
            if(!set.add(arr[windowR])) System.out.print(arr[windowR]);
        }
    }






    /*
    * Maximum of all subarrays of size k
    *
    * */

    public static void printMaxSub(int[] arr, int k) {

        for (int windowL = 0; windowL < arr.length - k; windowL++) {

        }
    }



    public static void main(String[] args) {
        int[] arr =  { 0, 1, 1, 1 };
        int r = maxAvg(arr, 3);
        System.out.println(r);
    }


}
