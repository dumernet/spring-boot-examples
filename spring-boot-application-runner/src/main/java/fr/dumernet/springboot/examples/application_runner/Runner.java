package fr.dumernet.springboot.examples.application_runner;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    @Override
    public void run(ApplicationArguments args) {
        final String message = "Log a message at the {} level";
        logger.trace(message, Level.TRACE);
        logger.debug(message, Level.DEBUG);
        logger.info(message, Level.INFO);
        logger.warn(message, Level.WARN);
        logger.error(message, Level.ERROR);
    }

}