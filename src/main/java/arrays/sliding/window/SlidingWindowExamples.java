package arrays.sliding.window;

public class SlidingWindowExamples {

    /*
  * Find maximum average subarray of k length
  * */
    public static int maxAvg(int[] arr, int k) {
        if (k > arr.length) return 0;
        int windowL = 0, windowR = k - 1, maxSum, currSum = 0, resIndex = 0;
        for (int i = 0; i < k; i++) currSum += arr[i];
        maxSum = currSum;
        while (windowR < arr.length) {
            currSum -= arr[windowL];
            currSum += arr[windowR++];
            if (maxSum < currSum) {
                resIndex = windowL;
                maxSum = currSum;
            }
        }
        return resIndex;
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
}
