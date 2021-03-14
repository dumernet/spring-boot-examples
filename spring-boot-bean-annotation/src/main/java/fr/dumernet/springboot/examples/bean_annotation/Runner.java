package fr.dumernet.springboot.examples.bean_annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

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
        logger.info(createStringFoo);
        logger.info(createStringBar);
        logger.info(doubleValue.toString());
        logger.info(floatOne.toString());
        logger.info(floatTwo.toString());
    }

}
