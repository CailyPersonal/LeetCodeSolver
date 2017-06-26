package Solution.No80To89;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * V  - CailyPersonal
 * <p>
 * 2017/6/26 - created.
 */
public class No80Test {
    private No80 test = new No80();

    @Test
    public void removeDuplicates() throws Exception {
        int[] array = new int[]{1, 1, 1, 2, 2, 3};
        assertEquals(5, test.removeDuplicates(array));
    }

}