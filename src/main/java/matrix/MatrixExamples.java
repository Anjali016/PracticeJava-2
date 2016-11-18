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

    /**
     * 2.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

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
        int[][] mat = {{1, 2, 3},{4, 8, 2},{1, 5, 3}};
        System.out.print(minPathDP(mat));

    }



    /**
     * 5.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

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
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

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
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */

    /**
     * 50.
     * Print a given matrix in spiral form.
     *
     * Solution: Use 4 for loops.
     */




}