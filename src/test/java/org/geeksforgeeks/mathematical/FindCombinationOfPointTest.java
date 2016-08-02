package org.geeksforgeeks.mathematical;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class FindCombinationOfPointTest {
    @Test
    public void findCombinationTest() {
        ArrayList<String> r = new ArrayList<String>();
        PrintCombinationOfPoints printCombinationOfPoints = new PrintCombinationOfPoints();
        r.add("1111");
        r.add("112");
        r.add("121");
        r.add("13");
        r.add("211");
        r.add("22");
        r.add("31");
        r.add("4");
        assertEquals(r,printCombinationOfPoints.findCombinationOfpoints(4)) ;
    }

    @Test
    public void findCombinationTest2() {
            ArrayList<String> r = new ArrayList<String>();
            PrintCombinationOfPoints printCombinationOfPoints = new PrintCombinationOfPoints();
            r.add("111");
            r.add("12");
            r.add("21");
            r.add("3");
            assertEquals(r,printCombinationOfPoints.findCombinationOfpoints(3)) ;
    }


}
