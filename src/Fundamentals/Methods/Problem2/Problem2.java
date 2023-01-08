package Fundamentals.Methods.Problem2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        vowelsCount(word);


    }
    public static void vowelsCount(String word) {
        int counter = 0;
        String vowels = "aoueiyAOUEIY";
        for (int i = 0; i < word.length(); i++) {
            String current = word.charAt(i) + "";
            if (vowels.contains(current)) {
                counter++;
            }

        }
        System.out.println(counter);
    }
}
