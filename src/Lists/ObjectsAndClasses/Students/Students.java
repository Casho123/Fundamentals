package Lists.ObjectsAndClasses.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {

    public static class Student{

        private String firstName;
        private String lastName;
        private double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] elements = scan.nextLine().split(" ");
            Student student = new Student(elements[0], elements[1], Double.parseDouble(elements[2]));
            students.add(student);
        }
        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        students.forEach(s -> System.out.printf("%s %s: %.2f\n", s.getFirstName(), s.getLastName(), s.getGrade()));

    }
}
