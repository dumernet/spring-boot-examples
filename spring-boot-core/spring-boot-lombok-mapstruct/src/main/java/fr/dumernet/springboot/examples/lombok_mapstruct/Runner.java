package fr.dumernet.springboot.examples.lombok_mapstruct;

import fr.dumernet.springboot.examples.lombok_mapstruct.dto.PersonDto;
import fr.dumernet.springboot.examples.lombok_mapstruct.mapper.PersonMapper;
import fr.dumernet.springboot.examples.lombok_mapstruct.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

    private final PersonMapper personMapper;

    public Runner(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("{}", personMapper.toDto(Person.builder().firstName("firstName").lastName("lastName").build()));
        log.info("{}", personMapper.toModel(PersonDto.builder().firstName("firstName").lastName("lastName").build()));
    }

}
