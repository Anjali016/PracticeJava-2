package recursion;

import java.util.Map;

public class EditDistance {

    public static int editDistance(String str1, String str2, int m, int n) {

        if (m == 0) return n;
        if (n == 0) return m;
        if (str1.charAt(m - 1) == str2.charAt(n - 1)) return editDistance(str1, str2, m - 1, n - 1);
        //int min = Integer.MAX_VALUE;
        return Math.min(1 + editDistance(str1, str2, m, n - 1), Math.min(1 + editDistance(str1, str2, m - 1, n), 1 + editDistance(str1, str2, m - 1, n - 1)));

    }

    public static void main(String[] args) {
        String str1 = "front";
        String str2 = "noant";
        int res = editDistance(str1, str2, str1.length(), str2.length());
        System.out.print(res);
    }
}
