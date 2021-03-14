package fr.dumernet.springboot.examples.bean_annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    // Match by name

    @Bean
    public String createStringFoo() {
        return "createStringFoo";
    }

    @Bean
    public String createStringBar() {
        return "createStringBar";
    }

    // Match by type

    @Bean
    public Double createDouble() {
        return 10d;
    }

    // Match by qualifier

    @Bean
    @Qualifier("createFloatFoo")
    public Float createFloatOne() {
        return 20f;
    }

    @Bean
    @Qualifier("createFloatBar")
    public Float createFloatTwo() {
        return 30f;
    }

}
