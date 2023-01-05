package TextProcessing.TextProcessingMoreExercise.ASCIISumator;

import java.util.Scanner;

public class ASCIISumator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        String input = scan.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            int current = input.charAt(i);
            if (first < current && current < second) {
                sum += current;
            }

        }
        System.out.println(sum);



    }
}
