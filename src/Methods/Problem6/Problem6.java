package Methods.Problem6;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        findMiddleChar(input);

    }

    public static void findMiddleChar(String word) {
        if (word.length() % 2 != 0) {
            for (int i = 0; i < word.length(); i++) {
                if (i == word.length()/2) {
                    System.out.println(word.charAt(i));
                }
            }
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (i == word.length()/2 -1 || i == word.length()/2) {
                    System.out.print(word.charAt(i));
                }

            }

        }
    }
}
