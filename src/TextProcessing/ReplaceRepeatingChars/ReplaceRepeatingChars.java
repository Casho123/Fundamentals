package TextProcessing.ReplaceRepeatingChars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            chars.add(input.charAt(i));
        }

        for (int i = 0; i < chars.size()-1; i++) {
            if (chars.get(i) == chars.get(i+1)) {
                chars.remove(i+1);
                i--;
            }
        }

        for (int i = 0; i < chars.size(); i++) {
            System.out.print(chars.get(i));

        }
    }
}
