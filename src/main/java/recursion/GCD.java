package recursion;

import java.math.BigInteger;

public class GCD {

    public static int gcd(int a, int b) {

        if(b == 0) return a;
        else return gcd(b, a % b);
    }

    public static long lcm(int a, int b) {

        int g = gcd(a, b);
        BigInteger first = BigInteger.valueOf(a);
        BigInteger second = BigInteger.valueOf(b);
        BigInteger product = first.multiply(second);
        return product.divide(BigInteger.valueOf(g)).longValue();

    }

    public static void main(String[] args) {

        int a = 14159572;
        int b = 63967072;

        System.out.print(lcm(a, b));
    }
}
