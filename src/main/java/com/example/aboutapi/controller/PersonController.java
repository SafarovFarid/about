package com.example.aboutapi.controller;

import com.example.aboutapi.DTO.PersonDTO;
import com.example.aboutapi.Service.PersonService;
import com.example.aboutapi.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PersonController {

    private PersonService personService;
    @Autowired
    PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/person")
    public Person get(){
        return PersonDTO.getPerson();
    }

    @PostMapping("/person/add")
    public void save(@RequestBody Person person){
        personService.save(person);
    }

    @GetMapping("/allperson")
    public List<Person> getAll(){
        return personService.findAll();
    }

}
