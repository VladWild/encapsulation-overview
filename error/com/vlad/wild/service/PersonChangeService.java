package com.vlad.wild.service;

import com.vlad.wild.info.Person;

public class PersonChangeService {

    public void changePersonName(Person person, String name) {
        person.name = name;
    }

    public void changePersonAge(Person person, int age) {
        person.age = age;
    }
}
