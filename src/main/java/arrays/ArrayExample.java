package arrays;

/*
*
*                           3          2           7    10
*                         /  \       /   \         |     |
*                       7     10
*
*
* */

import java.util.Stack;

public class ArrayExample {




     /**
     * 1.
     * Problem: Given an array A[] and a number x, check for pair in A[] with sum as x.
     *
     * Solution: Use sorting or hashmap.
     */

    /**
     * 2.
     * Problem: Majority Element: A majority element in an array A[] of size n is an element that appears more than
     * n/2 times (and hence there is at most one such element).
     *
     * Solution: Use BST or Moore's voting algorithm.
     */

    /**
     * 3.
     * Problem: Find the Number Occurring Odd Number of Times.
     * Given an array of positive integers. All numbers occur even number of times except one number which occurs odd
     * number of times. Find the number in O(n) time & constant space.
     *
     * Solution: Use XOR operator.
     */
    int getOddOccurrence(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++)
            res = res ^ array[i];
        return res;
    }

    /**
     * 4. Maximum sum of contigous subarray for a non-empty array.
     */
    int maxSumContigous(int[] array) {
        int currentMax = array[0];
        int maxSumSofar = array[0];
        for(int i = 1; i < array.length; i++) {
            currentMax = Math.max(array[i], currentMax + array[i]);
            maxSumSofar = Math.max(maxSumSofar,currentMax);
        }
        return maxSumSofar;
    }

    /**
     * Maximum sum of not necessarily contigous array for a non empty array.
     */
    public int maxSumNonContigous(int [] array) {
        int maxSum = 0;
        int leastNeg = Integer.MIN_VALUE;
        int negCount = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > 0) maxSum += array[i];
            else {
                negCount ++;
                if (array[i] > leastNeg) leastNeg = array[i];
            }
        }
        if (negCount == array.length) return leastNeg;
        else return maxSum;
    }

    /**
     * 5.
     * Problem: Find the Missing Number. You are given a list of n-1 integers and these integers are in the range
     * of 1 to n. There are no duplicates in list. One of the integers is missing in the list.
     * Write an efficient code to find the missing integer.
     *
     * Solution: Use sum formulae or XOR operator.
     */

    /**
     * 6.
     * Problem: Search an element in a sorted and rotated array.
     *
     * Solution: Use modified binary search.
     * 1) Find middle point mid = (l + h)/2
     * 2) If key is present at middle point, return mid.
     * 3) Else If arr[l..mid] is sorted
     *      a) If key to be searched lies in range from arr[l] to arr[mid], recur for arr[l..mid].
     *      b) Else recur for arr[mid+1..r]
     * 4) Else (arr[mid+1..r] must be sorted)
     *      a) If key to be searched lies in range from arr[mid+1]
     *          to arr[r], recur for arr[mid+1..r].
     *      b) Else recur for arr[l..mid]
     */

    /**
     * 7.
     * Problem: Merge an array of size n into another array of size m+n
     *
     * Solution: Move all elements together in one pass. Then fill up bigger array using two pointers.
     */

    /**
     * 8.
     * Problem: Median of two sorted arrays.
     *
     * Solution: Either merge two arrays which will take O(m + n) or use divide and conquer by getting
     * medians of each array and comparing till they are equal. O(logn).
     */

    /**
     * 9.
     * Problem: Write a program to reverse an array or string
     *
     * Solution: Either use to pointer and swap iteratively or use stack frame in recursion to store
     * elements and reverse the array in place.
     */

    /**
     * 10.
     * Problem: Program for array rotation.
     *
     * Solution: Use temp array or reversal algorithm.
     */

    /**
     * 11.
     * Problem: Program for array rotation using reversal algo.
     */

    /**
     * 12.
     * Problem: Block swap algo for rotation.
     *
     * Solution:
     */

    /**
     * 13. Maximum sum such that no two elements are adjacent.
     */
//    int maxSum(int[] array) {
//        sum("",array,0);
//        return maxSum;
//    }
//
//    private void sum(String soFar, int[] array, int start) {
//        if (start >= array.length) {
//            if (maxSum < getSum(soFar)) {
//                maxSum = getSum(soFar);
//                path = soFar;
//            }
//        }
//        else for(int i = start; i < array.length; i++) sum(soFar + "," + array[i], array, i + 2);
//
//
//    }

    private int getSum(String str) {
        int sum = 0;
        for(String s : str.split(",")) if (!(s.length() == 0)) sum += Integer.parseInt(s);
        return sum;
    }

    /**
     *  Linear time algo for above.
     */
    int maxSumLinear(int[] array) {
        int incl = array[0];
        int excl = 0;
        for (int i = 1; i < array.length; i++) {
            int previousIncl = incl;
            incl = excl + array[i];
            excl = Math.max(previousIncl,excl);
        }
        return Math.max(incl,excl);
    }

    /**
     * 14.
     * Problem: Leaders in an array.
     * An element is leader if it is greater than all the elements to its right side. And the rightmost element is
     * always a leader.
     *
     * Solution: Scan from right to left and find the leaders.
     */

    /**
     * 15.
     * Problem: Sort elements by frequency.
     *
     * Solution: Use hash map and then sort by frequency. Or use heap.
     */

    /**
     * 16.
     * Problem: Count Inversions in an array.
     * Inversion Count for an array indicates – how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
     * Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
     *
     * Solution: Use BST. Count of left children gives number of inversions of that element.
     */

