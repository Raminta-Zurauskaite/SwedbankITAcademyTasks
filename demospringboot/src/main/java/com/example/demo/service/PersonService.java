package com.example.demo.service;

import com.example.demo.model.domain.Person;
import com.example.demo.model.domain.api.CreatePersonRequest;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> fetchPersons() {
        return personRepository.findAll();
    }

    public Optional<Person> fetchPerson(Long id) {
        return personRepository.findById(id);
    }

    public Person createPerson(CreatePersonRequest request) {
        Person person = Person.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .middleName(request.getMiddleName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .build();
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
