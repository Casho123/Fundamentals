package Lists.ObjectsAndClasses.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    public static class Person {

        private String name;
        private String id;
        private int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        while(true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] elements = input.split("\\s+");

            String name = elements[0];
            String id = elements[1];
            int age = Integer.parseInt(elements[2]);

            Person person = new Person(name, id, age);
            people.add(person);
        }
        people.sort(Comparator.comparing(Person::getAge));

        people.forEach(p -> System.out.printf("%s with ID: %s is %d years old.\n", p.getName(), p.getId(), p.getAge()));



    }
}
