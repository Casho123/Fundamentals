package Advanced.DefiningClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    public static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
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

        List<Student> students = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("\\s+");

            Student student = new Student(elements[0], Integer.parseInt(elements[1]));
            students.add(student);

        }
        students.stream().filter(s -> s.getAge() > 30)
                .sorted((s1,s2) -> s1.getName().compareTo(s2.getName()))
                .forEach(st -> System.out.printf("%s - %d\n", st.getName(), st.getAge()));




    }
}
