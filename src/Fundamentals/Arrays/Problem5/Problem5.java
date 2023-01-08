package Fundamentals.Arrays.Problem5;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            boolean isTop = true;
            int current = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (current <= arr[j]) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(current + " ");
            }
        }

    }
}
