package io.github.jass2125.monkey.repository;

import io.github.jass2125.monkey.model.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("persons")
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findAll();

}
