package ru.mycomp.springHW;

import java.util.Random;

public class StubRandom extends Random {
    private boolean constantResult;

    public final void setConstantResult(boolean constantResult) {
        this.constantResult = constantResult;
    }

    @Override
    public boolean nextBoolean() {
        return constantResult;
    }
}
