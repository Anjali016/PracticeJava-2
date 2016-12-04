package dynamicprogramming.strings.problems;

import java.util.LinkedHashSet;
import java.util.Set;

public class DPproblemsStrings {

    /*
    * Count distinct occurrences as a subsequence
    *
    * EX  banana   ban
    * output {ban},  {ba  n}  {b   an},
    * */

    public static int countSubsequence(String s, String t, int m, int n) {

        if (n == 0) return 1;
        else if (m == 0) return 0;
        else if (s.charAt(m - 1) != t.charAt(n - 1)) return countSubsequence(s, t, m - 1, n);
        else return countSubsequence(s, t, m - 1, n - 1) + countSubsequence(s, t, m - 1, n);
    }

    public static int countSubsequenceDP(String s, String t, int m, int n) {

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++){
                if (i == 0) dp[i][j] = 0;
                else if (j == 0) dp[i][j] = 1;
                else if(s.charAt(i - 1) != t.charAt(j - 1)) dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];

            }
        }
        return dp[m][n];
    }

/*
*   Minimun Cost to make String equal by deleting characters
*
*   Input :  X = "abcd", Y = "acdb", costX = 10, costY = 20.
Output:  30
* */

    public static int minCost(String s1, String s2, int m, int n, int costS1, int costS2) {

        if (m == 0) return n * costS2;
        else if (n == 0) return m * costS1;
        else if (s1.charAt(m - 1) == s2.charAt(n - 1)) return minCost(s1, s2, m - 1, n - 1, costS1, costS2);
        else return Math.min((costS1 + minCost(s1, s2, m - 1, n, costS1, costS2)),
                    (costS2 + minCost(s1, s2, m, n -1, costS1, costS2)));
    }

    public static int minCostDP(String x, String y, int m, int n, int costX, int costY) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) dp[i][j] = costY * j;
                else if (j == 0) dp[i][j] = costX * i;
                else if (x.charAt(i - 1) == y.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = Math.min(costX + dp[i - 1][j], costY + dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }

    /*
    *   Longest Palindrome Substring
    * */

    public static int longCommonSubstring(String x, String y, int m, int n) {
        int[][]dp = new int[m + 1][n + 1];
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) dp[i][j] = 0;
                else if (x.charAt(i - 1) == y.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    res = Math.max(res, dp[i][j]);
                }
                else dp[i][j] = 0;
            }
        }
        return res;
    }

/*
*   Longest Common Subsequence
*LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
*
* */

    public static int LCS(String x, String y, int m, int n) {

        if (m == 0 || n == 0) return 0;
        else if (x.charAt(m - 1) == y.charAt(n - 1)) return 1 + LCS(x, y, m - 1, n - 1);
        else return Math.max(LCS(x, y, m - 1, n), LCS(x, y, m, n - 1));
    }

    public static int LCSDP(String x, String y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) dp[i][j] = 0;
                else if (j == 0) dp[i][j] = 0;
                else if (x.charAt(i - 1) == y.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }


    /*
    *Shortest Common Supersequence
Input:   str1 = "geek",  str2 = "eke"
Output: "geeke
    * */

    public static int shortestseq(String x, String y, int m, int n) {

        if (m == 0) return n;
        else if (n == 0) return m;
        else if(x.charAt(m - 1) == y.charAt(n - 1)) return 1 + shortestseq(x, y, m - 1, n - 1);
        else return 1 + Math.min(shortestseq(x, y, m - 1, n), shortestseq(x, y, m, n - 1));
    }

    public static int shortestSeqDP(String x, String y, int m, int n) {

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else if (x.charAt(i - 1) == y.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }

    /*
    *
    * Given two strings str1 and str2 and below operations that can performed on str1. Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.
    Insert
    Remove
    Replace

    Input:   str1 = "geek", str2 = "gesek"
Output:  1

    * */

    public static int editDistance(String x, String y, int m, int n) {

        if (m == 0) return n;
        else if (n == 0) return m;
        else if (x.charAt(m - 1) == y.charAt(n - 1)) return editDistance(x, y, m - 1, n - 1);
        else return 1 + Math.min(editDistance(x, y, m, n - 1), Math.min(editDistance(x, y, m - 1, n),
                    editDistance(x, y, m - 1, n - 1)));
    }

    public static int editDistanceDP(String x, String y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else if (x.charAt(i - 1) == y.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] =  1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
            }
        }
        return dp[m][n];
    }

    /*
    * Length of the longest substring without repeating characters
    Given a string, find the length of the longest substring without repeating characters.
    For example, the longest substrings without
     repeating characters for “ABDEFGABEF” are “BDEFGA” and “DEFGAB”, with length 6.
    * */

    public static int longestSubNoRep(String s) {
        Set<Character> set = new LinkedHashSet<Character>();
        int maxSofar = 0;
        int currMax = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                currMax++;
            }else {
                set = new LinkedHashSet<Character>();
                set.add(ch);
                currMax = 1;
            }

            maxSofar = Math.max(currMax, maxSofar);
        }

        return maxSofar;
    }

    public static int longestPalSeq(String s, int l, int r) {

        if (l == r) return 1;
        else if (s.charAt(l) == s.charAt(r) && l + 1 == r)  return 2 ;
        else if (s.charAt(l) == s.charAt(r)) return 2 + longestPalSeq(s, l + 1, r - 1);
        else return Math.max(longestPalSeq(s, l + 1, r), longestPalSeq(s, l, r - 1));
    }

    public static int longestPalSeqDP(String s, int l, int r) {
        int dp[][] = new int[s.length() + 1][ s.length() + 1];

        return 0;
    }

    /*
    *Given a string, find the minimum number of characters to be inserted to convert it to palindrome.

    * */

    public static int minPalindromCost(String s, int l, int r) {

        if (l == r) return 0;
        else if (s.charAt(l) == s.charAt(r) && l + 1 == r) return 0;
        else if (s.charAt(l) == s.charAt(r)) return minPalindromCost(s, l + 1, r - 1);
        else return 1 + Math.min(minPalindromCost(s, l, r - 1), minPalindromCost(s, l + 1, r));
    }

    public static int minPalindromCostDP(String s, int l, int r) {

        return 0;
    }

    public static void main(String[] args) {

        String s = "abcda";
        String t = "ban";
//        System.out.print(editDistanceDP(s, t, s.length(), t.length()));
       int res = minPalindromCost(s, 0, s.length() - 1);
        System.out.print(res);
    }

}
