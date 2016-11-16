package sorting;

import java.util.Scanner;

public class SortAnArray012 {

    public static void sortArray(int[] arr) {
        int zeroCount = 0, oneCount = 0, twoCount = 0;

        for (Integer n : arr){
            if (n == 0)
                zeroCount++;
            else if (n == 1)
                oneCount++;
            else
                twoCount++;
        }


        for (int j = 0; j < zeroCount; j++)
            arr[j] = 0;
        for (int j = zeroCount; j < oneCount + zeroCount; j++)
            arr[j] = 1;
        for (int j = oneCount + zeroCount; j < arr.length; j++)
            arr[j] = 2;

        for (int n : arr) System.out.print(n +" ");
        System.out.println();

    }
static int maxSofar ;
    public static void solve(int[] arr) {

        int[] res = new  int[arr.length];
        res[arr.length - 1]  = -1;
        maxSofar = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0 ; i--) {
            int j = i + 1;
            res[i] = best(arr[i], arr[j]);
        }

        for (int n : res)
            System.out.print(n + " ");
        System.out.println();

    }

    public static int best(int x, int y) {

        if(x < y && x < maxSofar) return Math.min(maxSofar, y);
        else if (x > y && x > maxSofar) {
            maxSofar = x;
            return -1;
        }
        else {
            int temp = maxSofar ;
            maxSofar = Math.min(maxSofar, x);
            return temp;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int j = 0; j < testCases; j++){
            int len = in.nextInt();
            int[] array = new int[len];
            for (int i = 0; i < len; i++)
                array[i] = in.nextInt();
           // sortArray(array);
            solve(array);

        }
    }
}
