package Solution;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by caily on 6/22/17.
 */
public class No60Test {
    private No60 test = new No60();
    @Test
    public void getPermutation() throws Exception {
        assertEquals("132",test.getPermutation(3,2));
    }

}