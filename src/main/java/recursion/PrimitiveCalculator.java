package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class PrimitiveCalculator {

    public static int calculator(int n, int start) {

        if (n == start) return 0;
        if (n < start) return 10000000;
        else return Math.min(1 + calculator(n, start + 1), Math.min(1 + calculator(n, start * 2), 1 + calculator(n, start * 3)));
    }

    public static ArrayList<Integer> calculatorDP(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(n == 1) {
            result.add(1);
            return result;
        }

        int[] dp = new int[n + 1];
        dp[1] = 0;
        dp[2] = 1;


        for (int i = 3; i <=n; i++) {

            if(i % 2 == 0 && i % 3 == 0) {
                dp[i] = 1 + Math.min(dp[i - 1], Math.min(dp[i / 2], dp[i /3 ]));
            }else {
                if (i % 2 == 0)
                    dp[i] = 1 + Math.min(dp[i - 1], dp[i / 2]);
                else if (i % 3 == 0)
                    dp[i] = 1 + Math.min(dp[i / 3], dp[i - 1]);
                else
                    dp[i] = 1 + dp[i - 1];
            }
        }
        int i = n;
        result.add(i);
        while (i > 1){

            if(i % 2 == 0 && i % 3 ==0){
                if( dp[i - 1] < dp[i / 2]) {
                    if(dp[i - 1] < dp[i / 3]) {
                        result.add(i - 1);
                        i--;
                    }else {
                        result.add(i / 3);
                        i /= 3;
                    }
                }else {
                    if(dp[i / 2] < dp[i / 3]){
                        result.add(i / 2);
                        i/=2;
                    }else {
                        result.add(i / 3);
                        i/=3;
                    }
                }
            }
            else if (i % 2 == 0 ){
                if(dp[i - 1] < dp[i /2]){
                    result.add(i - 1);
                    i--;
                }
                else {
                    result.add(i / 2 );
                    i/=2;
                }
            }else if(i % 3 == 0) {
                if (dp[i - 1] < dp[i / 3]){
                    result.add(i - 1);
                    i--;
                }
                else {
                    result.add(i / 3 );
                    i/=3;
                }
            }else {
                 result.add(i - 1);
                i--;
            }

        }
        Collections.reverse(result);
       // for (int num : result) System.out.print(num);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = calculatorDP(2);
        System.out.println(result.size() - 1);
        System.out.print(result);
    }
}
