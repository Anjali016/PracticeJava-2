package org.geeksforgeeks.mathematical;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import java.util.ArrayList;

public class PowerSetTest {
    @Test
    public void powerSetTest() {
        ArrayList<String> res = new ArrayList<String>();
        PowerSet powerSet = new PowerSet();
        res.add("");
        res.add("a");
        assertEquals(res,powerSet.printPowerSet("a"));
    }

    @Test
    public void powerSetTest2() {
        ArrayList<String> res = new ArrayList<String>();
        PowerSet powerSet = new PowerSet();
        res.add("");
        res.add("a");
        res.add("b");
        res.add("ab");
        assertEquals(res,powerSet.printPowerSet("ab"));
    }

    @Test
    public void powerSetTest3() {
        ArrayList<String> res = new ArrayList<String>();
        PowerSet powerSet = new PowerSet();
        res.add("");
        res.add("a");
        res.add("b");
        res.add("ab");
        res.add("c");
        res.add("ac");
        res.add("bc");
        res.add("abc");
        assertEquals(res,powerSet.printPowerSet("abc"));
    }
}
