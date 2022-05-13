package ru.mycomp.springHW;

public class StubCoin implements Coin {

    private boolean constantResult;

    public final void setConstantResult(boolean constantResult) {
        this.constantResult = constantResult;
    }

    public boolean toss() {
        return constantResult;
    }
}
