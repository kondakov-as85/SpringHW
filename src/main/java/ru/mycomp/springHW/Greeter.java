package ru.mycomp.springHW;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class Greeter {

    private GreeterTarget target;

    @Inject
    public Greeter(final GreeterTarget target) {
        this.target = target;
    }

    public final String greet() {
        return "Hello " + target.get();
    }
}
