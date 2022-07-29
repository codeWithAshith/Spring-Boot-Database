package com.codeWithAshith.SpringBootDatabase.restClient;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class RestClient {
    private static final String PERSONS = "http://localhost:8080/api/person";

    static RestTemplate restTemplate = new RestTemplate();


    public static void main(String[] args) {
        getAllPersons();
    }

    private static void getAllPersons() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>("parameters", httpHeaders);

        ResponseEntity<String> response =restTemplate.exchange(PERSONS, HttpMethod.GET,
                entity, String.class);
        System.out.println(response);
    }

}
