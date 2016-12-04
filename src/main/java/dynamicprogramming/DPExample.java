package dynamicprogramming;

import java.util.Map;

public class DPExample {

    /**
     * 1.
     * Problem: Path with maximum average value
     * Given a square matrix of size N*N, where each cell is associated with a specific cost.
     * A path is defined as a specific sequence of cells which starts from top left cell move only
     * right or down and ends on bottom right cell.
     * We want to find a path with maximum average over all existing paths.
     * Average is computed as total cost divided by number of cells visited in path.
     * <p>
     * Solution: One interesting observation is, the only allowed moves are down and right, we need N-1 down moves and N-1 right moves to reach destination (bottom rightmost).
     * So any path from from top left corner to bottom right corner requires 2N – 1 cells
     */

    // Naive Recursive
    public static int maxAvgPath(int[][] mat, int x, int y) {
        if (x >= mat.length || y >= mat[0].length) return 0;
        if (x == mat.length - 1 && y == mat[0].length - 1) return mat[x][y];
        else return mat[x][y] + Math.max(maxAvgPath(mat, x + 1, y), maxAvgPath(mat, x, y + 1));
    }

    //Bottom Up
    public static double maxAvgPathDP(int[][] mat) {
        int[][] maxPaths = new int[mat.length][mat[0].length];
        maxPaths[0][0] = mat[0][0];
        for (int i = 1; i < maxPaths.length; i++) maxPaths[i][0] = mat[i][0] + maxPaths[i - 1][0];
        for (int j = 1; j < maxPaths[0].length; j++) maxPaths[0][j] = mat[0][j] + maxPaths[0][j - 1];
        for (int i = 1; i < maxPaths.length; i++)
            for (int j = 1; j < maxPaths[0].length; j++)
                maxPaths[i][j] = mat[i][j] + Math.max(maxPaths[i - 1][j], maxPaths[i][j - 1]);
        return (double) maxPaths[mat.length - 1][mat[0].length - 1] / (2 * mat.length - 1);
    }

    public static void main(String[] args) {
        int[][] mat = {{4, 2, 3, 4, 1},
                {2, 9, 1, 10, 5},
                {15, 1, 3, 0, 20},
                {16, 92, 41, 44, 1},
                {8, 142, 250, 4, 8}};
//        String str = "ab";
//        System.out.print(countPalSequences(str,0, str.length() - 1));

//        String str = "banana";
//        String pat = "ban";
//        System.out.print(countSubsequenceOcc(str, pat, str.length(), pat.length()));
        int[] a = {1, 2};
        System.out.print(countIS("", a, 0));
    }

    /**
     * 2.
     * Problem: Recursively break a number in 3 parts to get maximum sum
     * Given a number n, we can divide it in only three parts n/2, n/3 and n/4 (we will consider only integer part).
     * The task is to find the maximum sum we can make by dividing number in three parts recursively and summing up them together.
     * Solution:
     */

    //Naive Recursive
    public static int breakSum(int num) {
        if (num == 0 || num == 1) return num;
        else return Math.max(breakSum(num / 2) + breakSum(num / 3) + breakSum(num / 4), num);
    }

    public static int breakSumDP(int num) {
        int[] sum = new int[num + 1];
        sum[1] = 1;
        for (int i = 2; i <= num; i++) sum[i] = Math.max(sum[i / 2] + sum[i / 3] + sum[i / 4], i);
        return sum[num];
    }


    /**
     * 3.
     * Problem: Count All Palindromic Subsequence in a given String
     * <p>
     * Solution:
     */

    public static int countPalSequences(String str, int m, int n) {
        if (m > n) return 0;
        else if (m == n) return 1;
        else if (str.charAt(m) == str.charAt(n))
            return 1 + countPalSequences(str, m + 1, n) + countPalSequences(str, m, n - 1);
        else
            return countPalSequences(str, m + 1, n) + countPalSequences(str, m, n - 1) - countPalSequences(str, m + 1, n - 1);

    }

    /**
     * 4.
     * Problem: Print all longest common sub-sequences in lexicographical order

     * Solution:
     */


    /**
     * 5.
     * Problem: Maximum weight path ending at any element of last row in a matrix
     * Given a matrix of integers where every element represents weight of the cell. Find the path having the maximum weight in matrix [N X N]. Path Traversal Rules are:
     * It should begin from top left element.
     * The path can end at any element of last row.
     * We can move to following two cells from a cell (i, j).
     * Down Move : (i+1, j)
     * Diagonal Move : (i+1, j+1)
     * Solution:
     */

