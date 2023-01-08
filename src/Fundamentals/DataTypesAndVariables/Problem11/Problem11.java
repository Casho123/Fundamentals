package Fundamentals.DataTypesAndVariables.Problem11;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double bestValue = Integer.MIN_VALUE;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;


        for (int i = 0; i < n; i++) {
            int snow = Integer.parseInt(scan.nextLine());
            int time = Integer.parseInt(scan.nextLine());
            int quality = Integer.parseInt(scan.nextLine());

            double currentValue = Math.pow((1.0 * snow/time), quality);
            if (currentValue > bestValue) {
                bestValue = currentValue;
                bestSnow = snow;
                bestTime = time;
                bestQuality = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestValue, bestQuality);
    }
}
