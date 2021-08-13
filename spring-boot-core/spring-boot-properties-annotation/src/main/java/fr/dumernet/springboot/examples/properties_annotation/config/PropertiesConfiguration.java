package fr.dumernet.springboot.examples.properties_annotation.config;

import fr.dumernet.springboot.examples.properties_annotation.properties.BeanPerson;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties
@ConfigurationPropertiesScan("fr.dumernet.springboot.examples.properties_annotation.properties")
public class PropertiesConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "bean.person.first")
    public BeanPerson beanFirstPerson() {
        return new BeanPerson();
    }

    @Bean
    @ConfigurationProperties(prefix = "bean.person.second")
    public BeanPerson beanSecondPerson() {
        return new BeanPerson();
    }

}
