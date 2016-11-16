package org.geeksforgeeks.mathematical;

public class PrimeNumbers {

    public static void printPrimeNumber(int start, int end) {

        boolean[] primes = new boolean[end];

        for (int i = 2; i < primes.length; i++) {
            if(!primes[i]) {
                for (int j = 2 * i; j < primes.length; j = j + i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = start ; i < primes.length; i++)
            if (!primes[i]) System.out.print(i+" ");

    }

    public static void main(String[] args) {
        printPrimeNumber(10, 20);
    }
}
