package recursion;

public class MaxSubset {

    public static int maxSubset(int[] requests, int request) {

        if (request == 0) return 0;
        return Math.max(requests[request - 1] + maxSubset(requests, request - 1), maxSubset(requests, request - 1));
    }

    public static void main(String[] args) {

        int[] requests = {-1, 10 , 10};
        System.out.print(maxSubsetDP(requests, requests.length));
    }

    public static int maxSubsetDP(int[] requests, int request) {
        int[][] dp = new int[request + 1][request + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {

                if (i == 0 || j == 0) dp[i][j] = 0;
                else {
                    dp[i][j] = Math.max(requests[j - 1] + dp[i - 1][j - 1], dp[i - 1][j - 1]);
                }
            }
        }
        return dp[dp.length - 1][dp.length - 1];
    }

}
