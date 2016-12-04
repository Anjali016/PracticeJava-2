package dynamicprogramming;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DPproblemsTest {

        @Test
        public void test1() {
            DPproblems dPproblems = new DPproblems();
            int [] coins = {1, 8, 20};
            int sum = 20;
            assertEquals(1, dPproblems.minCoinChange(coins, sum));
        }

}
