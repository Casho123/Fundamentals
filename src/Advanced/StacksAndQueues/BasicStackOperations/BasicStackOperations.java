package Advanced.StacksAndQueues.BasicStackOperations;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] elements = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = elements[0];
        int s = elements[1];
        int x = elements[2];
        String[] nums = scan.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(nums[i]));
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            if (stack.contains(x)) {
                System.out.println(true);
            } else {
                int min = Integer.MAX_VALUE;
                while(!stack.isEmpty()) {
                    if (stack.peek() < min) {
                        min = stack.peek();
                    }
                    stack.pop();
                }
                System.out.println(min);
            }
        }


    }
}
