package com.example.aboutapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="about")
@Data
public class Person {
    @Id
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
