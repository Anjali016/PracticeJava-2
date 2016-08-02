package org.geeksforgeeks.mathematical;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ReverseDigitTest {
    @Test
    public void reverseDigitTest(){
        ReverseDigit reverseDigit = new ReverseDigit();
        assertEquals(21,reverseDigit.rev(12));
    }
}
