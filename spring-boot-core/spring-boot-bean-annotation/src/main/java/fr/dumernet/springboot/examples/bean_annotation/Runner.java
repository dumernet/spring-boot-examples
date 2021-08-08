package fr.dumernet.springboot.examples.bean_annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

    private final String createStringFoo;

    private final String createStringBar;

    private final Double doubleValue;

    private final Float floatOne;

    private final Float floatTwo;

    public Runner(String createStringBar, String createStringFoo, Double doubleValue,
                  @Qualifier("createFloatFoo") Float floatOne, @Qualifier("createFloatBar") Float floatTwo) {
        this.createStringBar = createStringBar;
        this.createStringFoo = createStringFoo;
        this.doubleValue = doubleValue;
        this.floatOne = floatOne;
        this.floatTwo = floatTwo;
    }

    @Override
    public void run(String... args) {
        log.info(createStringFoo);
        log.info(createStringBar);
        log.info(doubleValue.toString());
        log.info(floatOne.toString());
        log.info(floatTwo.toString());
    }

}
