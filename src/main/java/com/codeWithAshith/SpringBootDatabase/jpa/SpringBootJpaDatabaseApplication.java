package com.codeWithAshith.SpringBootDatabase.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringBootJpaDatabaseApplication implements CommandLineRunner {

    @Autowired
    PersonJpaRepository personJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaDatabaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(personJpaRepository.findAll());
        System.out.println(personJpaRepository.findById(101));
        personJpaRepository.deleteById(102);
        System.out.println(personJpaRepository.save(new Person(103, "Abc", "asas", new Date())));
        System.out.println(personJpaRepository.save(new Person(103, "Arun", "Mumbai", new Date())));
        System.out.println(personJpaRepository.findAllPersonByLocation("Mumbai"));
        System.out.println(personJpaRepository.updatePersonNameByLocation("UpdatedName", "asas"));
    }
}
