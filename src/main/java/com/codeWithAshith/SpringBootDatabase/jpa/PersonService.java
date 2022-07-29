package com.codeWithAshith.SpringBootDatabase.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonJpaRepository personJpaRepository;

    public List<Person> getAllPersons() {
        return personJpaRepository.findAll();
    }

    public void createPerson(Person person) {
        personJpaRepository.save(person);
    }

    public void updatePerson(Person person) {
        personJpaRepository.save(person);
    }

    public void deletePersonById(Integer id) {
        personJpaRepository.deleteById(id);
    }
}
