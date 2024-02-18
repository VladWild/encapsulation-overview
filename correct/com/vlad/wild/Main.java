package com.vlad.wild;

import com.vlad.wild.info.Person;
import com.vlad.wild.service.PersonChangeService;

public class Main {

    public static void main(String[] args) {
        PersonChangeService personChangeService = new PersonChangeService();

        Person person = new Person();
        person.setName("Игорь");
        person.setAge(23);

        System.out.println(person);

        personChangeService.changePersonName(person, "Александр");
        personChangeService.changePersonAge(person, 24);

        System.out.println(person);
    }
}
