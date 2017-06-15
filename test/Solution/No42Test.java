package Solution;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by caily on 6/15/17.
 */
public class No42Test {

    private No42 test = new No42();

    @Test
    public void trap() throws Exception {
        assertEquals(6, test.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

}