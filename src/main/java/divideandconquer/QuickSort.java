package divideandconquer;

public class QuickSort {

    public static void swapElement(int[] arr, int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static int partition(int[] arr, int left, int right) {

        int pivot = arr[left];
        int j = left;

        for (int i = left + 1; i <= right; i++) {

            if(arr[i] <= pivot) {
                j++;
                swapElement(arr, i, j);
            }
        }
        swapElement(arr, left, j);
        return j;
    }

    public static void quickSort(int[] arr, int left , int right) {

       /* if(left >= right) return;
        int p = partition(arr, left, right);
        quickSort(arr, left, p - 1);
        quickSort(arr, p + 1, right);*/

        while (left < right) {

            int p = partition(arr, left, right);
            quickSort(arr, left, p - 1);
            left = p + 1;
        }
    }

    public static void main(String[] args) {

        int[] arr = {8,3454, 54,3};
        quickSort(arr, 0, arr.length - 1);
        for (int n: arr) System.out.print(n + " ");
    }
}
