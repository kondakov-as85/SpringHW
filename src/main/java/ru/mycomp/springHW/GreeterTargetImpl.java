package ru.mycomp.springHW;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class GreeterTargetImpl implements GreeterTarget {

    private Coin coin;

    @Inject
    public GreeterTargetImpl(final Coin coin) {
        this.coin = coin;
    }

    public String get() {
        if (coin.toss()) {
            return "World";
        }
        return "Spring";
    }
}