    public static int maxPathsLastRow(int[][] mat, int x, int y) {
        if (x >= mat.length && y >= mat[0].length) return 0;
        if (x == mat.length - 1) return mat[x][y];
        else return mat[x][y] + Math.max(maxPathsLastRow(mat, x + 1, y), maxPathsLastRow(mat, x + 1, y + 1));
    }

    public static int maxPathLastRowDP(int[][] mat) {
        int[][] maxPath = new int[mat.length][mat[0].length];
        maxPath[0][0] = mat[0][0];
        for (int i = 1; i < maxPath.length; i++) maxPath[i][0] = mat[i][0] + maxPath[i - 1][0];
        for (int i = 1; i < maxPath.length; i++)
            for (int j = 1; j < maxPath[0].length; j++)
                maxPath[i][j] = mat[i][j] + Math.max(maxPath[i - 1][j], maxPath[i - 1][j - 1]);
        int res = 0;
        for (int j = 0; j < maxPath[0].length; j++) res = Math.max(res, maxPath[mat.length - 1][j]);
        return res;

    }


    /**
     * 6.
     * Problem: Number of permutation with K inversions

     * Solution:
     */


    /**
     * 7.
     * Problem: Game Theory : Choice of Area

     * Solution:
     */


    /**
     * 8.
     * Problem: All ways to add parenthesis for evaluation

     * Solution:
     */

    /**
     * 9.
     * Problem: Count all increasing subsequences
     * We are given an array of digits (values lie in range from 0 to 9).
     * The task is to count all the sub sequences possible in array such that in each subsequence every digit is
     * greater than its previous digits in the subsequence.
     * Solution:             Method 1
     * A Simple Solution is to use Dynamic Programming Solution of Longest Increasing Subsequence (LIS) problem.
     * Like LIS problem, we first compute count of increasing subsequences ending at every index.
     * Finally, we return sum of all values (In LCS problem, we return max of all values).
     * <p>
     * Method 2
     * The above solution doesn't use the fact that we have only 10 possible values in given array.
     * We can use this fact by using an array count[] such that count[d] stores current count digits smaller than d.
     */
    public static int countIS(String soFar, int[] array, int start) {
        if (start == array.length) {
            //System.out.println(soFar);
            return 1;
        }
        int count = 0;
        for (int i = start; i < array.length; i++) {
            System.out.println(soFar + array[i]);
            count += countIS(soFar + array[i], array, i + 1);
        }
        return count;
    }


    /**
     * 10.
     * Problem: Count distinct occurrences as a subsequence
     * Given a two strings S and T, find count of distinct occurrences of T in S as a subsequence.
     * Solution:
     */
    public static int countSubsequenceOcc(String str, String pat, int m, int n) {
        if (n == 0) return 1;
        else if (m == 0) return 0;
        else if (str.charAt(m - 1) != str.charAt(n - 1)) return countSubsequenceOcc(str, pat, m - 1, n);
        else return countSubsequenceOcc(str, pat, m - 1, n - 1) + countSubsequenceOcc(str, pat, m - 1, n);
    }


    /**
     * 11.
     * Problem: Longest repeating and non-overlapping substring

     * Solution:
     */


    /**
     * 12.
     * Problem: Find minimum sum such that one of every three consecutive elements is taken

     * Solution:
     */


    /**
     * 13.
     * Problem: Count Distinct Subsequences

     * Solution:
     */


    /**
     * 14.
     * Problem: Non-crossing lines to connect points in a circle

     * Solution:
     */

    /**
     * 15.
     * Problem: Count digit groupings of a number with given constraints

     * Solution:
     */

    /**
     * 16.
     * Problem: A Space Optimized DP solution for 0-1 Knapsack Problem

     * Solution:
     */


    /**
     * 17.
     * Problem: Find number of times a string occurs as a subsequence in given string

     * Solution:
     */


    /**
     * 18.
     * Problem: Minimum Cost To Make Two Strings Identical

     * Solution:
     */


    /**
     * 19.
     * Problem: Find all combinations of k-bit numbers with n bits set where 1 <= n <= k in sorted order

     * Solution:
     */


    /**
     * 20.
     * Problem: Longest Geometric Progression

     * Solution:
     */


    /**
     * 21.
     * Problem: Weighted Job Scheduling | Set 2 (Using LIS)

     * Solution:
     */


