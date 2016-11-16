package recursion;
/*
* Given a number x, print all possible non-increasing sequences with sum equals to x.

                    1       2  3
* */
public class NonIncreasingSum {
    public static void printNonIncreasing(int n, int x, String sofar) {
        if (n < 0) return;
        if (n == 0) {
            System.out.println(sofar);
        }else {
            for (int i = 1; i <= x; i++) {
                printNonIncreasing(n - i, i, sofar + i);
            }
        }

    }
    public static void main(String[] args) {
        int x = 4;
        printNonIncreasing(x, x, "");
    }
}
