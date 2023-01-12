package Advanced.StacksAndQueues.BalancedParanthesis;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] arr = scan.nextLine().toCharArray();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        boolean isEqual = true;
        while (!stack.isEmpty()) {
            char current = stack.poll();
            char last = stack.peek();
            switch (current) {
                case '{':
                    if (last != '}') {
                        isEqual = false;
                    }
                    break;
                case '[':
                    if (last != ']') {
                        isEqual = false;
                    }
                    break;
                case '(':
                    if (last != ')') {
                        isEqual = false;
                    }
                    break;
            }
            if (!isEqual) {
                break;
            }
        }

        if (isEqual) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
