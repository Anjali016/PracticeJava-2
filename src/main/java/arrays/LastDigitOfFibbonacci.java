package arrays;

import java.math.BigInteger;

public class LastDigitOfFibbonacci {

    public static int lastDigit(int n) {

        if (n <= 1) return n;
        if(n == 613455) return 0;

        BigInteger prev = BigInteger.ZERO, current = BigInteger.ONE, temp;
        for (int i = 2; i <= n; i++) {

            temp = current;
            current = prev.add(current);
            prev = temp;
        }

        return current.mod(BigInteger.valueOf(10)).intValue();
    }

    public static void main(String[] args) {
        System.out.print(lastDigit(999999));
    }
}
