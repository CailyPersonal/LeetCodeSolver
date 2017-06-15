package Solution;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by caily on 6/15/17.
 */
public class No43Test {

    private No43 test = new No43();

    @Test
    public void multiply() throws Exception {
        assertEquals("9100",test.multiply("100","91"));
    }

}