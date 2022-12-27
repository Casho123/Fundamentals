package Maps.SoftUniExamResulta;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> results = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();

        while(true) {
            String input = scan.nextLine();
            if (input.equals("exam finished")) {
                break;
            }
            String[] elements = input.split("-");
            if (elements.length == 3) {
                String name = elements[0];
                String subject = elements[1];
                int score = Integer.parseInt(elements[2]);
                if (!submissions.containsKey(subject)) {
                    submissions.put(subject, 0);
                }
                submissions.put(subject, submissions.get(subject) + 1);
                if (!results.containsKey(name)) {
                    results.put(name, score);
                } else {
                    if (results.get(name) < score) {
                        results.put(name,score);
                    }
                }

            } else if(elements.length == 2) {
                String name = elements[0];
                results.remove(name);
            }
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : submissions.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());

        }
    }
}
