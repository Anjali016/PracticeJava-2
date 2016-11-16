package greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrizeDistribution {



    public static void prizeDistribution(int n, List<Integer> result) {

        while (n > 0) {

            for (int i = 1; i <= n; i++) {
                if(n <= 2 * i) {
                    result.add(n);
                    return;
                }
                else {
                    n -= i;
                    result.add(i);
                }
            }
        }
    }

    public static void prizeDistribution(int n, List<Integer> result, int greedyChoice) {

        if(n == 0) return;

        else {
            if(n <= 2 * greedyChoice){
                result.add(n);
            }else {
                result.add(greedyChoice);
                prizeDistribution(n - greedyChoice, result, greedyChoice + 1);
            }
        }
    }


    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        prizeDistribution(n, summands, 1);
        return summands;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }


  /*  public static boolean prizeDistribution(int n, int start, ArrayList<Integer> result) {

        if(n == 0) {
            System.out.println(result.size());
            return true ;
        }else {
            for (int i = start; i <= n; i++) {
                if(n >= i ) {
                    result.add(i);
                    if (prizeDistribution(n - i, start + 1, result)) return true;
                    result.remove(result.size() - 1);
                }
            }
        }
        return false;
    }

    public static void prize(int n){
        ArrayList<Integer> result = new ArrayList<Integer>();
        prizeDistribution(n, 1, result);
        for (int num : result) System.out.print(num +" ");
    }

    public static void main(String[] args) {

        prize(8);
    }*/

}
