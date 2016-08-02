package recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PathInGridTest {
    @Test
    public void test(){
        PathInGrid pathInGrid = new PathInGrid();
        int[][] mat = {{1, 1, 1},
                       {0, 0, 0},
                       {0, 1, 1}};
        assertEquals(true, pathInGrid.isPath(mat, 0, 0));
    }
}
