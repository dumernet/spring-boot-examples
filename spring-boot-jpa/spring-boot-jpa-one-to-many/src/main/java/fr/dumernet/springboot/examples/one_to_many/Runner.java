package fr.dumernet.springboot.examples.one_to_many;

import fr.dumernet.springboot.examples.one_to_many.model.Person;
import fr.dumernet.springboot.examples.one_to_many.model.Phone;
import fr.dumernet.springboot.examples.one_to_many.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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
        personRepository.save(Person.builder().firstName("Foo").lastName("Bar")
                .phone(Phone.builder().number("111-111").build())
                .phone(Phone.builder().number("111-222").build())
                .build());
        personRepository.save(Person.builder().firstName("Baz").lastName("Qux")
                .phone(Phone.builder().number("222-111").build())
                .build());

        log.info("FIND ALL");
        for (Person person : personRepository.findAll()) {
            log.info("{}", person);
        }

        log.info("FIND BY ID");
        Person person_01 = personRepository.findById(1L).get();
        log.info("{}", person_01);

        log.info("SAVE / UPDATE");
        person_01.getPhones().get(1).setNumber("111-333");
        personRepository.save(person_01);

        log.info("SAVE / UPDATE (2)");
        person_01.getPhones().remove(0);
        personRepository.save(person_01);

        log.info("FIND ALL");
        for (Person person : personRepository.findAll()) {
            log.info("{}", person);
        }
    }

}
