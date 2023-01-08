package Fundamentals.TextProcessing.CharacterMultiplier;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] elements = scan.nextLine().split("\\s+");
        multiplyStrings(elements[0], elements[1]);



    }
    public static void multiplyStrings(String str1, String str2) {
        int sum = 0;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                sum += str1.charAt(i) * str2.charAt(i);
            }
        } else if(str1.length() > str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                sum += str1.charAt(i) * str2.charAt(i);
            }
            String remainder = str1.substring(str2.length());
            for (int i = 0; i < remainder.length(); i++) {
                sum += remainder.charAt(i);

            }
        } else {
            for (int i = 0; i < str1.length(); i++) {
                sum += str1.charAt(i) * str2.charAt(i);
            }
            String remainder = str2.substring(str1.length());
            for (int i = 0; i < remainder.length(); i++) {
                sum += remainder.charAt(i);

            }
        }
        System.out.println(sum);
    }
}
