package Fundamentals.Lists.ObjectsAndClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    public static class Person{

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Person> people = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            String[] elements = scan.nextLine().split("\\s+");
            Person person = new Person(elements[0], Integer.parseInt(elements[1]));
            people.add(person);
        }

        people.stream().filter(p -> p.getAge() > 30).forEach(p -> System.out.printf("%s - %d%n", p.getName(), p.getAge()));



    }
}
