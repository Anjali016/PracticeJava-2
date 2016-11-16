package divideandconquer;

public class BinarySearch {

    public static int binarySearch(int[] array, int key, int left, int right) {

        if (right < left) return -1;
        int mid = left + (right - left)/2;
        if (array[mid] == key) return mid;
        else if (array[mid] > key) return binarySearch(array, key, left, mid - 1);
        else return binarySearch(array, key, mid + 1, right);
    }
}
