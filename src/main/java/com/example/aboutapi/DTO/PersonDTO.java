package com.example.aboutapi.DTO;

import com.example.aboutapi.entity.Person;

import java.util.Date;


public class PersonDTO {

    private static final Person person = new Person();

    public static Person getPerson(){
        Person person = new Person();
        person.setId(1);
        person.setFirstName("Farid");
        person.setLastName("Safarov");
        return person;
    }


}
