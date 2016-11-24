package arrays;
import java.util.*;
public class ArrayExample {

     /**
     * 1.
     * Problem: Given an array A[] and a number x, check for pair in A[] with sum as x.
     * Solution: Use sorting or hashmap.
     */
    public static void printPairs(int[] arr) {

    }

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
    static int maxSumContigous(int[] array) {
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
    private int getSum(String str) {
        int sum = 0;
        for(String s : str.split(",")) if (!(s.length() == 0)) sum += Integer.parseInt(s);
        return sum;
    }
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



    /**
     * 17.
     * Problem: Find the minimum distance between two numbers


     * Solution:
     */



    /**
     * 44.
     * Problem: Find the minimum distance between two numbers


     * Solution:
     */


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
     * Problem: Interpolation search vs Binary search
     * Solution: Interpolation search works better than Binary Search for a sorted and uniformly distributed array.
     * On average the interpolation search makes about log(log(n)) comparisons (if the elements are uniformly distributed), where n is the number of elements to be searched. In the worst case (for instance where the numerical values of the keys increase exponentially) it can make up to O(n) comparisons.
     */

    /**
     * 41.
     * Problem: Given an array arr[], find the maximum j – i such that arr[j] > arr[i]

     * Solution:
     */


    /**
     * 42.
     * Problem: Maximum of all subarrays of size k (Added a O(n) method)
     * Solution:
     */



    /**
     * 43.
     * Problem: Find whether an array is subset of another array | Added Method 3


     * Solution:
     */

    /**
     * 44.
     * Problem: Find the minimum distance between two numbers


     * Solution:
     */

    /**
     * 45.
     * Problem: Find the repeating and the missing | Added 3 new methods


     * Solution:
     */


    /**
     * 46.
     * Problem: Median in a stream of integers (running integers)


     * Solution:
     */

    /**
     * 47.
     * Problem: Find a Fixed Point in a given array
     * Given an array of n distinct integers sorted in ascending order,
     * write a function that returns a Fixed Point in the array, if there is any Fixed Point present in array,
     * else returns -1. Fixed Point in an array is an index i such that arr[i] is equal to i. Note that integers in array can be negative.
     * Solution: Use Binary Search
     */

    public static int findFixedPoint(int[] arr, int start, int end) {

        if (start > end ) return -1;
        int mid = (start + end) / 2;
        if (mid == arr[mid]) return mid;
        else if (mid > arr[mid]) return findFixedPoint(arr, mid + 1, end);
        else return findMinElement(arr, start, mid - 1);
    }



    /**
     * 48.
     * Problem: Maximum Length Bitonic Subarray


     * Solution:
     */
    /**
     * 49.
     * Problem: Find the maximum element in an array which is first increasing and then decreasing


     * Solution:
     */
    /**
     * 50.
     * Problem: Count smaller elements on right side
     * Solution:
     */
    /**
     * 51.
     * Problem: Minimum number of jumps to reach end
     * Given an array of integers where each element represents the max number of steps that can be made forward from that element.
     * Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element).
     * If an element is 0, then cannot move through that element.
     * Solution:
     */

    public static int minJumps(int[] arr, int start, int end) {
        if (end == start) return 0;
        if (start > end) return 100;
        int  min = 100;
        for (int i = start; i < arr.length; i++) {

            for (int j = 1; j <= arr[start] ; j++)
                min =  Math.min(min, 1 + minJumps(arr, start + j, end));
        }
        return min;
    }

    /**
     * 52.
     * Problem: Implement two stacks in an array

     * Solution:
     */

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
     * 54.
     * Problem: Dynamic Programming | Set 14 (Maximum Sum Increasing Subsequence)
     * Given an array of n positive integers. Write a program to find the sum of maximum sum
     * subsequence of the given array such that the intgers in the subsequence are sorted in increasing order.
     * For example, if input is {1, 101, 2, 3, 100, 4, 5}, then output should be 106 (1 + 2 + 3 + 100)
     * Solution: Same as Lis but store sum
     */

    public static int sumLIS(int[] arr) {
        int[] maxSIS = new int[arr.length];
        for (int i = 0; i < arr.length; i++) maxSIS[i] = arr[i];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; i++)
                if (arr[j] < arr[i] && maxSIS[i] < maxSIS[j] + arr[i]) maxSIS[i] = maxSIS[i] + arr[i];
        }
        int maxSum = 0;
        for (int n : maxSIS) maxSum = Math.max(maxSum, n);
        return maxSum;
    }
    /**
     * 55.
     * Problem: Longest Monotonically Increasing Subsequence Size (N log N)

     * Solution:
     */
    /**
     * 56.
     * Problem: Find a triplet that sum to a given value
     * Given an array and a value, find if there is a triplet in array whose sum is equal to the given value.
     * If there is such a triplet present in array, then print the triplet and return true. Else return false.
     * Solution: Use Sorting (O(n2))
     */

    public static boolean isTriplet(int[] arr, int sum) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int newSum = sum - arr[i];
            int left = i + 1, right = arr.length - 1;
            while (left < right) {
                if(newSum == arr[left] + arr[right]) {
                    System.out.print(arr[i] + " " + arr[left] + " " + arr[right]);
                    return true;
                }
                else if (newSum < arr[left] + arr[right]) right--;
                else left++;
            }
        }
        return false;
    }
    /**
     * 57.
     * Problem: Find the smallest positive number missing from an unsorted array

     * Solution:
     */

    /**
     * 58.
     * Problem: Find the two numbers with odd occurrences in an unsorted array

     * Solution: Use Xor
     */

    public static void findTwoOddOccNum(int[] arr) {
        int xor = arr[0];
        int setBit, x = 0, y = 0;
        for (int i = 0; i < arr.length; i++) xor ^= arr[i];
        setBit = xor & (xor - 1);
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & setBit) == 1) x ^=  arr[i];
            else y ^= arr[i];
        }
        System.out.print(x + " " + y);
    }

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
     * Problem: Dynamic Programming | Set 20 (Maximum Length Chain of Pairs)

     * Solution:
     */


    /**
     * 68.
     * Problem: Find four elements that sum to a given value | Set 1 (n^3 solution)
     * Given an array of integers, find all combination of four elements in the array whose sum is equal to a given value X.
     * Solution:
     */



    /**
     * 69.
     * Problem: Find four elements that sum to a given value | Set 2 ( O(n^2Logn) Solution)
     * Given an array of integers, find all combination of four elements in the array whose sum is equal to a given value X.
     * Solution:
     */

    /**
     * 70.
     * Problem: Sort a nearly sorted (or K sorted) array
     * Given an array of n elements, where each element is at most k away from its target position,
     * devise an algorithm that sorts in O(n log k) time.

     * Solution: Method 1 (Insertion Sort) (O(nk))
     * Method 2  Use Min Heap of k Size O(nlogk)
     */



    /**
     * 71.
     * Problem: Maximum circular subarray sum
     * Given n numbers (both +ve and -ve), arranged in a circle, fnd the maximum sum of consecutive number.

     * Solution: Two cases
     * 1. simple contigious subaraay sum.
     * 2. contigious sum with ring. (remove chains of negative numbers : total sum - (-invert number and find sum)
     * return Marx(1, 2)
     */

    public static int maxSumCircularSubarray(int[] arr) {
        int totalSum = 0, withoutCircleSum = 0, circularSum = 0;
        withoutCircleSum = maxSumContigous(arr);
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = - arr[i];
        }
        circularSum = totalSum + maxSumContigous(arr);
        return Math.max(withoutCircleSum, circularSum);
    }

    /**
     * 72.
     * Problem: Find the row with maximum number of 1s

     * Solution:
     */
    /**
     * 73.
     * Problem: Median of two sorted arrays of different sizes
     * Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.
     * Solution:
     */

    /**
     * 74.
     * Problem: Shuffle a given array

     * Solution:
     */

    /**
     * 75.
     * Problem: Count the number of possible triangles
     * Given an unsorted array of positive integers. Find the number of triangles that can be formed with three different
     * array elements as three sides of triangles.
     * For a triangle to be possible from 3 values,
     * the sum of any two values (or sides) must be greater than the third value (or third side).
     * Solution: .
     */
    public static int countPossibleTriangle(int[] arr) {
        int   thirdSide, count = 0;
        Arrays.sort(arr);
        for (int firstSide = 0; firstSide < arr.length - 2; firstSide++) {
            thirdSide = firstSide + 2;
            for (int secondeSide = firstSide + 1; secondeSide < arr.length - 1; secondeSide++) {

                while (thirdSide < arr.length && arr[firstSide] + arr[secondeSide] > arr[thirdSide]) thirdSide++;
                count += thirdSide - secondeSide - 1;
            }
        }
        return count;
    }


    /**
     * 76.
     * Problem: Iterative Quick Sort

     * Solution:
     */

    /**
     * 77.
     * Problem: Find the number of islands

     * Solution:
     */


    /**
     * 78.
     * Problem: Construction of Longest Monotonically Increasing Subsequence (N log N)

     * Solution:
     */


    /**
     * 79.
     * Problem: Find the first circular tour that visits all petrol pumps

     * Solution:
     */

    /**
     * 80.
     * Problem: Arrange given numbers to form the biggest number
     * Solution: Use comparator to sort number
     */

    public static class MyComparator implements Comparator{


        public int compare(Object o1, Object o2) {
           String XY = String.valueOf(o1) + String.valueOf(o2);
            String YX = String.valueOf(o2) + String.valueOf(o1);
            return XY.compareTo(YX) > 0 ? 0: 1;
        }
    }
    public static void printBiggestNumber(ArrayList<Integer> arr) {

        Collections.sort(arr, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                String XY = String.valueOf(o1) + String.valueOf(o2);
                String YX = String.valueOf(o2) + String.valueOf(o1);
                int result = XY.compareTo(YX);
                return result > 0 ? -1 : 1;
            }
        });
        for (int n : arr) System.out.print(n);
    }

    /**
     * 81.
     * Problem: Pancake sorting

     * Solution:
     */

    /**
     * 82.
     * Problem:
     A Pancake Sorting Problem
     * Solution:
     */

    /**
     * 83.
     * Problem: Tug of War

     * Solution:
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
     * Solution: Use modified Binary Search
     * Search for the element with greater prev element and next element if they are present.
     */

    static int findMinElement(int[] arr, int left, int right) {
        if (left > right) return -1;
        else {
            int mid = left + (right - left) / 2;
            if (isMinimum(arr,mid)) return arr[mid];
            else if (arr[right - 1] > arr[mid]) return findMinElement(arr, left, mid - 1);
            else return findMinElement(arr, mid + 1, right);
        }
    }

    private static boolean isMinimum(int[] array, int mid) {
        int left = mid - 1 >= 0 ? array[mid - 1] : Integer.MAX_VALUE;
        int right = mid + 1 < array.length ? array[mid + 1] : Integer.MAX_VALUE;
        return array[mid] < left && array[mid] < right;
    }


    /**
     * 97.
     * Problem: Stable Marriage Problem


     * Solution: first row => last col in res Matrix and so on.
     */

    /**
     * 98.
     * Problem: Merge k sorted arrays
     * Given k sorted arrays of size n each, merge them and print the sorted output.
     * Solution: Use Min Heap.
     * 1. Create Priority Queue (size K) push first element of all arrays.
     * 2.Add root to output and replace next element.
     * 3. Repeat it for remaining elements. (nklog(k)).
     */

    static class MinHeapNode {
        int value;
        int nextIndex, currentIndex;
    }


    /**
     * 99.
     * Problem: Turn an image by 90 degree

     * Solution: first row => last col in res Matrix and so on.
     */




    /**
     * 100.
     * Problem: Move all zeroes to end of array
     * Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
     * For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
     * it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
     * The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).
     * Solution: place every element other than 0 at front, replace every element with 0 after that.
     */

    public static void moveZeros(int[] arr) {
        int count = 0;
        for (int num : arr) if (num != 0) arr[count++] = num;
        while (count < arr.length) arr[count++] = 0;
    }


    /**
     * 101.
     * Problem: Find number of pairs (x, y) in an array such that x^y > y^x
     * Given two arrays X[] and Y[] of positive integers, find number of pairs such that x^y > y^x where x is an element from X[] and y is an element from Y[].
     * Solution:
     */


    /**
     * 102.
     * Problem: Count all distinct pairs with difference equal to k
     * Given an integer array and a positive integer k, count all distinct pairs with difference equal to k.
     * Solution:
     */

    /**
     * 103.
     * Problem: Find if there is a subarray with 0 sum
     * Given an array of positive and negative numbers, find if there is a subarray (of size at-least one) with 0 sum.
     * Solution: Use HasMap
     * 1. Iterate array. Add it to sum
     * 2. a) Check curr is 0
     *    b) sum of 0 to i elements is 0
     *    c) map.get(sum) !=null
     */

    public static boolean isSubArray(int[] array) {
        int sumSoFar = 0;
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            sumSoFar += array[i];
            if (array[i] == 0 || sumSoFar == 0 || hMap.get(sumSoFar) != null) return true;
            hMap.put(sumSoFar, i);
        }
        return false;
    }

    /**
     * 104.
     * Problem: Smallest subarray with sum greater than a given value
     * Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.
     * Solution:
     */

    /**
     * 105.
     * Problem: Sort an array according to the order defined by another array

     * Solution:
     */

    /**
     * 106.
     * Problem: Maximum Sum Path in Two Arrays

     * Solution:
     */

    /**
     * 107.
     * Problem: Sort an array in wave form

     * Solution:
     */


    /**
     * 108.
     * Problem: K’th Smallest/Largest Element in Unsorted Array

     * Solution:
     */

    /**
     * 109.
     * Problem: K’th Smallest/Largest Element in Unsorted Array in Expected Linear Time

     * Solution:
     */

    /**
     * 110.
     * Problem: K’th Smallest/Largest Element in Unsorted Array in Worst Case Linear Time

     * Solution:
     */

    /**
     * 111.
     * Problem: Find Index of 0 to be replaced with 1 to get longest continuous sequence of 1s in a binary array

     * Solution:
     */

    /**
     * 112.
     * Problem: Find the closest pair from two sorted arrays

     * Solution:
     */

    /**
     * 113.
     * Problem: Given a sorted array and a number x, find the pair in array whose sum is closest to x

     * Solution:
     */


    /**
     * 114.
     * Problem: Count 1’s in a sorted binary array
     * Given a binary array sorted in non-increasing order, count the number of 1’s in it.
     * Solution: Use binary Serach (Find last occurance of 1)
     */

    public static int countOnes(int[] array, int start, int end) {

        if (start <= end) {

            int mid = start + (end - start) / 2;
            if (start == end || array[mid + 1] == 0 && array[mid] == 1) return mid + 1;
            else if (array[mid] < 1) return countOnes(array, start, mid - 1);
            else return countOnes(array, mid + 1, end);
        }
        return 0;
    }

    /**
     * 115.
     * Problem: Print All Distinct Elements of a given integer array
     * Given an integer array, print all distinct elements in array.
     * The given array may contain duplicates and the output should print every element only once.
     * The given array is not sorted.
     * Solution: Method 1. Use HashSet.
     * 2 Method 2 Sorting.
     */

    void printDistinct(int arr[])
    {
        Arrays.sort(arr);
        for (int i = 0; i< arr.length; i++) {
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) i++;
            System.out.print(arr[i]);
        }
    }

    public static void printDistinctHashing(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for (int n : arr) if (set.add(n)) System.out.print(n);
    }


    /**
     * 116.
     * Problem: Construct an array from its pair-sum array


     * Solution:
     */

    /**
     * 117.
     * Problem: Find common elements in three sorted arrays
     * Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
     * Solution: Take three pointer i, j, k
     * if (arr[i] == arr[j] && arr[j] == arr[k]) print it
     * else if (arr1[i] < arr2[j]) i++;
     * else if (arr2[j] < arr3[k) j++;
     * else k++;
     */
    public static void printIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) System.out.print(arr1[i]);
            else if (arr1[i] < arr2[j]) i++;
            else if (arr2[j] < arr3[k]) j++;
            else k++;
        }
    }


    /**
     * 118.
     * Problem: Find the first repeating element in an array of integers
     * Given an array of integers, find the first repeating element in it. We need to find the element that occurs more
     * than once and whose index of first occurrence is smallest.
     * Solution: Use HasSet
     * 1 Traverse array from right to left.
     * 2. if (repeat) update min else set.add(array[i])
     */

    public static int firstRepElement(int[] array) {
        int min  = -1;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = array.length - 1; i >= 0; i--) {
            if (set.contains(array[i])) min = i;
            else set.add(array[i]);
        }
        return min;
    }

    /**
     * 119.
     * Problem: Find the smallest positive integer value that cannot be represented as sum of any subset of a given array
     * Given a sorted array (sorted in non-decreasing order) of positive numbers,
     * find the smallest positive integer value that cannot be represented as sum of elements of any subset of given set.
     * Expected time complexity is O(n).
     *  Solution:
     *  1. Initialize result = 1 (smallest outcome).
     *  2 if ( arr[i] > result) found gap res is the answer
     *  3 else add arr[i] to result.
     */

    public static int findSmallest(int[] arr) {
        int res = 1;
        for (int i = 0; i < arr.length && res >= arr[i]; i++) res += arr[i];
        return res;
    }


    /**
     * 120.
     * Problem: Rearrange an array such that ‘arr[j]’ becomes ‘i’ if ‘arr[i]’ is ‘j’
     * Given an array of size n where all elements are in range from 0 to n-1, change contents of arr[] so that arr[i] = j is changed to arr[j] = i.
     * Solution: Method 1(Use temp Array and copy temp[arr[i]] = i; (O(n)) space is required.
     * Method 2 constant space
     * 1.The idea is based on the fact that the modified array is basically a permutation of input array.
     * We can find the target permutation by storing the next item before updating it.
     */

    /**
     * 121.
     * Problem: Find position of an element in a sorted array of infinite numbers

     * Solution:Since array is sorted, the first thing clicks into mind is binary search,
     * but the problem here is that we don’t know size of array.
     * If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.
     * Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
     * ->if it is greater than high index element then copy high index in low index and double the high index.
     * ->if it is smaller, then apply binary search on high and low indices found.
     */
    public static int binarySearch(int[] arr, int key, int start, int end) {
        if (start <= end) {
            int mid = (start + end) /2 ;
            if (key == arr[mid]) return mid;
            else if (arr[mid] > key) return binarySearch(arr, key, start, mid - 1);
            return binarySearch(arr, key, mid + 1, end);
        }
        return -1;
    }

    public static int findPos(int[] arr, int key) {
        int start = 0, end = 1, val = arr[start];
        while (val < key) {
            start = end;
            end *= 2;
            val = arr[end];
        }
        return binarySearch(arr, key, start, end);

    }

    /**
     * 122.
     * Problem: Can QuickSort be implemented in O(nLogn) worst case time complexity?

     * Solution: The answer is yes, we can achieve O(nLogn) worst case.
     * The idea is based on the fact that the median element of an unsorted array can be found in linear time.
     * So we find the median first, then partition the array around the median element.
     */

    /**
     * 123.
     * Problem: Check if a given array contains duplicate elements within k distance from each other

     * Solution:
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
    /**
     * 124.
     * Problem: Find the element that appears once
     * Given an array of integers. All numbers occur twice except one number which occurs once. Find the number in O(n) time & constant extra space.
     * Solution: Use Xor
     */

    /**
     * 125.
     * Problem: Replace every array element by multiplication of previous and next
     * Solution: Use prev
     */

    public static void replaceElement(int[] arr) {
        int prev = arr[0];
        int curr;
        arr[0] = prev * arr[1];
        for (int i = 1; i < arr.length - 1; i++) {
            curr = arr[i];
            arr[i] = prev * arr[i + 1];
            prev = curr;
        }
    }

    /**
     * 126.
     * Problem: Check if any two intervals overlap among a given set of intervals

     * Solution:
     */

    /**
     * 127.
     * Problem: Delete an element from array (Using two traversals and one traversal)

     * Solution:
     */
    /**
     * 128.
     * Problem: Find the largest pair sum in an unsorted array

     * Solution:
     */

    /**
     * 129.
     * Problem: Online algorithm for checking palindrome in a stream

     * Solution:
     */

    /**
     * 130.
     * Problem: Pythagorean Triplet in an array
     * Given an array of integers, write a function that returns true if there is a triplet (a, b, c)
     * that satisfies a2 + b2 = c2.
     * Solution: Use sorting
     * 1) Do square of every element in input array. This step takes O(n) time.
     * 2) Sort the squared array in increasing order. This step takes O(nLogn) time.
     * 3) To find a triplet (a, b, c) such that a = b + c,
     */

    public static void findPythTriplet(int[] arr) {
        for (int i = 0; i < arr.length; i++) arr[i] *= 2;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 2; i--) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (arr[i] + arr[left] == arr[right]) System.out.print(arr[i] + " " + arr[left] + " " + arr[right]);
                else if(arr[i] + arr[left] < arr[right]) left++;
                else right--;
            }
        }
    }


    /**
     * 131.
     * Problem: Maximum profit by buying and selling a share at most twice

     * Solution:
     */

    /**
     * 132.
     * Problem: Find Union and Intersection of two unsorted Arrays

     * Solution:
     */

    /**
     * 133.
     * Problem: Count frequencies of all elements in array in O(1) extra space and O(n) time

     * Solution:
     */

    /**
     * 134.
     * Problem: Generate all possible sorted arrays from alternate elements of two given sorted arrays

     * Solution:
     */


    /**
     * 135.
     * Problem: Minimum number of swaps required for arranging pairs adjacent to each other

     * Solution:
     */

    /**
     * 136.
     * Problem: Trapping Rain Water

     * Solution:
     */

    /**
     * 137.
     * Problem: Convert array into Zig-Zag fashion

     * Solution:
     */

    /**
     * 138.
     * Problem: Find maximum average subarray of k length

     * Solution:
     */

    /**
     * 139.
     * Problem: Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed  m

     * Solution:
     */

    /**
     * 140.
     * Problem: Reorder an array according to given indexes

     * Solution:
     */


    /**
     * 141.
     * Problem: Find zeroes to be flipped so that number of consecutive 1’s is maximized

     * Solution:
     */

    /**
     * 142.
     * Problem: Count triplets with sum smaller than a given value

     * Solution:
     */

    /**
     * 143.
     * Problem: Find the subarray with least average

     * Solution:
     */

    /**
     * 144.
     * Problem: Count Inversions of size three in a give array

     * Solution:
     */

    /**
     * 145.
     * Problem: Longest Span with same Sum in two Binary arrays

     * Solution:
     */

    /**
     * 146.
     * Problem: Merge two sorted arrays with O(1) extra space

     * Solution:
     */

    /**
     * 147.
     * Problem: Form minimum number from given sequence

     * Solution:
     */

    /**
     * 148.
     * Problem: Subarray/Substring vs Subsequence and Programs to Generate them

     * Solution:
     */




    /**
     * 149.
     * Problem:Count Strictly Increasing Subarrays
     * Given an array of integers, count number of subarrays (of size more than one) that are strictly increasing.
     * Expected Time Complexity : O(n)
     * Expected Extra Space: O(1)
     * Solution: Use formula len*(len - 1) /2 for sorted subarrays.
     */
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

