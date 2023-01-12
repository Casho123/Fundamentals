package Advanced.StacksAndQueues.RecursiveFibonacci;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Long> fibonacci = new ArrayDeque<>();
        long N = Integer.parseInt(scan.nextLine());
        System.out.println(getFibonacci(fibonacci, N));
    }

    private static Long getFibonacci(ArrayDeque<Long> fibonacci, Long N) {
        if (N == 2) {
            return 1L;
        } else {
            fibonacci.offer(0L);
            fibonacci.offer(1L);
            for (int i = 0; i < N; i++) {
                long Sum = fibonacci.poll() + fibonacci.peek();
                fibonacci.offer(Sum);
            }
        }
        fibonacci.poll();
        return fibonacci.peek();
    }
}