package recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombinationTest {
    @Test
    public void combinationTest() {
        Combination combination = new Combination();
        assertEquals(56, combination.getCombinaitons(8,5));
    }
}
