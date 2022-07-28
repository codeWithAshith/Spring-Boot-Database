package com.codeWithAshith.SpringBootDatabase.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringBootDatabaseApplication implements CommandLineRunner {

    @Autowired
    PersonJdbcDao personJdbcDao;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDatabaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(personJdbcDao.findAll());
        System.out.println(personJdbcDao.findById(101));
        System.out.println(personJdbcDao.deleteById(102) + "");
        System.out.println(personJdbcDao.insert(new Person(103, "Abc", "asas", new Date())));
        System.out.println(personJdbcDao.update(new Person(103, "Arun", "Mumbai", new Date())));
    }
}
