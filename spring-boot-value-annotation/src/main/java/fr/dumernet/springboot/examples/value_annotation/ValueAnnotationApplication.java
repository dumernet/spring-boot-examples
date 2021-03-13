package fr.dumernet.springboot.examples.value_annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ValueAnnotationApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ValueAnnotationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ValueAnnotationApplication.class, args);
    }

    @Value("string value")
    private String stringValue;

    @Value("${string.value}")
    private String stringValueFromFile;

    @Value("${string.without_value:default value}")
    private String defaultingValue;

    @Value("${path}")
    private String systemProperty;

    @Value("${string.array}")
    private String[] valuesArray;

    @Override
    public void run(String... args) {
        logger.info(stringValue);
        logger.info(stringValueFromFile);
        logger.info(defaultingValue);
        logger.info(systemProperty);
        logger.info(Arrays.toString(valuesArray));
    }

}
