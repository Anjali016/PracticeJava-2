package recursion;

import java.util.ArrayList;
/*
*       1 1 1 1
*       1 1 1 1
*       1 1 1 0
        1 1 1 1
* */
public class PathInGrid {

    int[] rowMoves = {1, 0};
    int[] colMoves = {0, 1};

    public boolean isValidMove(int[][] mat, int x, int y) {
        return x >= 0 && x < mat.length && y < mat[0].length && y >= 0 && mat[x][y] == 1;
    }
    public boolean isPath(int[][] mat, int x, int y) {
        if (x == mat.length - 1 && y == mat[0].length - 1)
            return true;
        else {
                for (int i = 0 ; i < 2; i++) {
                    if ( isValidMove(mat, x + rowMoves[i], y + colMoves[i])){
                    if (isPath(mat, x + rowMoves[i], y + colMoves[i] )) return true;
                }
            }
        }
        return false;
    }
}
