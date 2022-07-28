package com.codeWithAshith.SpringBootDatabase.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpaRepository extends JpaRepository<Person, Integer> {
}
