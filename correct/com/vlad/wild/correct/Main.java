package com.vlad.wild.correct;

import com.vlad.wild.error.info.Person;
import com.vlad.wild.error.service.PersonChangeService;

public class Main {

    public static void main(String[] args) {
        PersonChangeService personChangeService = new PersonChangeService();

        Person person = new Person();
        person.setName("Игорь");
        person.setAge(23);

        System.out.println("Before: " + person);

        personChangeService.changePersonName(person, "Александр");
        personChangeService.changePersonAge(person, 24);

        System.out.println("After: " + person);
    }
}
