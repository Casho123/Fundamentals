package Maps.MapsMoreExercise.Ranking;

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
        System.out.println();
    }
    public static boolean isValid(Map<String, String> contests, String contest, String password) {
        boolean hasContest = false;
        boolean hasPassword = false;
        if (contests.containsKey(contest)) {
            hasContest = true;
        }
        if (contests.get(contest).equals(password)) {
            hasPassword = true;
        }
        if (hasContest && hasPassword) {
            return true;
        }
        return false;
    }
}
