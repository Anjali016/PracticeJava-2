package recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class FindNextNum {
    public static boolean nextGreaterNum(String sofar, String rem, String num) {

        if (rem.isEmpty()) {
            if (sofar.compareTo(num) > 0) {
                System.out.print(sofar);
                return true;
            }
        }
            else {
                for (int i = 0; i < rem.length(); i++) {
                    if (nextGreaterNum(sofar + rem.charAt(i), rem.substring(0, i) + rem.substring(i + 1), num))
                        return true;
                }
            }

        return false;
    }


    public static BigInteger lightingWays(BigInteger n) {
        BigInteger M = new BigInteger("100000");
        return BigInteger.valueOf(2).modPow(n, M).subtract(BigInteger.valueOf(1));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int i = 0; i < testCases; i++) {
            System.out.println(lightingWays(in.nextBigInteger()));
        }
    }
}
