package arrays;

import java.util.ArrayList;

public class KLeastNumbersFromeTwoArray {

    public static ArrayList<Integer> findKSmallestElements(int[] arr1, int[] arr2, int k) {

        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (i < arr1.length && j < arr2.length && k > 0) {

            if (arr1[i] < arr2[j])
                result.add(arr1[i++]);
             else
                result.add(arr2[j++]);

            k--;
        }

        while (k > 0 && i < arr1.length) {
            result.add(arr1[i++]);
            k--;
        }
        while (k > 0 && j < arr2.length) {
            result.add(arr2[j++]);
            k--;
        }

        return result;
    }

    public static void main(String[] args ){

        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {2, 4};
        ArrayList<Integer> result = findKSmallestElements(arr1, arr2, 5);
        for (int n : result) System.out.print(n + " ");
    }
}
