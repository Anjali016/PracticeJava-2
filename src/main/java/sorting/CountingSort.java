package sorting;

public class CountingSort {

    public static void countingSort(int[] input, int k) {

        int[] count = new int[k];
        for (int in : input) {
            count[in]++;
        }

        int total = 0;
        for (int i = 0 ; i < k; i++) {
            int oldvalue = count[i];
            count[i] = total;
            total += oldvalue;
        }

        int[] output = new int[input.length];
        for (int in: input) {

            output[count[in]] = in;
            count[in]++;
        }

        for (int i : output) System.out.print(i);
    }

    public static void main(String[] args) {
        int[] input = {3,1,1,2,3,4,1,2,3, 2, 2};
        countingSort(input, 7);
    }
}
