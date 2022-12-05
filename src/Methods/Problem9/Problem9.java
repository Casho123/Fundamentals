package Methods.Problem9;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            if (input.equals("END")) {
                break;
            }
            isPalindrome(input);
        }


    }
    public static void isPalindrome(String input) {

            StringBuilder reversed = new StringBuilder();
            for (int i = input.length()-1; i >= 0; i--) {
                reversed.append(input.charAt(i));

            }
            System.out.println(reversed.toString().equals(input));

    }
}
