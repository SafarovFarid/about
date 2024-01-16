package com.example.aboutapi.Service;

import com.example.aboutapi.entity.Person;
import com.example.aboutapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    public Person save(Person person){
        return personRepository.save(person);
    }
    public List<Person> findAll(){
        return personRepository.findAll();
    }

}
