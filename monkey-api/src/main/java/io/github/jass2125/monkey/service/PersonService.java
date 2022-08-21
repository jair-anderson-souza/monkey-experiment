package io.github.jass2125.monkey.service;

import io.github.jass2125.monkey.address.component.OtherMicroserviceComponent;
import io.github.jass2125.monkey.dto.AddressResponse;
import io.github.jass2125.monkey.model.Person;
import io.github.jass2125.monkey.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private OtherMicroserviceComponent otherMicroserviceComponent;

    @Cacheable(value = "persons")
    public List<Person> getAll(Pageable pageable) {
        return this.personRepository.findAll();
    }

    @Cacheable(cacheNames = "persons", key = "#id", unless="#result == null")
    public Person getById(Long id) {
        return this.personRepository.findById(id).orElse(null);
    }

    @CachePut(cacheNames = "persons", key = "#person.id")
    public Person update(Person person) {
        return this.personRepository.save(person);
    }

    @CacheEvict(cacheNames = "persons", allEntries = true)
    public Person save(Person person) {
        return this.personRepository.save(person);
    }

    public AddressResponse fetchData() {
        return otherMicroserviceComponent.fetchData();
    }
}
