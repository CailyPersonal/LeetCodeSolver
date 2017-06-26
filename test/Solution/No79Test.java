package Solution;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * V  - CailyPersonal
 * <p>
 * 2017/6/26 - created.
 */
public class No79Test {
    private No79 test = new No79();
    @Test
    public void exist() throws Exception {
        assertEquals(false, test.exist(new char[][]{{'a','a'}},"aaa"));
    }

}