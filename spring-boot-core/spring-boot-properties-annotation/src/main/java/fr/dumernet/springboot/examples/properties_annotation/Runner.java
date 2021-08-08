package fr.dumernet.springboot.examples.properties_annotation;

import fr.dumernet.springboot.examples.properties_annotation.properties.BeanPerson;
import fr.dumernet.springboot.examples.properties_annotation.properties.Person;
import fr.dumernet.springboot.examples.properties_annotation.properties.PersonList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

    private final Person person;

    private final PersonList personList;

    private final BeanPerson beanFirstPerson;

    private final BeanPerson beanSecondPerson;

    public Runner(Person person, PersonList personList, BeanPerson beanFirstPerson, BeanPerson beanSecondPerson) {
        this.person = person;
        this.personList = personList;
        this.beanFirstPerson = beanFirstPerson;
        this.beanSecondPerson = beanSecondPerson;
    }

    @Override
    public void run(String... args) {
        log.info("{}", person);
        log.info("{}", personList);
        log.info("{}", beanFirstPerson);
        log.info("{}", beanSecondPerson);
    }

}
