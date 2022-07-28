package com.codeWithAshith.SpringBootDatabase.jpaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringBootEntityDatabaseApplication implements CommandLineRunner {

    @Autowired
    PersonEntityRepository personEntityRepository;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEntityDatabaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(personEntityRepository.findAll());
        System.out.println(personEntityRepository.findById(101));
        personEntityRepository.deleteById(102) ;
        System.out.println(personEntityRepository.insert(new Person(103, "Abc", "asas", new Date())));
        System.out.println(personEntityRepository.update(new Person(103, "Arun", "Mumbai", new Date())));
    }
}
