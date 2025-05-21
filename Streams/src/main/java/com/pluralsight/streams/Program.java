package com.pluralsight.streams;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person(30, "Doe", "John"),
                new Person(25, "Smith", "Jane"),
                new Person(40, "Johnson", "Mike"),
                new Person(35, "Davis", "Emily"),
                new Person(28, "Brown", "Chris"),
                new Person(22, "Wilson", "Sarah"),
                new Person(38, "Clark", "David"),
                new Person(27, "Martinez", "Laura"),
                new Person(33, "Lee", "James"),
                new Person(29, "Walker", "Anna")
        );


        System.out.println("----Welcome the Person Founder----\n" );



        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Name and Surname");
        String inputName = scanner.nextLine().toLowerCase();

        List<Person> matchedPeople = people.stream()
                .filter(p ->
                        p.getFirstName().toLowerCase().contains(inputName) ||
                                p.getLastName().toLowerCase().contains(inputName)
                )
                .collect(Collectors.toList());

        System.out.println("\n Matched Persons :");
        matchedPeople.forEach(p ->
                System.out.println("Age : " + p.getAge() + " | Last Name: " + p.getLastName() + " | First Name: " + p.getFirstName())
        );

    }
}
