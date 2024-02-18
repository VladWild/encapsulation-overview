package com.vlad.wild.correct.service;

import com.vlad.wild.error.info.Person;

public class PersonChangeService {

    public void changePersonName(Person person, String name) {
        person.setName(name);
    }

    public void changePersonAge(Person person, int age) {
        person.setAge(age);
    }
}
