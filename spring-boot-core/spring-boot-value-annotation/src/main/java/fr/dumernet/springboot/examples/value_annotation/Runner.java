package fr.dumernet.springboot.examples.value_annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

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
        log.info(stringValue);
        log.info(stringValueFromFile);
        log.info(defaultingValue);
        log.info(systemProperty);
        log.info(Arrays.toString(valuesArray));
    }

}
