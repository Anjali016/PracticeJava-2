package matrix;

public class MatrixExamples {

    /**
     * 1.
     * Problem: Search in a row wise and column wise sorted matrix.
     * Given an n x n matrix, where every row and column is sorted in increasing order. Given a number x, how to
     * decide whether this x is in the matrix. The designed algorithm should have linear time complexity.
     *
     * Solution: Start from top right corner. To get smaller element move left and for bigger elements go down.
     */
    public static boolean searchInSortedMat(int[][] mat, int key, int x, int y) {

        if (mat.length <= x || mat[0].length <= y) return false;
        else if (mat[x][y] == key) return true;
        else if (mat[x][y] > key) return searchInSortedMat(mat, key, x, y - 1);
        else return searchInSortedMat(mat, key, x + 1, y);
    }
    /**
     * 2.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    public static void printSpiralForm(int[][] mat) {
        int m = mat.length, n = mat[0].length, left = 0, top = 0, right = n - 1, bottom = m - 1;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) System.out.print(mat[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(mat[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) System.out.print(mat[bottom][i] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(mat[i][left] + " ");
                left++;
            }
        }
    }

    /**
     * 3.
     * Problem: A Boolean Matrix Question.
     * Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true)
     * then make all the cells of ith row and jth column as 1.
     *
     * Solution: Either use auxiliary matrix and two hashsets for row and column or to save space use first col and row
     * as hashsets.
     */

    /**
     *  1 2 3
     * 4.
     *Given a cost matrix cost[][] and a position (m, n) in cost[][],
     * write a function that returns cost of minimum cost path to reach (m, n) from (0, 0).
     * Each cell of the matrix represents a cost to traverse through that cell.
     * Total cost of a path to reach (m, n) is sum of all the costs on that path (including both source and destination).
     * You can only traverse down, right and diagonally lower cells from a given cell, i.e.,
     * from a given cell (i, j), cells (i+1, j), (i, j+1) and (i+1, j+1) can be traversed.
     * You may assume that all costs are positive integers.
     */

     public static int minPath(int[][] mat, int x, int y) {

         if((x >= mat.length || y >= mat[0].length)) return Integer.MAX_VALUE;
         else if (x == mat.length - 1 && y == mat[0].length - 1) return mat[x][y];
         else
             return mat[x][y] + Math.min(minPath(mat, x + 1, y), Math.min(minPath(mat, x, y + 1),
                        minPath(mat, x + 1, y + 1)));
     }

    public static int minPathDP(int[][] mat) {
        int[][] minPath = new int[mat.length][mat[0].length];
        minPath[0][0] = mat[0][0];
        for (int i = 1; i < mat.length; i++) minPath[i][0] = minPath[i - 1][0] + mat[i][0] ;
        for (int i = 1; i < mat[0].length; i++) minPath[0][i] = minPath[0][i - 1] + mat[0][i];

        for (int i = 1; i < mat.length; i++)
            for (int j = 1; j < mat[0].length; j++)
                minPath[i][j] = mat[i][j] + Math.min(minPath[i - 1][j], Math.min(minPath[i][j - 1], minPath[i - 1][j - 1]));
        return minPath[mat.length - 1][mat[0].length - 1];
    }


    public static void main(String[] args) {
        int[][] mat = {{1}};
        printSpiralForm(mat);
//        System.out.print(searchInSortedMat(mat, 8, 0, mat[0].length - 1));

    }



    /**
     * 5.
     * Number of paths with exactly k coins
     * Given a matrix where every cell has some number of coins.
     * Count number of ways to reach bottom right from top left with exactly k coins.
     * We can move to (i+1, j) and (i, j+1) from a cell (i, j).
     */

    public static int findPaths(int[][] mat, int x, int y, int k) {

        if (x >= mat.length || y >= mat[0].length) return 0;
        else if (x  == mat.length - 1 && y == mat[0].length - 1 && k == mat[x][y]) return 1;
        else return findPaths(mat, x + 1, y, k - mat[x][y]) + findPaths(mat, x, y + 1, k - mat[x][y]);
    }

    /**
     * 6.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 7.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 8.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 9.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 10.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 11.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 12.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 13.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 14.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 15.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 16.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 17.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 18.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 19.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 20.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 21.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 22.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */


    /**
     * 23.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 24.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 25.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 26.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 27.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 28.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 29.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 30.
     * Problem: Rotate Matrix Elements.
     * Given a matrix, clockwise rotate elements in it.
     * Solution: Use temp and spiral form similar
     */

    public static void rotateMatrix(int[] arr) {
        int  m = arr.length - 1, n = arr.length - 1, left = 0, right = n, top = 0, bottom = m;

//        while ()

    }

    /**
     * 31.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 32.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */


    /**
     * 33.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 34.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 35.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 36.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 37.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 38.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 39.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 40.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */


    /**
     * 41.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 42.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */


    /**
     * 43.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 44.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 45.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 46.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 47.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 48.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 49.
     * Problem :Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 50.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */


    /**
     * 1.
     * Problem: Longest repeating and non-overlapping substring

     * Solution:
     */


    /**
     * 2.
     * Problem: Find minimum sum such that one of every three consecutive elements is taken

     * Solution:
     */


    /**
     * 3.
     * Problem: Count Distinct Subsequences

     * Solution:
     */


    /**
     * 4.
     * Problem: Non-crossing lines to connect points in a circle

     * Solution:
     */

    /**
     * 5.
     * Problem: Count digit groupings of a number with given constraints

     * Solution:
     */

    /**
     * 6.
     * Problem: A Space Optimized DP solution for 0-1 Knapsack Problem

     * Solution:
     */


    /**
     * 7.
     * Problem: Find number of times a string occurs as a subsequence in given string

     * Solution:
     */


    /**
     * 8.
     * Problem: Minimum Cost To Make Two Strings Identical

     * Solution:
     */


    /**
     * 9.
     * Problem: Find all combinations of k-bit numbers with n bits set where 1 <= n <= k in sorted order

     * Solution:
     */


    /**
     * 10.
     * Problem: Longest Geometric Progression

     * Solution:
     */


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

}
