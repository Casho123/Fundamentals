package Lists.SoftUniCoursePlanning;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> courses = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        while (true) {
            String input = scan.nextLine();
            if (input.equals("course start")) {
                break;
            }
            String[] elements = input.split(":");
            String command = elements[0];
            switch (command) {
                case "Add":
                    String lesson = elements[1];
                    if (!courses.contains(lesson)) {
                        courses.add(lesson);
                    }
                    break;
                case "Insert":
                    lesson = elements[1];
                    int index = Integer.parseInt(elements[2]);
                    if (!courses.contains(lesson)) {
                        courses.add(index, lesson);
                    }
                    break;
                case "Remove":
                    lesson = elements[1];
                    courses.remove(lesson);
                    break;
                case "Swap":
                    String firstLesson = elements[1];
                    String secondLesson = elements[2];
                    if (courses.contains(firstLesson) && courses.contains(secondLesson)) {
                        int firstIndex = courses.indexOf(firstLesson);
                        int secondIndex = courses.indexOf(secondLesson);
                        courses.remove(firstIndex);
                        courses.add(firstIndex, secondLesson);
                        courses.remove(secondIndex);
                        courses.add(secondIndex, firstLesson);

                    }
                    break;
                case "Exercise":
                    break;
            }
        }
        int counter = 1;
        for (String course : courses) {
            System.out.printf("%d.%s\n", counter, course);
            counter++;


        }
    }
}
