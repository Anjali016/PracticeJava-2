package divideandconquer;

public class LongestContigousSum {

    public static int sumCrossingTwoArrays(int[] arr, int left, int mid, int right) {

        int sum = 0;
        int leftSum = 0, rightSum = 0;
        for (int i = mid; i >= left; i--) sum += arr[i];
        leftSum = sum;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum+= arr[i];
            rightSum = sum;
        }
        return leftSum + rightSum;
    }
    public static int longestContigousSum(int[] arr, int l, int r) {

        if (l == r) return arr[l];
        int mid = (l + r) / 2;

        return Math.max(sumCrossingTwoArrays(arr, l, mid, r), Math.max(longestContigousSum(arr, l, mid), longestContigousSum(arr, mid + 1, r)));
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, -100, 101};

        System.out.print(longestContigousSum(arr, 0, arr.length - 1));
    }
}
