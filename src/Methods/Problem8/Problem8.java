package Methods.Problem8;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        printFactorialDivision(num1, num2);
    }
    public static void printFactorialDivision(int num1, int num2) {
        int factSumOne = 1;
        int factSumTwo = 1;
        for (int i = 1; i <= num1 ; i++) {
            factSumOne *= i;

        }
        for (int i = 1; i <= num2; i++) {
            factSumTwo *= i;
        }
        double result = 1.0 * factSumOne/factSumTwo;
        System.out.printf("%.2f", result);
    }
}
