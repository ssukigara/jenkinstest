package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void test() {
        String[] args = { "", "", "" };
        Main.main(args);

        boolean expected = true;
        assertTrue(expected);

    }

}
