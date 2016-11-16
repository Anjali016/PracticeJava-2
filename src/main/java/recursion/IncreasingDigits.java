package recursion;
/*
*
*                 f()
*       0               1 2 3 4 5 6 7 8 9

       1 2 3 4 5 6 7 8 9
*
* */
public class IncreasingDigits {
    public static void solve(int n, String sofar, int start) {
        if (n == 0) {
            System.out.println(sofar);
        }else {
            for (int i = start; i < 10; i++) {
                solve(n-1, sofar + i, i+1);
            }
        }
    }

    public static void main(String[] args){
        solve(2, "", 0);
    }
}
