package Solution.No40To79;

import Solution.No40To79.No41;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * V  - CailyPersonal
 * <p>
 * 2017/6/3 - created.
 */
public class No41Test {

    private No41 test = new No41();

    @Test
    public void firstMissingPositive() throws Exception {
        assertEquals(2, test.firstMissingPositive(new int[]{3,4,-1,1}));
        assertEquals(1, test.firstMissingPositive(new int[]{0}));
        assertEquals(1, test.firstMissingPositive(new int[]{2}));
        assertEquals(7, test.firstMissingPositive(new int[]{11,1,6,11,5,5,-6,9,-3,9,5,4,2,-8,16,-6,-4,2,3}));
    }

}