package arrays;

/*
*
*                           3          2           7    10
*                         /  \       /   \         |     |
*                       7     10
*
*
* */

import bst.TreeNode;

import java.util.*;

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
     * 34.
     * Problem:Next Greater Element
     * Given an array, print the Next Greater Element (NGE) for every element.
     * The Next greater Element for an element x is the first greater element on the right side of x in array.
     * Elements for which no greater element exist, consider next greater element as -1.
     * Solution:1. Use stack, push 1st element;
     * 2. for remaining element pick first,
     * 2.1 check in stack for smaller element if found print pairs
     * 2.2 if curr < prev then push back prev
     * 3 push curr in stack.
     * 4 At last print -1 for remaining element in stack.
     */

    public static void printNGE(int[] arr) {
        Stack<Integer> prevStack = new Stack<Integer>();
        prevStack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            int curr = arr[i];

            if (!prevStack.isEmpty()) {

                int prevElement = prevStack.pop();

                while (prevElement < curr) {
                    System.out.println(prevElement +  " -> " + curr);
                    if (prevStack.isEmpty()) break;
                    prevElement = prevStack.pop();
                }

                if (curr < prevElement) prevStack.push(prevElement);
            }

            prevStack.push(curr);
        }

        while (!prevStack.isEmpty()) {
            System.out.println(prevStack.pop() + "->" + -1);
        }
    }
    /**
     * 35.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */
    /**
     * 36.
     * Problem: Check if array elements are consecutive
     * Given an unsorted array of numbers, write a function that returns true if array consists of consecutive numbers.
     * Solution: Method 1 (Use Sorting)
     * 1. Sort all element.
     * 2. Do linear Scan, if diff > 1 return false
     *
     * Method 2 (max - min + 1 = n)
     * 2 All element are distinct.
     */

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int n : arr) max = Math.max(max, n);
        return max;

    }
    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int n : arr) min = Math.min(min, n);
        return min;
    }
    public static boolean isConsectutive(int[] arr) {

        int max = getMax(arr);
        int min = getMin(arr);

        if (max - min + 1 == arr.length) {
            boolean [] isVisited = new boolean[arr.length];
            for (int num : arr) {
                if (isVisited[num - min] != false) return false;
                else isVisited[num - min] = true;
            }
            return true;
        }
        return false;
    }
    /**
     * 37.
     * Problem: Find the smallest missing number
     * Given a sorted array of n integers where each integer is in the range from 0 to m-1 and m > n.
     * Find the smallest number that is missing from the array.
     * Solution: Method 1 (Use binary Search)
     * for i = 0 to m - 1, Bsearch(i) if not present return i; (mlog(n));
     * 2. Method 2 ( Use Modified binarySearch (log n))
     */

    public static int findNumber(int[] arr) {
return 0;
    }


    /**
     * 39.
     * Problem: Count the number of occurrences in a sorted array

     * Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].
     * Expected time complexity is O(Logn)
     * Method 2 (Use Binary Search)
     * 1) Use Binary search to get index of the first occurrence of x in arr[]. Let the index of the first occurrence be i.
     * 2) Use Binary search to get index of the last occurrence of x in arr[]. Let the index of the last occurrence be j.
     * 3) Return (j – i + 1);
     */



    /**
     * 40.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 35.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 35.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 35.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 59. The Celebrity Problem

     * Problem: TIn a party of N people, only one person is known to everyone.
     * Such a person may be present in the party, if yes, (s)he doesn’t know anyone in the party.
     * We can only ask questions like “does A know B? “. Find the stranger (celebrity) in minimum number of questions.
     * Solution: The idea is to use two pointers, one from start and one from the end.
     * Assume the start person is A, and the end person is B. If A knows B, then A must not be the celebrity.
     * Else, B must not be the celebrity.
     * We will find a celebrity candidate at the end of the loop.
     * Go through each person again and check whether this is the celebrity.
     */

    public static boolean know(int[][] mat, int a, int b) {
        return mat[a][b] == 1;
    }
     public static int findCelebrity(int[][] mat, int n) {
         int a = 0, b = n - 1;

         while (a < b) {
             if (know(mat, a, b)) a++;
             else b--;
         }

         for (int i = 0; i < n; i++) {
             if (a != i && know(mat, a, i) || !know(mat, i, a)) return -1;
         }

        return a;
     }


    /**
     * 60.
     * Problem: (Longest Bitonic Subsequence)
     * Solution:This problem is a variation of standard Longest Increasing Subsequence (LIS) problem.
     * Let the input array be arr[] of length n. We need to construct two arrays lis[] and lds[]
     * using Dynamic Programming solution of LIS problem.
     * lis[i] stores the length of the Longest Increasing subsequence ending with arr[i].
     * lds[i] stores the length of the longest Decreasing subsequence starting from arr[i].
     * Finally, we need to return the max value of lis[i] + lds[i] – 1 where i is from 0 to n-1.
     */

    public static int[] lis(int[] arr) {
        int[] lis = new int[arr.length];
        for (int i = 0; i < arr.length; i++) lis[i] = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) lis[i] = 1 + lis[j];
            }
        }

