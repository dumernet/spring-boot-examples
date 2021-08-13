package fr.dumernet.springboot.examples.single_entity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "fr.dumernet.springboot.examples.single_entity.repository")
public class JpaConfiguration {
}
