package divideandconquer;

import java.util.Scanner;

public class NQueenProblem {
    static int[][] board;

    public static boolean isValidMove(int i, int j) {

        for (int col = j; col >= 0; col--)
            if(board[i][col] == 1)return false;

        for (int row = i, col = j; row >= 0 && col >= 0; col--, row--)
            if(board[row][col] == 1)return false;

        for (int row = i, col = j; row < board.length && col >= 0; col--, row++) {
            if (board[row][col] == 1) return false;
        }

        return true;
    }
    public static boolean solveQueen(int col) {

        if(col >= board[0].length) return true;

        for (int i = 0; i < board.length; i++) {
            if(isValidMove(i, col)) {
               board[i][col] = 1;
               if(solveQueen(col + 1)) return true;
                board[i][col] = 0;
            }
        }
        return false;
    }
    public static void solveQueens(int queens) {
        board = new int[queens][queens];
        if(!solveQueen(0)) System.out.println("No Solution Found!!!"); ;

    }
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        int queens = in.nextInt();
        solveQueens(queens);

        for (int i = 0 ; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
