package arrays;

public class PeakFinder {

    public static int peak(int[] arr) {

        if(arr.length == 1) return 0;
        for (int i = 0; i < arr.length; i++) {

            if(i == 0) {
                if(arr[i] >= arr[i + 1]) return i;
            }
            else if(i == arr.length - 1){
                if(arr[i - 1] <= arr[i]) return i;
            }else {
                if(arr[i - 1] <= arr[i] && arr[i] >= arr[i + 1]) return i;
            }

        }

        return -1;
    }

    public static int peakRecursion(int[] arr, int l, int r) {

        if(l == r) return l;
        int mid = (l + r) / 2;
        if(mid > 0 && arr[mid] < arr[mid - 1]) return peakRecursion(arr, l, mid - 1);
        else if(mid < arr.length - 1 && arr[mid] < arr[mid + 1]) return peakRecursion(arr, mid + 1, r);
        else return mid;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1};
        System.out.print(peakRecursion(arr, 0, arr.length - 1));
    }
}
