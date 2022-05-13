package ru.mycomp.springHW;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeteTargetTest {

    @Test
    public void testGet() {
        StubCoin coin = new StubCoin();

        GreeterTarget greeterTarget = new GreeterTargetImpl(coin);

        coin.setConstantResult(true);
        assertEquals("World", greeterTarget.get());

        coin.setConstantResult(false);
        assertEquals("Spring", greeterTarget.get());
    }

}
