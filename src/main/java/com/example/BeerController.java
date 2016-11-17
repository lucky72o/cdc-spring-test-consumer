package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class BeerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.POST, value = "/beer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String giveMeABeer(@RequestBody Person person) {

        return null;
    }
}


//    @RequestMapping(method = RequestMethod.POST, value = "/beer", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public String giveMeABeer(@RequestBody Person person) {
//        ResponseEntity<CheckResponse> response = restTemplate.exchange(RequestEntity.post(URI.create("http://localhost:9090/check"))
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(person), CheckResponse.class);
//
//        switch (response.getBody().getStatus()) {
//            case "OK":
//                return "THERE YOU GO";
//            default:
//                return "GET LOST";
//        }
//    }


class Person {

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
