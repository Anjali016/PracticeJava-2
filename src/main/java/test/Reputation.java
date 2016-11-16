package test;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Reputation {

    public static int maxReputation(int[] boys, int [] girls, int m) {
        return Math.max(getRep(boys,girls,m), getRep(girls,boys,m));
    }

    static int getRep(int[] array1, int [] array2, int m) {
        int rep = 0;
        NumberFormat formatter = new DecimalFormat("#0.000000");

        for (int i = 0; i < array1.length; i++) {
            array1[i] += m;
            int tempRep = 0;
            for (int j = 0; j < array1.length; j++) tempRep += (array1[i] * array2[i]);

            array1[i] -=m;
            rep = Math.max(rep, tempRep);
        }
        return rep;
    }

    public static BigInteger getSum(BigInteger[] arr) {
        BigInteger sum = BigInteger.ZERO;

        for(BigInteger n : arr) sum = sum.add(n);
        return sum;
    }

    public static int getDiagSum(int[][] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) sum += arr[i][i];
        return sum;
    }

    public static int getSecDiagSum(int[][] arr) {
        int sum = 0;
        for(int i = arr.length - 1; i >= 0; i--) sum += arr[arr.length - 1 - i][i];
        return sum;
    }


    public static void reverse(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    public static void rotate(int[] arr, int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int bLength = in.nextInt();
//        int[] boys = new int[bLength];
//        for (int i = 0; i < bLength; i++) boys[i] = in.nextInt();
//        int gLength = in.nextInt();
//        int[] girls = new int[bLength];
//        for (int i = 0; i < gLength; i++) girls[i] = in.nextInt();
//        int m = in.nextInt();
//        System.out.print(maxReputation(boys, girls, m));

//        Scanner in = new Scanner(System.in);
//        int length = in.nextInt();
//        int[] arr = new int[3];
//        for(int i =0; i < length; i++) {
//            int num = in.nextInt();
//            if (num > 0) arr[0]++;
//            else if (num < 0) arr[1]++;
//            else arr[2]++ ;
//        }
        int[] a = {1, 2, 3};
        int k = a.length -  5 % a.length;
        rotate(a, k);
        //rotate(a, 1);
        for (int n : a) System.out.println(n);

//        NumberFormat formatter = new DecimalFormat("#0.000000");
//        System.out.println(formatter.format(((float)arr[0] / (float) length)));
//        System.out.println(formatter.format(((float)arr[1] / (float) length)));
//        System.out.println(formatter.format(((float)arr[2] / (float) length)));
//


    }


}
