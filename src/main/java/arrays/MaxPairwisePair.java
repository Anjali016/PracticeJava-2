package arrays;

import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxPairwisePair {

    public static BigInteger maxPair(int[] arr) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(2);

        for (int i = 0 ; i < arr.length; i++) {

            if (i < 2) minHeap.add(arr[i]);
            else {
                if(minHeap.peek().intValue() < arr[i]) {
                    minHeap.poll();
                    minHeap.add(arr[i]);
                }
            }
        }




        return BigInteger.valueOf(minHeap.remove()).multiply(BigInteger.valueOf(minHeap.remove()));
    }

    public static BigInteger max(int[] arr) {

        int first, second;
        first = second = Integer.MIN_VALUE;

        for (int n : arr) {

            if(n > second) {
                first = n;
                second = first;
            }
            if (second < n && first != n) second = n;
        }

        return BigInteger.ONE;
    }

    public static BigInteger maxProduct(int[] arr) {

        int maxIndex1 = -1;
        int maxIndex2 = -1;

        for (int i = 0; i < arr.length; i++) {
            if(maxIndex1 == -1 || arr[maxIndex1] < arr[i]) maxIndex1 = i;
        }

        for (int i = 0; i < arr.length; i++) {
            if(i != maxIndex1 && (maxIndex2 == -1 || arr[maxIndex2] < arr[i])) maxIndex2 = i;
        }

        return BigInteger.valueOf(arr[maxIndex1]).multiply(BigInteger.valueOf(arr[maxIndex2]));
    }

    public static void main(String[] args ) {



        Scanner in = new Scanner(System.in);
        int inputs = in.nextByte();
        if (inputs < 2) System.out.println(0);
        else {
            int[] arr = new int[inputs];
            for (int i = 0; i < inputs; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(maxProduct(arr));
        }

    }
}
