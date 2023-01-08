package Fundamentals.TextProcessing.CeaserCipher;

import java.util.Scanner;

public class CeaserCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            String current = (char)(input.charAt(i)+3) + "";
            sb.append(current);


        }
        System.out.println(sb);
    }
}
