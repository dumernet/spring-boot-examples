package fr.dumernet.springboot.examples.single_entity.repository;

import fr.dumernet.springboot.examples.single_entity.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
