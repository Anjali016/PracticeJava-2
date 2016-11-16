package recursion;

/*
*          0
*        1   -1                         0
*      3    1                         /    \
     6   0 4                         -1
                                     /
                                   -3
                                   / \
                                 -6   0
                                    -5
*      4
* */

public class OptimalWayToReach {
    static int[] moves = {-1, 1};

   static int minMoves = Integer.MAX_VALUE;
    public static void isReachable(int dest, int source, int count, int n) {
        if(Math.abs(source) > dest) return;
        if (source == dest) {
            if(minMoves > count)
                minMoves = count;
                 return;
        }
        else {
            for (int move : moves){
                isReachable(dest, source+ n * move, count + 1, n + 1);
            }

        }
    }

    public static void main(String[] args) {

        isReachable(3, 0, 0, 1);
        System.out.print(minMoves);
    }

}
