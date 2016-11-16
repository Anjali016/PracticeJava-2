package recursion;

public class WeightedJobScheduling {

    public static int maxProfit(int[] startTimes, int[] finishTimes, int[] profits, int n, int prev) {

        if(n == profits.length) return 0;
        else if(prev > startTimes[n]) return maxProfit(startTimes, finishTimes, profits, n + 1, prev);
        else return Math.max( profits[n] + maxProfit(startTimes, finishTimes, profits, n + 1, finishTimes[n]), maxProfit(startTimes, finishTimes, profits, n + 1, prev));
    }

   public static void main (String[] args){
       int[] startTimes = {1, 1};
       int[] finishTimes = {2, 2};
       int[] profits = {50, 100};


       System.out.print(maxProfit(startTimes, finishTimes, profits, 0, -1));
   }
}
