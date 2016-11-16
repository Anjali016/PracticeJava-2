package divideandconquer;

public class QuickSort3Way {

    public static class Point {
        int i, j;
        Point() {
            this.i = 0;
            this.j = 0;
        }
    }

    public static void swapArray(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void partition(int[] arr, int left, int right, Point point) {

        if(left + 1 == right){
            if (arr[left] > arr[right]) swapArray(arr, left, right);
            point.i = left;
            point.j = right;
            return;
        }
        int mid = left;
        int pivot = arr[right];
        while (mid <= right) {

            if (arr[mid] < pivot) swapArray(arr, left++, mid++);
            else if (arr[mid] > pivot) swapArray(arr, mid, right--);
            else mid++;
        }

        point.i = left - 1;
        point.j = mid;

    }

    public static void quickSort3(int[] arr, int left, int right) {

        if (left >= right) return;
        Point point = new Point();
        partition(arr, left, right, point);
        quickSort3(arr, left, point.i);
        quickSort3(arr, point.j, right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2};
        quickSort3(arr, 0, arr.length - 1);

        for (int n : arr) System.out.print(n);
    }
}
