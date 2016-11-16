package heap;

/*
*         
* */
public class Heap {

    public static void buildHeap(int[] arr, int n) {

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    public static void heapify(int[] arr, int x, int n) {

      //  if (x > n / 2 - 1 && n > x) return;
        int largest = x;
        int left = 2 * x + 1;
        int right = 2 * x + 2;

        if(left < n && arr[left] > arr[largest]) {
           largest = left;
        }
        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (x != largest) {
            swap(arr, x, largest);
            heapify(arr, largest, n);
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void heapSort(int[] arr, int n) {
        if(n > 1) {
            swap(arr, n - 1, 0);
            heapify(arr, 0, n - 1);
            heapSort(arr, n - 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 2};
        buildHeap(arr, arr.length);
        heapSort(arr, arr.length);
        for (int n : arr) System.out.print(n + " ");
    }
}
