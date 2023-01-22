package Advanced.DefiningClasses.Google;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] elements = input.split("\\s+");
            String name = elements[0];
            String current = elements[1];
            Person person = null;
            if (!isFound(people, name)) {
                person = new Person(name);
                people.add(person);
            } else {
                person = findPerson(people, name);
            }

            switch (current) {
                case "company":
                    String companyName = elements[2];
                    String department = elements[3];
                    double salary = Double.parseDouble(elements[4]);
                    Company company = new Company(companyName, department, salary);
                    person.setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = elements[2];
                    String pokemonType = elements[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    person.getPokemons().add(pokemon);
                    break;
                case "parents":
                    String parentName = elements[2];
                    String parentDob = elements[3];
                    Parent parent = new Parent(parentName, parentDob);
                    person.getParents().add(parent);
                    break;
                case "children":
                    String childName = elements[2];
                    String childDob = elements[3];
                    Child child = new Child(childName, childDob);
                    person.getChildren().add(child);
                    break;
                case "car":
                    String carModel = elements[2];
                    int carSpeed = Integer.parseInt(elements[3]);
                    Car car = new Car(carModel, carSpeed);
                    person.setCar(car);
                    break;
            }
        }
        String personName = scan.nextLine();
        Person foundPerson = findPerson(people, personName);
        System.out.println(personName);
        System.out.println("Company:");
        if (foundPerson.getCompany() != null) {
            System.out.println(foundPerson.getCompany().toString());
        }
        System.out.println("Car:");
        if (foundPerson.getCar() != null) {
            System.out.println(foundPerson.getCar().toString());
        }
        System.out.println("Pokemon:");
        if (foundPerson.getPokemons().size() > 0) {
            for (Pokemon pokemon : foundPerson.getPokemons()) {
                System.out.println(pokemon.toString());
            }
        }
        System.out.println("Parents:");
        if (foundPerson.getParents().size() > 0) {
            for (Parent parent : foundPerson.getParents()) {
                System.out.println(parent.toString());
            }
        }
        System.out.println("Children:");
        if (foundPerson.getChildren().size() > 0) {
            for (Child child : foundPerson.getChildren()) {
                System.out.println(child.toString());

            }
        }

    }
    public static boolean isFound(List<Person> people, String name) {
        boolean isTrue = false;
        for (Person person : people) {
            if (person.getName().equals(name)) {
                isTrue = true;
                break;

            }

        }
        return isTrue;
    }
    public static Person findPerson(List<Person> people, String name) {
        Person person = null;
        for (Person person1 : people) {
            if (person1.getName().equals(name)) {
                person = person1;
                break;
            }

        }


        return person;
    }
}