//    /**
//     * 150.
//     * Problem: Rearrange an array in maximum minimum form
//     * Given a sorted array of positive integers, rearrange the array alternately i.e first element should be maximum value, second minimum value, third second max, fourth second min and so on.
//     * Solution:
//     */
//
//
//
//
//
//    //----------------------------------------------------------------------------------------------------------------
    // Swap Function
    public static void swapFunc(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
//
//    //----------------------------------------------------------------------------------------------------------------
//   /*
//   * Convert array into Zig-Zag fashion
//   * Given an array of distinct elements, rearrange the elements of array in zig-zag fashion in O(n) time. The converted array should be in form a < b > c < d > e < f.
//   * Example:
//   * Input:  arr[] = {4, 3, 7, 8, 6, 2, 1}
//   * Output: arr[] = {3, 7, 4, 8, 2, 6, 1}
//   * */
//    public static void zigZag(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//
//            if (i % 2 != 0) {
//                if (arr[i] < arr[i + 1]) swapFunc(arr, i, i + 1);
//            }else {
//                if (arr[i] > arr[i + 1]) swapFunc(arr, i, i + 1);
//            }
//        }
//
//    }
//
//
//
//    public static int end(int[] arr, int left, int right, int x) {
//
//        if (left > right) return -1;
//        int mid = (left + right) / 2;
//        if ((mid == arr.length - 1 ||  arr[mid + 1] > arr[mid]) && arr[mid] == x ) return mid;
//        else if (arr[mid] >= x) return end(arr, mid + 1, right, x);
//        else return end(arr, left, mid - 1, x);
//    }
//    public static int start(int[] arr, int left, int right, int x) {
//
//       if (left > right) return -1;
//       int mid = (left + right) / 2;
//       if ((mid == 0 ||  arr[mid - 1] < arr[mid]) &&  arr[mid] == x ) return mid;
//       else if (arr[mid] < x) return start(arr, mid + 1, right, x);
//       else return start(arr, left, mid - 1, x);
//   }
//
//    public static int numOccurance(int[] arr, int x) {
//
//        int s = start(arr, 0, arr.length - 1, x);
//        int e = end(arr, 0, arr.length - 1 , x);
//
//        if (s != -1 && e != -1) return e - s + 1;
//        else return -1;
//    }
//

    /**
     * 150.
     * Problem: Rearrange an array in maximum minimum form

     * Solution:
     */

    /**
     * 151.
     * Problem: Find minimum difference between any two elements

     * Solution:
     */

    /**
     * 152.
     * Problem: Find lost element from a duplicated array

     * Solution:
     */

    /**
     * 153.
     * Problem: Count pairs with given sum

     * Solution:
     */


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
    /**
     * 155.
     * Problem: Find minimum number of merge operations to make an array palindrome.
     * Given an array of positive integers. We need to make the given array a ‘Palindrome’.
     * Only allowed operation on array is merge. Merging two adjacent elements means replacing them with their sum.
     * The task is to find minimum number of merge operations required to make given array a ‘Palindrome’.
     */

    /**
     * 156.
     * Problem: Minimize the maximum difference between the heights.
     * Given heights of n towers and a value k. We need to either increase or decrease height of every tower by k
     * (only once) where k > 0. The task is to minimize the difference between the heights of the longest and the
     * shortest tower after modifications, and output this difference.
     */


















    public static void main(String[] args) {

        int[][] arr =  { {1, 3, 5, 7},
                {2, 4, 6, 8},
                {0, 9, 10, 11}} ;

        int[] a = {10, 5, 3, 4, 3, 5, 6};
        checkDuplicatesKDistance(a, 3);
      //  System.out.print(minJumps(a, 0, a.length -1));
//        findSubarray(a, 33);
//        System.out.print(maxSumCircularSubarray(a));
//        ArrayList<Integer> list = new ArrayList<Integer>();

//        for (int n : a) list.add(n);
//        printBiggestNumber(list);
//        System.out.print(countPossibleTriangle(a));
      //  System.out.print(findMinElement(arr, 0, arr.length - 1));
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
