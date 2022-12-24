package Maps.Courses;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] elements = input.split(" : ");
            String course = elements[0];
            String student = elements[1];

            if (!courses.containsKey(course)) {
                courses.put(course, new ArrayList<>());
            }
                courses.get(course).add(student);

        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().size());
            for (String student : entry.getValue()) {
                System.out.println("-- "+ student);
            }

        }
    }
}
