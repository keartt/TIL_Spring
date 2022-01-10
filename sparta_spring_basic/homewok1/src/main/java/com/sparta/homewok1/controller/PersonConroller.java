package com.sparta.homewok1.controller;

import com.sparta.homewok1.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonConroller {
    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("강성현");
        person.setDay(211203);
        person.setJob("학생");
        return person;

    }
}
