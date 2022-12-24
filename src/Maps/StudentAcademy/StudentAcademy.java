package Maps.StudentAcademy;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String student = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            if (!students.containsKey(student)) {
                students.put(student, new ArrayList<>());
            }
            students.get(student).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            double gradesSum = 0;
            for (Double grade : entry.getValue()) {
                gradesSum += grade;
            }
            double averageGrade = gradesSum / entry.getValue().size();
            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f\n", entry.getKey(), averageGrade);
            }
        }

    }
}
