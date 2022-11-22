package DataTypesAndVariables.Problem7;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int totalLitres = 0;
        int capacity = 255;

        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(scan.nextLine());
            if (current > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                totalLitres += current;
                capacity -= current;
            }
        }

        System.out.println(totalLitres);
    }
}
