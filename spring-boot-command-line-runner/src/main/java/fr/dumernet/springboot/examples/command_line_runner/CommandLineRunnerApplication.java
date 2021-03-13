package fr.dumernet.springboot.examples.command_line_runner;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CommandLineRunnerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CommandLineRunnerApplication.class, args);
    }

    @Override
    public void run(String... args) {
        final String message = "Log a message at the {} level";
        logger.trace(message, Level.TRACE);
        logger.debug(message, Level.DEBUG);
        logger.info(message, Level.INFO);
        logger.warn(message, Level.WARN);
        logger.error(message, Level.ERROR);
    }

}
