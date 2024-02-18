package com.vlad.wild.error.service;

import com.vlad.wild.error.info.Person;

public class PersonChangeService {

    public void changePersonName(Person person, String name) {
        person.name = name;
    }

    public void changePersonAge(Person person, int age) {
        person.age = age;
    }
}
