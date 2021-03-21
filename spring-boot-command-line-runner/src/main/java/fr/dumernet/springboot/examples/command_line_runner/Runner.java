package fr.dumernet.springboot.examples.command_line_runner;

import ch.qos.logback.classic.Level;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        final String message = "Log a message at the {} level";
        log.trace(message, Level.TRACE);
        log.debug(message, Level.DEBUG);
        log.info(message, Level.INFO);
        log.warn(message, Level.WARN);
        log.error(message, Level.ERROR);
    }

}
