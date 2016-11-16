package sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j > -1 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 3};
        insertionSort(arr);
        for (int n : arr) System.out.print(n +" ");
    }
}
