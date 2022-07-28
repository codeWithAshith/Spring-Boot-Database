package com.codeWithAshith.SpringBootDatabase.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringBootEntityDatabaseApplication implements CommandLineRunner {

    @Autowired
    PersonEntityDao personEntityDao;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEntityDatabaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(personEntityDao.findAll());
        System.out.println(personEntityDao.findById(101));
        personEntityDao.deleteById(102) ;
        System.out.println(personEntityDao.insert(new Person(103, "Abc", "asas", new Date())));
        System.out.println(personEntityDao.update(new Person(103, "Arun", "Mumbai", new Date())));
    }
}
