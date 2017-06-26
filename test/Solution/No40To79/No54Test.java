package Solution.No40To79;

import Solution.No40To79.No54;
import org.junit.Test;

/**
 * V  - CailyPersonal
 * <p>
 * 2017/6/20 - created.
 */
public class No54Test {
    private No54 test = new No54();
    @Test
    public void spiralOrder() throws Exception {

        test.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        test.spiralOrder(new int[][]{{2},{3}});
    }

}