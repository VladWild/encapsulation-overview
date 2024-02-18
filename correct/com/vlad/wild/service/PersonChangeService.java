package com.vlad.wild.service;

import com.vlad.wild.info.Person;

public class PersonChangeService {

    public void changePersonName(Person person, String name) {
        person.setName(name);
    }

    public void changePersonAge(Person person, int age) {
        person.setAge(age);
    }
}
