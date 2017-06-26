package Solution.No40To79;

import Solution.No40To79.No67;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by caily on 6/22/17.
 */
public class No67Test {
    private No67 test = new No67();
    @Test
    public void addBinary() throws Exception {
        assertEquals("110110",test.addBinary("100","110010"));
    }

}