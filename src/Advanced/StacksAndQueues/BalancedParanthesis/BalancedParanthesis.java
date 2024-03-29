package Advanced.StacksAndQueues.BalancedParanthesis;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] arr = scan.nextLine().toCharArray();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < arr.length/2; i++) {
            stack.push(arr[i]);
        }
        for (int i = arr.length/2; i < arr.length; i++) {
            queue.add(arr[i]);

        }

        boolean isEqual = true;
        while (!stack.isEmpty()) {
            char current = stack.peek();
            char last = queue.peek();
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
            stack.pop();
            queue.poll();
        }

        if (isEqual) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
