package Solution;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Caily on 6/25/2017.
 */
public class No72Test {
    private No72 test = new No72();

    @Test
    public void minDistance() throws Exception {
        assertEquals(0,test.minDistance("a","a"));
        assertEquals(1,test.minDistance("a","b"));
        assertEquals(1,test.minDistance("a","ab"));
    }

}