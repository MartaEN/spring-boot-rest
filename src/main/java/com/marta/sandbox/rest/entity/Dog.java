package com.marta.sandbox.rest.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Dog {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }
}
