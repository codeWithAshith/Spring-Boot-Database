package com.codeWithAshith.SpringBootDatabase.jpa;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

@Repository
@Transactional
public class PersonEntityDao {

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> findAll() {
        TypedQuery<Person> query = entityManager.createNamedQuery("find_all_person", Person.class);
        return query.getResultList();
    }
    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }
    public void deleteById(int id) {
        Person person = new Person();
         entityManager.remove(person);
    }
    public Person insert(Person person) {
        return entityManager.merge(person);
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }
}
