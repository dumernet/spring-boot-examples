package fr.dumernet.springboot.examples.lombok_mapstruct.mapper;

import fr.dumernet.springboot.examples.lombok_mapstruct.dto.PersonDto;
import fr.dumernet.springboot.examples.lombok_mapstruct.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonDto toDto(Person person);

    Person toModel(PersonDto person);

}
