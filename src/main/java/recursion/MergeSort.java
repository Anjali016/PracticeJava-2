package recursion;
/*
*               2  1          5 4
*              /    \       /    \
*             2      1      5     4
 *
 *             1 2           4 5
* */
public class MergeSort {

    public static void mergesort(int[] unsorted, int lEnd, int rEnd) {
        if (lEnd < rEnd) {
            int mid = (lEnd + rEnd) / 2;
            mergesort(unsorted, lEnd, mid);
            mergesort(unsorted, mid+1, rEnd);
            mergeIntoSorted(unsorted, lEnd, mid, rEnd );
        }

    }

    public static void mergeIntoSorted(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] lPart = new int[n1];
        int[] rPart = new int[n2];


        for (int i = 0; i < n1; i++)
            lPart[i] = arr[l + i];
        for (int i = 0 ; i < n2; i++)
            rPart[i] = arr[m + i + 1];

        int i = 0, j = 0;
        while (i < lPart.length && j < rPart.length) {

            if (lPart[i] < rPart[j]) arr[l++] = lPart[i++];
            else arr[l++] = rPart[j++];

        }

        while (i < lPart.length) arr[l++] = lPart[i++];
        while (j < rPart.length) arr[l++] = rPart[j++];

    }

    public static void main(String[] args) {
        int [] unsorted = {9, 8, 7, 6, 5, 4, 3};
        mergesort(unsorted, 0, unsorted.length - 1);
        for (int n : unsorted) System.out.print(n);
    }
}
