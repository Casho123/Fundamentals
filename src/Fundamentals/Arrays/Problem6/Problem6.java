package Fundamentals.Arrays.Problem6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;

        if (arr.length == 1) {
            System.out.println(0);
        } else {
            for (int i = 0; i < arr.length ; i++) {
                int leftSum = 0;
                int rightSum = 0;
                for (int j = i; j >= 0 ; j--) {
                    leftSum += arr[j];

                }
                for (int j = i; j < arr.length ; j++) {
                    rightSum += arr[j];
                }
                if (leftSum == rightSum) {
                    System.out.println(i);
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("no");
            }
        }
    }
}
