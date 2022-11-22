package DataTypesAndVariables.Problem10;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int power = Integer.parseInt(scan.nextLine());
        int distance = Integer.parseInt(scan.nextLine());
        int exhaustion = Integer.parseInt(scan.nextLine());

        int counter = 0;
        int powerReducing = power;

        while (true) {
            if (powerReducing < distance) {
                break;
            }
            powerReducing-=distance;
            counter++;
            if (exhaustion != 0 && powerReducing == power/2) {
                powerReducing /= exhaustion;
            }
        }
        System.out.println(powerReducing);
        System.out.println(counter);
    }
}
