package fr.dumernet.springboot.examples.single_entity;

import ch.qos.logback.classic.Level;
import fr.dumernet.springboot.examples.single_entity.model.Person;
import fr.dumernet.springboot.examples.single_entity.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class Runner implements ApplicationRunner {

    private final PersonRepository personRepository;

    public Runner(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        log.info("SAVE");
        personRepository.save(Person.builder().firstName("Foo").lastName("Bar").build());
        personRepository.save(Person.builder().firstName("Baz").lastName("Qux").build());
        personRepository.save(Person.builder().firstName("Quux").lastName("Corge").build());

        log.info("FIND ALL");
        for (Person person : personRepository.findAll()) {
            log.info("{}", person);
        }

        log.info("FIND BY ID");
        Person person_01 = personRepository.findById(1L).get();
        log.info("{}", person_01);

        log.info("SAVE / UPDATE");
        person_01.setFirstName("Foo_v2");
        person_01.setLastName("Foo_v2");
        personRepository.save(person_01);

        log.info("DELETE BY ID");
        personRepository.deleteById(2L);

        log.info("FIND ALL");
        for (Person person : personRepository.findAll()) {
            log.info("{}", person);
        }
    }

}
