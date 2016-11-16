package arrays;

/*
*
*                           3          2           7    10
*                         /  \       /   \         |     |
*                       7     10
*
*
* */

public class ArrayExample {
    static String result;
    static int resSum = 0;

    public static void maxSubsetNoAdj(int[] arr, int tempSum, String sofar, int n) {

        if (n >= arr.length) {

            if (resSum < tempSum) {
                resSum = tempSum;
                result = sofar;
            }

        }else
            for (int i = n; i < arr.length; i++) maxSubsetNoAdj(arr, tempSum + arr[i], sofar + arr[i] + " ", i + 2);


    }
    //----------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------
    //################################################################################################################
                                    // Sliding Window Problems
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


    //----------------------------------------------------------------------------------------------------------------
    // Swap Function
    public static void swapFunc(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    //----------------------------------------------------------------------------------------------------------------
   /*
   * Convert array into Zig-Zag fashion
   * Given an array of distinct elements, rearrange the elements of array in zig-zag fashion in O(n) time. The converted array should be in form a < b > c < d > e < f.
   * Example:
   * Input:  arr[] = {4, 3, 7, 8, 6, 2, 1}
   * Output: arr[] = {3, 7, 4, 8, 2, 6, 1}
   * */
    public static void zigZag(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            if (i % 2 != 0) {
                if (arr[i] < arr[i + 1]) swapFunc(arr, i, i + 1);
            }else {
                if (arr[i] > arr[i + 1]) swapFunc(arr, i, i + 1);
            }
        }

    }

//----------------------------------------------------------------------------------------------------------------
    /*
    * Count Strictly Increasing Subarrays
    * Given an array of integers, count number of subarrays (of size more than one) that are strictly increasing.
    * Expected Time Complexity : O(n)Expected
    * Extra Space: O(1)
    * Examples:Input: arr[] = {1, 4, 3}
    * Output: 1
    * There is only one subarray {1, 4}
    * */

    public static int countSIS(int[] arr) {
        int count = 0;
        int sortedLen = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) sortedLen++;
            else {
                count += (sortedLen - 1) * sortedLen/2;
                sortedLen = 1;
            }
        }
        if (sortedLen > 1) count += (sortedLen - 1) * sortedLen/2;
        return count;
    }

    //----------------------------------------------------------------------------------------------------------------
    /* Rearrange an array in maximum minimum form
     * Given a sorted array of positive integers, rearrange the array alternately i.e first element should be maximum value, second minimum value, third second max, fourth second min and so on.
     * Examples:
     * Input  : arr[] = {1, 2, 3, 4, 5, 6, 7}
     * Output : arr[] = {7, 1, 6, 2, 5, 3, 4}
     */

    public static int[] maxMinForm(int[] arr) {
        int left = 0, right = arr.length - 1, k = 0;

        int[] result = new int[arr.length];
        while (left <= right) {
            if (k % 2 == 0) result[k++] = arr[right--];
            else result[k++] = arr[left++];
        }

        return result;
    }
    //----------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        int[] arr = {1, 12, -5, -6, 50, 3};

//        maxSubsetNoAdj(arr, 0, "" , 0);
        System.out.println(maxAvg(arr, 4));
//        int[] a = maxMinForm(arr);
//        zigZag(arr);
//        for (int i : arr)
//        System.out.print(i + " ");

    }
}
