package fr.dumernet.springboot.examples.lombok_mapstruct.mapper;

import fr.dumernet.springboot.examples.lombok_mapstruct.dto.PersonDto;
import fr.dumernet.springboot.examples.lombok_mapstruct.model.Person;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-09T17:19:38+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDto toDto(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDto personDto = new PersonDto();

        personDto.setName( person.getName() );

        return personDto;
    }

    @Override
    public Person toModel(PersonDto person) {
        if ( person == null ) {
            return null;
        }

        Person person1 = new Person();

        person1.setName( person.getName() );

        return person1;
    }
}
