package Solution;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by caily on 6/15/17.
 */
public class No44Test {
    private No44 test = new No44();
    @Test
    public void isMatch() throws Exception {
        assertEquals(false, test.isMatch("\"aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaabaa*******b","a*******b"));
    }

}