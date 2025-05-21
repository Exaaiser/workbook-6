package com.pluralsight.streams;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(int age, String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
}