    /**
     * 22.
     * Problem: Print Maximum Length Chain of Pairs

     * Solution:
     */

    /**
     * 23.
     * Problem: Find Jobs involved in Weighted Job Scheduling

     * Solution:
     */


    /**
     * 24.
     * Problem: Printing Longest Bitonic Subsequence

     * Solution:
     */


    /**
     * 25.
     * Problem: Printing Maximum Sum Increasing Subsequence

     * Solution:
     */


    /**
     * 26.
     * Problem: Find minimum adjustment cost of an array

     * Solution:
     */


    /**
     * 27.
     * Problem: Dynamic Programming | High-effort vs. Low-effort Tasks Problem

     * Solution:
     */


    /**
     * 28.
     * Problem: Maximize arr[j] – arr[i] + arr[l] – arr[k], such that i < j < k < l

     * Solution:
     */


    /**
     * 29.
     * Problem: Construction of Longest Increasing Subsequence using Dynamic Programming

     * Solution:
     */

    /**
     * 30.
     * Problem: Find if string is K-Palindrome or not | Set 2

     * Solution:
     */


    /**
     * 31.
     * Problem: Printing Shortest Common Supersequence

     * Solution:
     */


    /**
     * 32.
     * Problem: Printing Longest Common Subsequence | Set 2 (Printing All)

     * Solution:
     */


    /**
     * 33.
     * Problem: Longest Common Increasing Subsequence (LCS + LIS)

     * Solution:
     */


    /**
     * 34.
     * Problem: Wildcard Pattern Matching

     * Solution:
     */


    /**
     * 35.
     * Problem: Find if string is K-Palindrome or not | Set 1

     * Solution:
     */


    /**
     * 36.
     * Problem: Find maximum length Snake sequence

     * Solution:
     */

    /**
     * 37.
     * Problem: Minimum time to finish tasks without skipping two consecutive

     * Solution:
     */


    /**
     * 38.
     * Problem: Maximum profit by buying and selling a share at most k times

     * Solution:
     */


    /**
     * 39.
     * Problem: A Space Optimized Solution of LCS

     * Solution:
     */


    /**
     * 40.
     * Problem: Ways to arrange Balls such that adjacent balls are of different types

     * Solution:
     */


    /**
     * 41.
     * Problem: Count number of ways to fill a “n x 4” grid using “1 x 4” tiles

     * Solution:
     */


    /**
     * 42.
     * Problem: Weighted Job Scheduling in O(n Log n) time

     * Solution:
     */


    /**
     * 43.
     * Problem: Count number of subsets having a particular XOR value

     * Solution:
     */

    /**
     * 44.
     * Problem: Permutation Coefficient

     * Solution:
     */


    /**
     * 45.
     * Problem: Longest Zig-Zag Subsequence

     * Solution:
     */


    /**
     * 46.
     * Problem: Compute nCr % p | Set 1 (Introduction and Dynamic Programming Solution)

     * Solution:
     */


    /**
     * 47.
     * Problem: Partition a set into two subsets such that the difference of subset sums is minimum

     * Solution:
     */


    /**
     * 48.
     * Problem: Count number of paths with at-most k turns

     * Solution:
     */


    /**
     * 49.
     * Problem: Count number of ways to partition a set into k subsets

     * Solution:
     */


    /**
     * 50.
     * Problem: Bell Numbers (Number of ways to Partition a Set)

     * Solution:
     */

    /**
     * 51.
     * Problem: Collect maximum coins before hitting a dead end

     * Solution:
     */


    /**
     * 52.
     * Problem: Number of paths with exactly k coins

     * Solution:
     */


    /**
     * 53.
     * Problem: Find minimum possible size of array with given rules for removing elements

     * Solution:
     */


    /**
     * 54.
     * Problem: Find number of solutions of a linear equation of n variables

     * Solution:
     */


    /**
     * 55.
     * Problem: Find the longest path in a matrix with given constraints

     * Solution:
     */


    /**
     * 56.
     * Problem: Count number of ways to cover a distance

     * Solution:
     */


    /**
     * 57.
     * Problem: Count even length binary sequences with same sum of first and second half bits

     * Solution:
     */

    /**
     * 58.
     * Problem: Longest Repeating Subsequence

     * Solution:
     */


    /**
     * 59.
     * Problem: Bitmasking and Dynamic Programming | Set 1 (Count ways to assign unique cap to every person)

     * Solution:
     */


    /**
     * 60.
     * Problem: Maximum weight transformation of a given string

     * Solution:
     */


