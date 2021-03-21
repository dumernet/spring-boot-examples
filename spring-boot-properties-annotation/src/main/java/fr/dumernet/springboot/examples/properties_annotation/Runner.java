package fr.dumernet.springboot.examples.properties_annotation;

import fr.dumernet.springboot.examples.properties_annotation.properties.BeanPerson;
import fr.dumernet.springboot.examples.properties_annotation.properties.Person;
import fr.dumernet.springboot.examples.properties_annotation.properties.PersonList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

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
        logger.info("{}", person);
        logger.info("{}", personList);
        logger.info("{}", beanFirstPerson);
        logger.info("{}", beanSecondPerson);
    }

}
