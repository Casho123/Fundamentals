package Advanced.StacksAndQueues.ReverseNumbersWithAStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }


    }
}
