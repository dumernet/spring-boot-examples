package fr.dumernet.springboot.examples.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class EhCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(EhCacheApplication.class, args);
    }

}
