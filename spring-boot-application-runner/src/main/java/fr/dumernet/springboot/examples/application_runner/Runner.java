package fr.dumernet.springboot.examples.application_runner;

import ch.qos.logback.classic.Level;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        final String message = "Log a message at the {} level";
        log.trace(message, Level.TRACE);
        log.debug(message, Level.DEBUG);
        log.info(message, Level.INFO);
        log.warn(message, Level.WARN);
        log.error(message, Level.ERROR);
    }

}