    /**
     * 61.
     * Problem: Count total number of N digit numbers such that the difference between sum of even and odd digits is 1

     * Solution:
     */


    /**
     * 62.
     * Problem: Count of n digit numbers whose sum of digits equals to given sum

     * Solution:
     */


    /**
     * 63.
     * Problem: Minimum Initial Points to Reach Destination

     * Solution:
     */

    /**
     * 64.
     * Problem: Total number of non-decreasing numbers with n digits

     * Solution:
     */

    /**
     * 65.
     * Problem: Find length of the longest consecutive path from a given starting character

     * Solution:
     */

    /**
     * 66.
     * Problem: Tiling Problem

     * Solution:
     */

    /**
     * 67.
     * Problem: Minimum number of squares whose sum equals to given number n

     * Solution:
     */

    /**
     * 68.
     * Problem: Find minimum number of coins that make a given value

     * Solution:
     */

    /**
     * 69.
     * Problem: Collect maximum points in a grid using two traversals

     * Solution:
     */

    /**
     * 70.
     * Problem: Shortest Common Supersequence

     * Solution:
     */

    /**
     * 71.
     * Problem: Compute sum of digits in all numbers from 1 to n

     * Solution:
     */

    /**
     * 72.
     * Problem: Count possible ways to construct buildings

     * Solution:
     */

    /**
     * 73.
     * Problem: Maximum profit by buying and selling a share at most twice

     * Solution:
     */

    /**
     * 74.
     * Problem: How to print maximum number of A’s using given four keys

     * Solution:
     */

    /**
     * 75.
     * Problem: Find the minimum cost to reach destination using a train

     * Solution:
     */

    /**
     * 76.
     * Problem: Vertex Cover Problem | Set 2 (Dynamic Programming Solution for Tree)

     * Solution:
     */

    /**
     * 77.
     * Problem: Count number of ways to reach a given score in a game

     * Solution:
     */

    /**
     * 78.
     * Problem: Weighted Job Scheduling

     * Solution:
     */

    /**
     * 79.
     * Problem: Longest Even Length Substring such that Sum of First and Second Half is same

     * Solution:
     */

    /**
     * 80.
     * Problem: Minimum Cost Polygon Triangulation

     * Solution:
     */

    /**
     * 81.
     * Problem: Mobile Numeric Keypad Problem

     * Solution:
     */

    /**
     * 82.
     * Problem: Shortest path with exactly k edges in a directed and weighted graph

     * Solution:
     */

    /**
     * 83.
     * Problem: Count all possible walks from a source to a destination with exactly k edges

     * Solution:
     */



    /**
     * 84.
     * Problem: Count Possible Decodings of a given Digit Sequence

     * Solution:
     */

    /**
     * 85.
     * Problem: Count number of binary strings without consecutive 1’s

     * Solution:
     */

    /**
     * 86.
     * Problem: Dynamic Programming | Set 37 (Boolean Parenthesization Problem)

     * Solution:
     */

    /**
     * 87.
     * Problem: Program for nth Catalan Number

     * Solution:
     */


    /**
     * 88.
     * Problem: Remove minimum elements from either side such that 2*min becomes more than max

     * Solution:
     */

    /**
     * 89.
     * Problem: Count all possible paths from top left to bottom right of a mXn matrix

     * Solution:
     */

    /**
     * 90
     * Problem: Travelling Salesman Problem | Set 1 (Naive and Dynamic Programming)

     * Solution:
     */

    /**
     * 91
     * Problem: Dynamic Programming | Set 36 (Maximum Product Cutting)

     * Solution:
     */



    /**
     * 92
     * Problem: Dynamic Programming | Set 35 (Longest Arithmetic Progression)

     * Solution:
     */

    /**
     * 93
     * Problem: Dynamic Programming | Set 34 (Assembly Line Scheduling)

     * Solution:
     */

    /**
     * 94
     * Problem: Dynamic Programming | Set 33 (Find if a string is interleaved of two other strings)

     * Solution:
     */

    /**
     * 95
     * Problem: Dynamic Programming | Set 32 (Word Break Problem)

     * Solution:
     */




    /**
     * 96
     * Problem: Dynamic Programming | Set 31 (Optimal Strategy for a Game)

     * Solution:
     */

    /**
     * 97
     * Problem: Dynamic Programming | Set 30 (Dice Throw)

     * Solution:
     */

    /**
     * 98
     * Problem: Dynamic Programming | Set 29 (Longest Common Substring)

     * Solution:
     */

