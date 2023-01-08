package Fundamentals.Maps.MapsMoreExercise.Ranking;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ranking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> contests = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> students = new TreeMap<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("end of contests")) {
                break;
            }
            String[] elements = input.split(":");
            String contest = elements[0];
            String password = elements[1];
            if (!contests.containsKey(contest)) {
                contests.put(contest, password);
            }
        }


        while (true) {
            String input = scan.nextLine();
            if (input.equals("end of submissions")) {
                break;
            }
            String[] elements = input.split("=>");
            String contest = elements[0];
            String password = elements[1];
            String student = elements[2];
            int points = Integer.parseInt(elements[3]);
            if (isValid(contests, contest, password)) {
                if (!students.containsKey(student)) {
                    students.put(student, new TreeMap<>());
                    students.get(student).put(contest, points);
                } else {
                    if (!students.get(student).containsKey(contest)) {
                        students.get(student).put(contest, points);
                    } else {
                        int currentPointsForContest = students.get(student).get(contest);
                        if (currentPointsForContest < points) {
                            students.get(student).put(contest, points);
                        }
                    }
                }

            }
        }
        int bestResult = Integer.MIN_VALUE;
        String name = "";
        for (Map.Entry<String, Map<String, Integer>> entry : students.entrySet()) {
            int currentResult = 0;
            for (Map.Entry<String, Integer> subject : entry.getValue().entrySet()) {
                currentResult += subject.getValue();
            }
            if (bestResult < currentResult) {
                bestResult = currentResult;
                name = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.\n", name, bestResult);
        System.out.println("Ranking:");
        students.forEach((key, value) -> {
            System.out.printf("%s\n", key);
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("#  %s -> %d\n", i.getKey(), i.getValue()));
        });



    }
    public static boolean isValid(Map<String, String> contests, String contest, String password) {
        boolean hasContest = false;
        boolean hasPassword = false;
        if (contests.containsKey(contest)) {
            hasContest = true;
        } else {
            return false;
        }
        if (contests.get(contest).equals(password)) {
            hasPassword = true;
        }
        return hasPassword;
    }
}
