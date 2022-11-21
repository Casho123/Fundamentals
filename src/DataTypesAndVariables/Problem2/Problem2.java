package DataTypesAndVariables.Problem2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        String num = number + "";
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum+= Integer.parseInt(num.charAt(i) - 48 + "");

        }
        System.out.println(sum);
    }
}
