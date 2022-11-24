package Arrays;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            String[] current = scan.nextLine().split("\\s+");
            if (i % 2 == 0) {
                arr1[i] = Integer.parseInt(current[0]);
                arr2[i] = Integer.parseInt(current[1]);
            } else {
                arr1[i] = Integer.parseInt(current[1]);
                arr2[i] = Integer.parseInt(current[0]);

            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }

    }
}
