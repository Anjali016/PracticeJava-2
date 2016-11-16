package greedy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNumber {

    private static String largestNumber(String[] a) {
        //write your code here

        Arrays.sort(a, new Comparator<String>() {
            public int compare(String o1, String o2) {
                String firstNum = o1 + o2;
                String secondNum = o2 + o1;
                return -firstNum.compareTo(secondNum);

            }
        });
        String result = "";
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}
