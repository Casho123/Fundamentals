package Fundamentals.Lists.SoftUniCoursePlanning;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> courses = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());

        while (true) {
            String[] elements = scan.nextLine().split(":");
            if (elements[0].equals("course start")) {
                break;
            }
            String command = elements[0];

            switch (command) {
                case "Add":
                    String lessonToAdd = elements[1];
                    if (!courses.contains(lessonToAdd)) {
                        courses.add(lessonToAdd);
                    }
                    break;
                case "Insert":
                    String lessonToInsert = elements[1];
                    int index = Integer.parseInt(elements[2]);
                    if (!courses.contains(lessonToInsert)) {
                        courses.add(index, lessonToInsert);
                    }
                    break;
                case "Remove":
                    String lessonToRemove = elements[1];
                    courses.remove(lessonToRemove);
                    courses.remove(lessonToRemove + "-Exercise");
                    break;
                case "Swap":
                    String firstLesson = elements[1];
                    String secondLesson = elements[2];
                    if (courses.contains(firstLesson) && courses.contains(secondLesson)) {
                        int firstLessonIndex = courses.indexOf(firstLesson);
                        int secondLessonIndex = courses.indexOf(secondLesson);
                        if (!courses.contains(firstLesson + "-Exercise") && !courses.contains(secondLesson + "-Exercise")) {
                            courses.set(firstLessonIndex, secondLesson);
                            courses.set(secondLessonIndex, firstLesson);
                        } else if (courses.contains(firstLesson + "-Exercise")) {
                            courses.set(firstLessonIndex, secondLesson);
                            courses.set(secondLessonIndex, firstLesson);
                            courses.remove(firstLesson+ "-Exercise");
                            courses.add(secondLessonIndex+1, firstLesson + "-Exercise");
                        } else if (courses.contains(secondLesson + "-Exercise")) {
                            courses.set(firstLessonIndex, secondLesson);
                            courses.set(secondLessonIndex, firstLesson);
                            courses.remove(secondLesson + "-Exercise");
                            courses.add(firstLessonIndex+1, secondLesson + "-Exercise");
                        }
                    }
                    break;
                case "Exercise":
                    String courseOfTheEx = elements[1];
                    if (courses.contains(courseOfTheEx)) {
                        if (!courses.contains(courseOfTheEx + "-Exercise")) {
                            int exerciseIndex = courses.indexOf(courseOfTheEx) + 1;
                            courses.add(exerciseIndex, courseOfTheEx + "-Exercise");
                        }
                    } else {
                        courses.add(courseOfTheEx);
                        courses.add(courseOfTheEx + "-Exercise");
                    }
                    break;
            }
        }
        int counter = 1;
        for (String course : courses) {
            System.out.println(counter + "." + course);
            counter++;

        }
    }
}
