package dp;

public class LargestContigousSum {

    public static int largetContigousSum(int[] arr) {

        int currSum = arr[0], maxSum = currSum;
        for (int i = 1; i < arr.length; i++) {
            currSum += arr[i];
            if(currSum < 0) currSum = 0;
            if(maxSum < currSum) maxSum = currSum;

        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -4, 1,};
        System.out.print(largetContigousSum(arr));
    }
}
