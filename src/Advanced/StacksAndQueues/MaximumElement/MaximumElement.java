package Advanced.StacksAndQueues.MaximumElement;

import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int[] elements = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            int command = elements[0];
            switch (command) {
                case 1:
                    stack.push(elements[1]);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    Object max = Collections.max(stack);
                    System.out.println(max);
                    break;
            }


        }


    }
}
