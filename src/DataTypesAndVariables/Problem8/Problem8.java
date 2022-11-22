package DataTypesAndVariables.Problem8;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String biggestKeg = "";
        double largestVolume = 0;

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double currentVolume = Math.PI * radius * radius * height;
            if (currentVolume >= largestVolume) {
                largestVolume = currentVolume;
                biggestKeg = name;
            }
        }
        System.out.println(biggestKeg);

    }
}
