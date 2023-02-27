package OOP.TestingJava;


import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class C {
    public static void main(String[] args) {

        Person[] persons = {new Person(3), new Person(4), new Person(1)};
        Arrays.sort(persons);


    }
    static class Person implements Comparable {
        private int id;

        Person(int id) {
            this.id = id;
        }

        @Override
        public int compareTo(@NotNull Object o) {
            return 0;
        }
    }
}