//        int max = Integer.MIN_VALUE;
//        for (int n : lis) max = Math.max(max, n);
//        return max;
        return lis;
    }

    public static int[] lds(int[] arr) {
        int[] lds = new int[arr.length];
        for (int i = 0; i < arr.length; i++) lds[i] = 1;
        for (int i = arr.length - 2; i >=0; i--){
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] > arr[j] && lds[i] < lds[j] + 1) lds[i] = 1 + lds[j];
            }
        }
//        int max = Integer.MIN_VALUE;
//        for (int n : lds) max = Math.max(max, n);
//        return max;
        return lds;
    }

    public static int lbs(int[] arr) {
        int[] lis = lis(arr);
        int[] lds = lds(arr);

        int max = lis[0] + lds[0] - 1;
        for (int i = 1; i < arr.length; i++)
            if (lis[i] + lds[i] - 1 > max)
                max = lis[i] + lds[i] - 1;
        return max;
    }

    /**
     * 61.
     * Problem: Find a sorted subsequence of size 3 in linear time
     * Given an array of n integers, find the 3 elements such that a[i] < a[j] < a[k] and i < j < k in 0(n) time.
     * If there are multiple such triplets, then print any one of them.
     * Solution: Use Auxilliary Space
     *
     */

    /**
     * 62.
     * Problem: Largest subarray with equal number of 0s and 1s.
     * Given an array containing only 0s and 1s, find the largest subarray which contain equal no of 0s and 1s.
     * Expected time complexity is O(n).
     * Solution: first row => last col in res Matrix and so on.
     */

    /**
     * 63.
     * Problem: Partition problem
     * Partition problem is to determine whether a given set can be partitioned into two subsets
     * such that the sum of elements in both subsets is same.
     *
     * Solution: 1) Calculate sum of the array. If sum is odd, there can not be two subsets with equal sum, so return false.
     * 2) If sum of array elements is even, calculate sum/2 and find a subset of array with sum equal to sum/2.
     * The first step is simple. The second step is crucial, it can be solved either using recursion or Dynamic Programming.
     */
