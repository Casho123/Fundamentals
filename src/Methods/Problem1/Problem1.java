package Methods.Problem1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        findSmallest(num1, num2, num3);


    }
    public static void findSmallest(int num1, int num2, int num3) {

        int result = Math.min(Math.min(num1, num2), num3);

        System.out.println(result);

    }
}
