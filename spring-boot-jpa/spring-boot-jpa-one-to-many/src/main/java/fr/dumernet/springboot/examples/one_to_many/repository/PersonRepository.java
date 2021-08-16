package fr.dumernet.springboot.examples.one_to_many.repository;

import fr.dumernet.springboot.examples.one_to_many.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
