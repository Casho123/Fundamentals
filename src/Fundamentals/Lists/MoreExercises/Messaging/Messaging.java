package Fundamentals.Lists.MoreExercises.Messaging;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String text = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            String current = numbers.get(i) + "";
            int sum = 0;
            for (int j = 0; j < current.length(); j++) {
                int currentNum = Character.getNumericValue(current.charAt(j));
                sum += currentNum;
            }
            if (sum <= text.length()) {
                char currentChar = text.charAt(sum);
                sb.append(currentChar);
                text = text.substring(0, sum) + text.substring(sum+1);
            } else {
                int index = sum-text.length();
                sb.append(text.charAt(index));
                text = text.substring(0, index) + text.substring(index+1);
            }
        }
        System.out.println(sb);



    }
}
