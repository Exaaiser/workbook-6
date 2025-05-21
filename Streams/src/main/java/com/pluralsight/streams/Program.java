package com.pluralsight.streams;

import java.util.*;
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
                new Person(29, "Walker", "Anna"),
                new Person(29, "Gul", "Ozan")

        );

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Search by name and surname");
            System.out.println("2 - Search by age");
            System.out.println("3 - See Avrage age of employee");
            System.out.println("0 - Exit");
            System.out.print("Choose: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Name or Surname: ");
                    String nameInput = scanner.nextLine().toLowerCase();

                    List<Person> nameMatches = people.stream()
                            .filter(p ->
                                    p.getFirstName().toLowerCase().contains(nameInput) ||
                                            p.getLastName().toLowerCase().contains(nameInput))
                            .collect(Collectors.toList());

                    printResults(nameMatches);
                    break;

                case "2":
                    System.out.print("Enter Age: ");
                    String ageInput = scanner.nextLine();

                    List<Person> ageMatches = people.stream()
                            .filter(p -> String.valueOf(p.getAge()).equals(ageInput))
                            .collect(Collectors.toList());

                    printResults(ageMatches);
                    break;

                case "3":
                    double avgAge = people.stream()
                            .mapToInt(Person::getAge)
                            .average()
                            .orElse(0);
                    System.out.printf("Average Age : %.2f \n", avgAge);
                    break;

                case "0":
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Valid error.");
            }
        }
    }

    private static void printResults(List<Person> list) {
        if (list.isEmpty()) {
            System.out.println("___");
        } else {
            System.out.println("Matched persons :");
            list.forEach(p ->
                    System.out.println("Age : " + p.getAge() + "| Last Name: " + p.getLastName() + "| First Name: " + p.getFirstName()));
        }
    }
}
