package com.wangchg.example.person.controller;

import com.wangchg.example.person.dao.PersonRepository;
import com.wangchg.example.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @PostMapping("/save")
    public List<Person> savePerson(@RequestBody String personName) {
        Person p = new Person(personName);
        personRepository.save(p);
        return personRepository.findAll(PageRequest.of(0, 10)).getContent();
    }
}
