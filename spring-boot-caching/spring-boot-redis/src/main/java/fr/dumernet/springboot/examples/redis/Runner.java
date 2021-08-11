package fr.dumernet.springboot.examples.redis;

import fr.dumernet.springboot.examples.redis.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

    private final PersonService personService;

    public Runner(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("FIND BY ID");
        log.info("{}", personService.findById(1L));
        log.info("{}", personService.findById(2L));
        log.info("{}", personService.findById(3L));
        log.info("{}", personService.findById(1L));
        log.info("{}", personService.findById(4L));
        log.info("CLEAR ALL");
        TimeUnit.SECONDS.sleep(3);
        personService.clearAll();
        log.info("CLEAR BY ID");
        log.info("{}", personService.findById(1L));
        log.info("{}", personService.findById(2L));
        personService.clearById(1L);
        log.info("{}", personService.findById(1L));
        log.info("{}", personService.findById(2L));
        log.info("CLEAR ALL");
        personService.clearAll();
        log.info("UPDATE BY ID");
        log.info("{}", personService.findById(1L));
        log.info("{}", personService.updateById(1L));
        log.info("{}", personService.findById(1L));
    }

}
