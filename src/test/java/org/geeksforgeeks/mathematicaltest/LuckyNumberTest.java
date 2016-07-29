package org.geeksforgeeks.mathematicaltest;

import org.geeksforgeeks.mathematical.LuckyNumbers;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class LuckyNumberTest {
    @Test
    public void luckyNumberTest() {
        LuckyNumbers luckyNumbers = new LuckyNumbers();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 20; i++) list.add(i);
        assertEquals(true,luckyNumbers.isLucky(list,13));
    }
}