//    static String result;
//    static int resSum = 0;
//
//    public static void maxSubsetNoAdj(int[] arr, int tempSum, String sofar, int n) {
//
//        if (n >= arr.length) {
//            if (resSum < tempSum) {
//                resSum = tempSum;
//                result = sofar;
//            }
//        }else
//            for (int i = n; i < arr.length; i++) maxSubsetNoAdj(arr, tempSum + arr[i], sofar + arr[i] + " ", i + 2);
//    }


    /**
     * 31.
     * Problem: Find duplicates in O(n) time and O(1) extra space
     * Given an array of n elements which contains elements from 0 to n-1,
     * with any of these numbers appearing any number of times.
     * Find these repeating numbers in O(n) and using only constant memor
     * Solution: Iterate the array if arr[arr[i]] is positive make it negative else its repeatation.
     */
    public static void printRepeatation() {

    }

    /**
     * 32.
     * Problem: Selection Sort (Requires min swaps O(n) (Memory writes) in worst case.
     * Solution: Pick a minimum element's index and swap it with ith position.
     */

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIndex]) minIndex = j;

        swapFunc(arr, minIndex, i);
        }
    }
    /**
     * 33.
     * Problem: Equilibrium index of an array
     * Equilibrium index of an array is an index such that
     * the sum of elements at lower indexes is equal to the sum of elements at higher indexes
     * Solution: leftSum = 0, rightSum = totalSum, remove ith element & compare leftSum == rightSum return else update
     * leftSum += arr[i];
     */

    public static int findEquilibrium(int[] arr) {

        int leftSum = 0, rightSum = 0;
        for (int n : arr) rightSum += n;

        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (rightSum == leftSum) return i;
            leftSum += arr[i];
        }
        return -1;
    }
    /**
     * 31.
     * Problem:Next Greater Element
     * Given an array, print the Next Greater Element (NGE) for every element.
     * The Next greater Element for an element x is the first greater element on the right side of x in array.
     * Elements for which no greater element exist, consider next greater element as -1.
     * Solution:1. Use stack, push 1st element;
     * 2. for remaining element while stack
     */

    public static void printNGE(int[] arr) {
        Stack<Integer> prevStack = new Stack<Integer>();
        prevStack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            int next = arr[i];

            if (!prevStack.isEmpty()) {

                int prevElement = prevStack.pop();

                while (prevElement < next) {
                    System.out.println(prevElement +  " -> " + next);
                    if (prevStack.isEmpty()) break;
                    prevElement = prevStack.pop();
                }

                if (next < prevElement) prevStack.push(prevElement);
            }

            prevStack.push(next);
        }

        while (!prevStack.isEmpty()) {
            System.out.println(prevStack.pop() + "->" + -1);
        }
    }
    /**
     * 31.
     * Problem:
     * Solution:
     */
    /**
     * 31.
     * Problem:
     * Solution:
     */
    /**
     * 31.
     * Problem:
     * Solution:
     */

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

/*
* 100
* Move all zeroes to end of array
* Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
* For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
* The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).
* */

    public static void moveZeros(int[] arr) {

        int count = 0;
        for (int num : arr) if (num != 0) arr[count++] = num;
        while (count < arr.length) arr[count++] = 0;
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

    public static int end(int[] arr, int left, int right, int x) {

        if (left > right) return -1;
        int mid = (left + right) / 2;
        if ((mid == arr.length - 1 ||  arr[mid + 1] > arr[mid]) && arr[mid] == x ) return mid;
        else if (arr[mid] >= x) return end(arr, mid + 1, right, x);
        else return end(arr, left, mid - 1, x);
    }
    public static int start(int[] arr, int left, int right, int x) {

       if (left > right) return -1;
       int mid = (left + right) / 2;
       if ((mid == 0 ||  arr[mid - 1] < arr[mid]) &&  arr[mid] == x ) return mid;
       else if (arr[mid] < x) return start(arr, mid + 1, right, x);
       else return start(arr, left, mid - 1, x);
   }

    public static int numOccurance(int[] arr, int x) {

        int s = start(arr, 0, arr.length - 1, x);
        int e = end(arr, 0, arr.length - 1 , x);

        if (s != -1 && e != -1) return e - s + 1;
        else return -1;
    }
    //----------------------------------------------------------------------------------------------------------------

    /*
    * Find duplicates in O(n) time and O(1) extra space
    * Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing any number of times.
    * Find these repeating numbers in O(n) and using only constant memory space.
    * */

    /**
     * 154.
     * Problem: Count minimum steps to get the given desired array.
     * Consider an array with n elements and value of all the elements is zero.
     * We can perform following operations on the array.
     * 1. Incremental operations:Choose 1 element from the array and increment its value by 1.
     * 2. Doubling operation: Double the values of all the elements of array.
     *
     * Solution: The idea is to follow reverse steps, i.e. to convert target to array of zeros.
     */
    //----------------------------------------------------------------------------------------------------------------
    /**
     * 155.
     * Problem: Find minimum number of merge operations to make an array palindrome.
     * Given an array of positive integers. We need to make the given array a ‘Palindrome’.
     * Only allowed operation on array is merge. Merging two adjacent elements means replacing them with their sum.
     * The task is to find minimum number of merge operations required to make given array a ‘Palindrome’.
     */
    //----------------------------------------------------------------------------------------------------------------

    /**
     * 156.
     * Problem: Minimize the maximum difference between the heights.
     * Given heights of n towers and a value k. We need to either increase or decrease height of every tower by k
     * (only once) where k > 0. The task is to minimize the difference between the heights of the longest and the
     * shortest tower after modifications, and output this difference.
     */
    //----------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] arr = {1};

//        maxSubsetNoAdj(arr, 0, "" , 0);
        System.out.println(numOccurance(arr, 1));
//        int[] a = maxMinForm(arr);
//        zigZag(arr);
//        for (int i : arr)
//        System.out.print(i + " ");

    }
}
