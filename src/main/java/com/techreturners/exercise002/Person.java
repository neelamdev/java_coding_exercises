package com.techreturners.exercise002;

public class Person {
    private final String personName;
    private final String occupation;
    private final String location;
    private final int age;

    public Person(String personName, String occupation, String location, int age) {
        this.personName = personName;
        this.occupation = occupation;
        this.location = location;
        this.age = age;
    }


    public String getPersonName() {
        return personName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getLocation() {
        return location;
    }

    public int getAge() {
        return age;
    }

}