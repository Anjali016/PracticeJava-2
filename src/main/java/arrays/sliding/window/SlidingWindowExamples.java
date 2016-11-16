package arrays.sliding.window;

public class SlidingWindowExamples {

    /*
  * Find maximum average subarray of k length
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
        int numZeros = 0, windowL = 0, windowR = 0, maxWindowLen = -1, lestIndex, rightIndex;

        while (windowR < arr.length) {

            if (numZeros <= m){
                windowR++;
                if (arr[windowR] == 0) numZeros++;
            }

            if (numZeros > m) {
                windowL++;
                if (arr[windowL] == 0) numZeros--;
            }

            if (windowR - windowL > maxWindowLen) {
                lestIndex = windowL;
                rightIndex = windowR;
                maxWindowLen = windowR -windowL;
            }
        }

    }



    public static void main(String[] args) {

    }


}
