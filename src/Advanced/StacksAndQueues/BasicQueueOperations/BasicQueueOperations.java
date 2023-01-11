package Advanced.StacksAndQueues.BasicQueueOperations;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int s = input[1];
        int x = input[2];
        int[] elements = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.add(elements[i]);
        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }
        if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            if (queue.contains(x)) {
                System.out.println(true);
            } else {
                Object min = Collections.min(queue);
                System.out.println(min);
            }
        }


    }
}
