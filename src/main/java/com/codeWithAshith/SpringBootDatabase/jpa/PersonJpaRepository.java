package com.codeWithAshith.SpringBootDatabase.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PersonJpaRepository extends JpaRepository<Person, Integer> {

    @Query("SELECT p FROM Person p")
    List<Person> findAllPersonByLocation(String location);

    @Query("UPDATE Person set name=:name WHERE location=:location")
    @Modifying
    @Transactional
    int updatePersonNameByLocation(String name, String location);
}
