package sorting;

public class MergeSort {

    public static void mergeSort(int[] arr, int l, int r) {

        if(l < r){
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

    }

    public static void merge(int[] arr, int l, int mid , int r) {

        int[] left = new int[mid - l + 1];
        int[] right = new int[r - mid];
        for (int i = 0; i < left.length; i++){
            left[i] = arr[l + i];
        }
        for (int i = 0; i < right.length; i++){
            right[i] = arr[mid + i + 1];
        }
        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if(left[i] < right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];

    }

    public static void main(String[] args) {
        int[] arr = {0,9,8,7,5,32,1};
        mergeSort(arr, 0, arr.length - 1);
        for (int n : arr) System.out.print(n + " ");
    }
}
