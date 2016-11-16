package arrays;

public class MaxZeroByFlipingSubArray {

    public static int maxZero(int[] arr) {

        int countZeroes = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i] = -1;
                countZeroes++;
            }
        }

        int maxSofar = Integer.MIN_VALUE, curr = arr[0];

        for (int i = 1; i< arr.length; i++) {

            curr = Math.max(arr[i], curr + arr[i]);
            maxSofar = Math.max(curr, maxSofar);
        }

        return maxSofar + countZeroes;
    }

    public static void main(String[] args ){

        int[] arr = {0, 0, 0, 1, 0, 1};
        System.out.print(maxZero(arr));
    }
}
