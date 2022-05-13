package ru.mycomp.springHW;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
@ComponentScan("ru.mycomp.springHW")
public class ContextConfiguration {

    @Bean
    public Random random() {
        return new Random();
    }
}
