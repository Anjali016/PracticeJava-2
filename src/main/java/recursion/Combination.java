package recursion;

public class Combination {

    public int getCombinaitons(int n, int k) {
        if (k == 0 || k == n) return 1;
        else return getCombinaitons(n - 1, k - 1) + getCombinaitons(n - 1, k);
    }
}
