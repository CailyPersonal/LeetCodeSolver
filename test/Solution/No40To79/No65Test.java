package Solution.No40To79;

import Solution.No40To79.No65;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by caily on 6/22/17.
 */
public class No65Test {
    private No65 test = new No65();

    @Test
    public void isNumber() throws Exception {
        assertEquals(true,test.isNumber("11"));
    }

}