    /**
     * 99
     * Problem: Dynamic Programming | Set 28 (Minimum insertions to form a palindrome)

     * Solution:
     */


    /**
     * 100
     * Problem: Dynamic Programming | Set 27 (Maximum sum rectangle in a 2D matrix)

     * Solution:
     */

    /**
     * 101
     * Problem: Dynamic Programming | Set 26 (Largest Independent Set Problem)

     * Solution:
     */

    /**
     * 102
     * Problem: Dynamic Programming | Set 25 (Subset Sum Problem)

     * Solution:
     */

    /**
     * 103
     * Problem: Dynamic Programming | Set 24 (Optimal Binary Search Tree)

     * Solution:
     */



    /**
     * 104
     * Problem: Dynamic Programming | Set 23 (Bellman–Ford Algorithm)

     * Solution:
     */

    /**
     * 105
     * Problem: Longest Palindromic Substring | Set 1

     * Solution:
     */

    /**
     * 106
     * Problem: Dynamic Programming | Set 22 (Box Stacking Problem)

     * Solution:
     */

    /**
     * 107
     * Problem: Dynamic Programming | Set 21 (Variations of LIS)

     * Solution:
     */


    /**
     * 108
     * Problem: Dynamic Programming | Set 20 (Maximum Length Chain of Pairs)

     * Solution:
     */

    /**
     * 109
     * Problem: Dynamic Programming | Set 19 (Word Wrap Problem)

     * Solution:
     */

    /**
     * 110
     * Problem: Dynamic Programming | Set 18 (Partition problem)

     * Solution:
     */

    /**
     * 112
     * Problem: Dynamic Programming | Set 17 (Palindrome Partitioning)

     * Solution:
     */


    /**
     * 113
     * Problem: Dynamic Programming | Set 16 (Floyd Warshall Algorithm)

     * Solution:
     */


    /**
     * 114
     * Problem: Dynamic Programming | Set 15 (Longest Bitonic Subsequence)

     * Solution:
     */


    /**
     * 115
     * Problem: Dynamic Programming | Set 14 (Maximum Sum Increasing Subsequence)

     * Solution:
     */


    /**
     * 116
     * Problem: Dynamic Programming | Set 13 (Cutting a Rod)

     * Solution:
     */


    /**
     * 117
     * Problem: Dynamic Programming | Set 12 (Longest Palindromic Subsequence)

     * Solution:
     */

    /**
     * 118
     * Problem: Dynamic Programming | Set 11 (Egg Dropping Puzzle)

     * Solution:
     */


    /**
     * 119
     * Problem: Dynamic Programming | Set 10 ( 0-1 Knapsack Problem)

     * Solution:
     */


    /**
     * 120
     * Problem: Dynamic Programming | Set 9 (Binomial Coefficient)

     * Solution:
     */


    /**
     * 121
     * Problem: Dynamic Programming | Set 8 (Matrix Chain Multiplication)

     * Solution:
     */


    /**
     * 122
     * Problem: Dynamic Programming | Set 7 (Coin Change)

     * Solution:
     */


    /**
     * 123
     * Problem: Minimum number of jumps to reach end

     * Solution:
     */


    /**
     * 124
     * Problem: Length of the longest substring without repeating characters

     * Solution:
     */


    /**
     * 125
     * Problem: Dynamic Programming | Set 6 (Min Cost Path)

     * Solution:
     */


    /**
     * 126
     * Problem: Dynamic Programming | Set 5 (Edit Distance)

     * Solution:
     */


    /**
     * 127
     * Problem: Dynamic Programming | Set 4 (Longest Common Subsequence)

     * Solution:
     */


    /**
     * 128
     * Problem: Dynamic Programming | Set 3 (Longest Increasing Subsequence)

     * Solution:
     */


    /**
     * 129
     * Problem: Dynamic Programming | Set 2 (Optimal Substructure Property)

     * Solution:
     */


    /**
     * 130
     * Problem: Dynamic Programming | Set 1 (Overlapping Subproblems Property)

     * Solution:
     */


    /**
     * 131
     * Problem: Program for Fibonacci numbers

     * Solution:
     */

    /**
     * 132
     * Problem: Maximum size square sub-matrix with all 1s

     * Solution:
     */

    /**
     *
     * Problem: Ugly Numbers

     * Solution:
     */

    /**
     * 133
     * Problem: Largest Sum Contiguous Subarray

     * Solution:
     */

}
