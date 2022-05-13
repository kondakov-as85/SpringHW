package ru.mycomp.springHW;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CoinTest {

    @Test
    public void testToss() {
        StubRandom random = new StubRandom();

        Coin testedObject = new CoinImpl(random);

        random.setConstantResult(true);
        assertTrue(testedObject.toss());

        random.setConstantResult(false);
        assertFalse(testedObject.toss());
    }
}
