package ru.mycomp.springHW;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class App {

    public App() {
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        Greeter greeter = context.getBean(Greeter.class);

        System.out.println(greeter.greet());
    }
}
