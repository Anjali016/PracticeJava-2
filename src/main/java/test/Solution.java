package test;

import java.util.ArrayList;
import java.util.Scanner;


public class Solution {

    public static int maxSubarray(int[] arr) {

        int currMax = arr[0];
        int maxSofar = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSofar = Math.max(currMax, maxSofar);
        }

        return maxSofar;
    }



    public static int maxConnectedCell(int[][] grid) {

        int m = grid.length;
        int n = grid.length;
        boolean [][] isVisited = new boolean[m][n];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if(!isVisited[i][j] && grid[i][j] == 1) {
//                    int temp = dfs(grid, i, j, isVisited);
//                    if (temp > max) max = temp;
                }
            }
        }

        return max;
    }
//
//    public static boolean isValidMove(ArrayList<ArrayList<Integer>> grid, int x, int y, boolean[][] isVisited) {
//
//        return (x >=0 && x < grid.size() && y >= 0  && y < grid.get(0).size() && grid.get(0).get(0) == 1 && !isVisited[x][y]);
//    }
//
//
//
//    public static int dfs (ArrayList<ArrayList<Integer>> grid, int x, int y, boolean[][] isVisited) {
//
//        if (!isValidMove(grid, x, y, isVisited)) return 0;
//        else {
//            isVisited[x][y] = true;
//            return  1 + dfs(grid, x - 1, y, isVisited) + dfs(grid, x - 1, y - 1, isVisited) + dfs(grid, x - 1, y + 1, isVisited)
//                    + dfs(grid, x + 1, y, isVisited) +
//                    dfs(grid, x + 1, y - 1, isVisited) + dfs(grid, x + 1, y + 1, isVisited) + dfs(grid, x + 1, y + 1, isVisited)
//                    + dfs(grid, x, y + 1, isVisited) + dfs(grid, x, y - 1, isVisited);
//        }
//    }


    public static void main(String[] args) {
//         Scanner in  = new Scanner(System.in);
//        int m = in.nextInt();
//        int n = in.nextInt();
//        int[][] grid = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                grid[i][j] = in.nextInt();
//             }
//
//        }
        int[] arr = {2, -1, 2, 3, 4, -5};
        System.out.print(maxSubarray(arr));
//        System.out.println(maxConnectedCell(grid));
    }
}
