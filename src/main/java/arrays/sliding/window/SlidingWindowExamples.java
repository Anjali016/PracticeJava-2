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
        while (windowR < arr.length - 1) {
            currSum -= arr[windowL++];
            currSum += arr[++windowR];
            if (maxSum < currSum) {
                resIndex = windowL;
                maxSum = currSum;
            }
        }
        return resIndex;
    }
}
