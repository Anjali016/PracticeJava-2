package org.geeksforgeeks.mathematical;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FibbonacciNumberTest {
    @Test
    public void testAtZero() {
        FibbonaciNumbers fibbonacciNumbers  = new FibbonaciNumbers();
        assertEquals(0,fibbonacciNumbers.fibbonacciNum(0));
    }
    @Test
    public void testAtFour() {
        FibbonaciNumbers fibbonacciNumbers  = new FibbonaciNumbers();
        assertEquals(2,fibbonacciNumbers.fibbonacciNum(3));
    }
}
