package ru.mycomp.springHW;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void testGreet() {
        GreeterTarget target = new StubGreeterTarget();

        Greeter testedObject= new Greeter(target);

        assertEquals("Hello TEST", testedObject.greet());
    }
}
