package com.codeWithAshith.SpringBootDatabase.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public ResponseEntity getPersons() {
        return new ResponseEntity(personService.getAllPersons(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> createMovie(@RequestBody Person person) {
        personService.createPerson(person);
        return new ResponseEntity("Added Successfully " + person.getName(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updatePerson(@RequestBody Person person) {
        personService.updatePerson( person);
        return new ResponseEntity("Updated Successfully " + person.getName(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePerson(@PathVariable Integer id) {
        personService.deletePersonById(id);
        return new ResponseEntity("Deleted movie with id "+id, HttpStatus.OK);
    }
}
