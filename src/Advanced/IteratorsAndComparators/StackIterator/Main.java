package Advanced.IteratorsAndComparators.StackIterator;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CustomStack customStack = new CustomStack();
        String[] array = scan.nextLine().split("\\s+");
        int[] elements = Arrays.stream(array[1].split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < elements.length; i++) {
            customStack.push(elements[i]);
        }

        while(true) {
            String input = scan.nextLine();
            if (input.equals("END")) {
                break;
            }

        }





    }
}
