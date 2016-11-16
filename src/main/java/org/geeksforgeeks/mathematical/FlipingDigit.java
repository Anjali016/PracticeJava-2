package org.geeksforgeeks.mathematical;

import javax.management.StringValueExp;
import javax.net.ssl.SSLContext;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FlipingDigit {

    public static boolean isSame(String num) {

        int zeroes = 0, ones = 0;
        for (char digit : num.toCharArray()) {
            if(digit == '1') ones++;
            else zeroes++;
        }

        return ones == 1 || zeroes == 1;
    }

    public static int xorWays(int zeroes, int ones) {
        int count = 0;
        if ((ones - 1) % 2 == 0 && zeroes % 2 == 0) count = ones;
        if ((ones) % 2 == 0 && (zeroes - 1) % 2 == 0) count += zeroes;
        return count;
    }

    public static void tennisMatch(String points) {
        int p1 = 0, p2 = 0;
        int ac1 = 0, ac2 = 0;
        for (char point : points.toCharArray()) {
            if (p1 == 10 && p2 == 10) {
                if (point == '1') {
                    ac1++;

                } else {
                    ac2++;
                }

                if (ac1 - ac2 == 2) System.out.println("WIN");
                if (ac2 - ac1 == 2) System.out.println("LOSE");
            } else {
                if (point == '1') p1++;
                else p2++;

                if (p1 == 11) System.out.println("WIN");
                if (p2 == 11) System.out.println("LOSE");
            }
        }
    }

    public static boolean canRead(String word, String dictionary) {

        for (char ch : word.toCharArray()) {

            if(!dictionary.contains(String.valueOf(ch))) return false;
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String dicitionary = in.next();

        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int length = in.nextInt();
            int zeroes = 0, ones = 0;
            for (int j = 0; j < length; j++) {
                int input = in.nextInt();
                if(input == 1) ones++;
                else zeroes++;
            }
           System.out.println( xorWays(zeroes, ones));
            // tennisMatch(in.next());
//            if(canRead(in.next(), dicitionary))
//                System.out.println("Yes");
//            else System.out.println("No");
        }

    }
}
