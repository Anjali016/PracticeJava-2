package recursion;
/*
*
*   0 0 0 0
*   0 0 0 0
*   1 0 0 0
*   0 0 0 0
* */
public class QeensProblem {
    static int[][] board;


    public static boolean isValidMove(int x, int y) {
       // row checking
        for (int col = y; col >= 0; col--) if (board[x][col] == 1) return false;
        // digonal checking
        for (int row = x, col = y; row >= 0 && col >= 0; row--, col--) if(board[row][col] == 1) return false;

        // digonal checking
        for (int row = x, col = y; row < board.length && y >= 0; row++, y--) if(board[row][col] == 1) return false;
        return true;
    }
    public static boolean solve(int col) {
        if( col >= board[0].length)
            return true;
        else {
            for (int row = 0; row < board.length; row++){
                if(isValidMove(row, col)){
                    board[row][col] = 1;
                    if(solve(col+1)) return true;
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    public static int[][] solveProblem(int queens) {
        board = new int[queens][queens];
        solve(0);

        return board;
    }


    public static void main(String[] args) {

        int[][] board = solveProblem(4);

        for (int i = 0 ; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