// Naive Recursive
    public static boolean isSubset(int[] arr, int sum, int n) {

        if (n == 0) return sum == 0;
        if (arr[n - 1] > sum) return isSubset(arr, sum, n - 1);
        return isSubset(arr, sum, n - 1) || isSubset(arr, sum - arr[n - 1], n - 1);
    }

    public static boolean isSub(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        if (sum % 2 != 0) return false;
        else return isSubset(arr, sum / 2, arr.length);
    }


    /**
     * 64.
     * Problem: Maximum Product Subarray.
     * ven an array that contains both positive and negative integers, find the product of the maximum product subarray.
     * Expected Time complexity is O(n) and only O(1) extra space can be used.
     * Solution: It is similar to Largest Sum Contiguous Subarray problem. The only thing to note here is,
     * maximum product can also be obtained by minimum (negative)
     * product ending with the previous element multiplied by this element.
     * For example, in array {12, 2, -3, -5, -6, -2}, when we are at element -2,
     * the maximum product is multiplication of, minimum product ending with -6 and -2.
     */

    /**
     * 65.
     * Problem: Find a pair with the given difference
     * Given an unsorted array and a number n, find if there exists a pair of elements in the array whose difference is n.

     * Solution: 1. Create set of array element.
     * 2. Traverse array, look for arr[i] + diff
     *
     */

    /**
     * 66.
     * Problem: Replace every element with the greatest element on right side

     * Solution: The idea is to start from the rightmost element, move to the left side one by one,
     * and keep track of the maximum element.
     * Replace every element with the maximum element.
     */



    /**
     * 67.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */

    /**
     * 84.
     * Problem: Maximum Subarray Sum(Divide and Conquer)
     * You are given a one dimensional array that may contain both positive and negative integers,
     * find the sum of contiguous subarray of numbers which has the largest sum.
     *  Solution: Divide array in two halves, return Math.max(leftSum, Math.sum(rightSum, sumCrossingBoth))
     *
     *                              12
     *                             /  \
     *                           1     2
     *
     *
     *
     */

    public static int sumCrossing(int[] arr, int left, int mid, int right) {

        int currSum = 0;
        int leftsum = Integer.MIN_VALUE;
        for (int i = mid ; i >= left; i--) {
            currSum += arr[i];
            if (leftsum < currSum) leftsum = currSum;
        }
        int rightSum = Integer.MIN_VALUE;
        currSum = 0;
        for (int i = mid + 1; i <=right; i++) {
            currSum += arr[i];
            if (rightSum < currSum) rightSum = currSum;
        }

        return leftsum + rightSum;
    }
    public static int maxSubarraySum(int[] arr, int left, int right) {

        if (left > right) return 0;
        else if (left == right) return arr[left];
        else {
            int mid = (right + left) / 2 ;
            return Math.max(maxSubarraySum(arr, left, mid),
                    Math.max(maxSubarraySum(arr, mid + 1, right), sumCrossing(arr, left, mid, right)));
        }
    }

    /**
     * 85.
     * Problem: Counting Sort
     * Counting sort is a sorting technique based on keys between a specific range.
     * It works by counting the number of objects having distinct key values (kind of hashing).
     * Then doing some arithmetic to calculate the position of each object in the output sequence.
     * Solution:
     */

    /**
     * 86.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 87.
     * Problem: Find the maximum repeating number in O(n) time and O(1) extra space.
     * Given an array of size n, the array contains numbers in range from 0 to k-1 where k is a positive integer and k <= n.
     * Find the maximum repeating number in this array. For example, let k be 10 the given array be arr[] = {1, 2, 2, 2, 0, 2, 0, 2, 3, 8, 0, 9, 2, 3}, the maximum repeating number would be 2. Expected time complexity is O(n) and extra space allowed is O(1).
     * Modifications to array are allowed.

     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 88.
     * Problem: Stock Buy Sell to Maximize Profit.
     * The cost of a stock on each day is given in an array,
     * find the max profit that you can make by buying and selling in those days.
     * For example, if the given array is {100, 180, 260, 310, 40, 535, 695},
     * the maximum profit can earned by buying on day 0, selling on day 3.
     * Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order,
     * then profit cannot be earned at all.



     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 89.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 90.
     * Problem: Sort elements by frequency | Set 2
     * Given an array of integers, sort the array according to frequency of elements.
     * For example, if the input array is {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12},
     * then modify the array to {3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}.
     * Solution: Method 1 (Use BST and sorting).
     * 1 a) Insert in bst every element, repeating element increase count.
     * 2 Do inorder traversal of BST, and store frequency of each element in count[] arry;
     * 3.Sort count[] array.
     * 4. Traverse array for each x print it freq.
     *
     * Method 2. Hashing and sorting.
     * a). Store element  -> frequency
     * b) sort according to their frequency.
     */
    public static void sortByFrequency(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int n : arr) {
            if (countMap.get(n) != null) countMap.put(n, countMap.get(n) + 1);
            else countMap.put(n, 1);
        }

        PriorityQueue<HashMap<Integer,Integer>> maxHeap = new PriorityQueue<HashMap<Integer, Integer>>(new Comparator<HashMap<Integer, Integer>>() {
            public int compare(HashMap<Integer, Integer> o1, HashMap<Integer, Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });



        while (!maxHeap.isEmpty()) {
            Map<Integer, Integer> temp = maxHeap.poll();

        }
    }


    /**
     * 91.
     * Problem: Find a peak element
     * Given an array of integers. Find a peak element in it.
     * An array element is peak if it is NOT smaller than its neighbors.
     * For corner elements, we need to consider only one neighbor.
     * For example, for input array {5, 10, 20, 15}, 20 is the only peak element.
     * For input array {10, 20, 15, 2, 23, 90, 67}, there are two peak elements: 20 and 90.
     * Note that we need to return any one peak element.
     * Solution:  Binary Search
     */


    /**
     * 92.
     * Problem: Print all possible combinations of r elements in a given array of size n
     * Given an array of size n, generate and print all possible combinations of r elements in array.
     * For example, if input array is {1, 2, 3, 4} and r is 2,
     * then output should be {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4} and {3, 4}.
     * Solution:  Method 1. Permutation,
     * Method 2. Subset problem
     */


    /**
     * 93.
     * Problem: Given an array of of size n and a number k, find all elements that appear more than n/k time
     * Given an array of size n, find all elements in array that appear more than n/k times.
     * For example, if the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4,
     * then the output should be [2, 3]. Note that size of array is 8 (or n = 8), so we need to find all elements that appear more than 2 (or 8/4) times.
     * There are two elements that appear more than two times, 2 and 3.

     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 94.
     * Problem:Unbounded Binary Search Example (Find the point where a monotonically increasing function becomes positive first time)

     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 95.
     * Problem: Find the Increasing subsequence of length three with maximum product
     * Given a sequence of non-negative integers,
     * find the subsequence of length 3 having maximum product with the numbers of the subsequence being in ascending order.
     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 96.
     * Problem: Find the minimum element in a sorted and rotated array
     * A sorted array is rotated at some unknown point, find the minimum element in it.

     * Solution: Use Binary Search
     * 1. Search for the element which greater prev element, if prev is not present then first element is the answer.
     */
    public static int findMinElement(int[] arr, int left, int right) {

        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if(mid == 0 || arr[mid - 1] > arr[mid] && mid == arr.length - 1 || arr[mid + 1] > arr[mid])
            return arr[mid];
        if (arr[right] > arr[mid]) return findMinElement(arr, left, mid - 1);
        else return findMinElement(arr, mid + 1, right);

    }


    /**
     * 89.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */

    /**
     * 89.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 89.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */


    /**
     * 89.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
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

        int[] arr = {1, 2, 3, 4};
        System.out.print(findMinElement(arr, 0, arr.length - 1));
       // System.out.print(maxSubarraySum(arr, 0, arr.length - 1));
       // printSubset("", arr, arr.length);
//        System.out.print(isSub(arr));
//        maxSubsetNoAdj(arr, 0, "" , 0);
//        System.out.println(numOccurance(arr, 1));


//        int[] a = maxMinForm(arr);
//        zigZag(arr);
//        for (int i : arr)
//        System.out.print(i + " ");

    }
}
