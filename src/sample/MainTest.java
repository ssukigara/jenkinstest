package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void test() {
        String[] args = { "", "", "" };
        Main.main(args);

        boolean expected = true;
        boolean expected2 = false;
        long lExpected = 0;
        long lActual = 0;

        assertTrue(expected);
        assertFalse(expected2);
        assertNull(null);
        assertEquals(lExpected, lActual);

        String s0 = "abc";
        String s1 = s0;
        // ***** == でのテスト (true) *****
        assert s0 == s1;
        assertSame(s0, s1);

    }

}
