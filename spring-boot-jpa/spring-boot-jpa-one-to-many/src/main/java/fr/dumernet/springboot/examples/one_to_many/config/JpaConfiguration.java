package fr.dumernet.springboot.examples.one_to_many.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "fr.dumernet.springboot.examples.one_to_many.repository")
public class JpaConfiguration {
}
