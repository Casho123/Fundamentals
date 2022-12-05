package Methods.Problem10;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int[] arr = isDivisibleBy8(number);
        for (int i = 0; i < arr.length; i++) {
            if (hasOneDigit(arr[i])) {
                System.out.println(arr[i]);
            }

        }
    }

    public static int[] isDivisibleBy8(int number) {
        String numbers = "";
        for (int i = 10; i <= number; i++) {
            int sum = 0;
            String current = i + "";
            for (int j = 0; j < current.length(); j++) {
                sum += Integer.parseInt(current.charAt(j) +"");
            }
            if (sum % 8 == 0) {
                numbers += i + " ";
            }
        }
        return Arrays.stream(numbers.split("\\s+")).mapToInt(Integer::parseInt).toArray();

    }
    public static boolean hasOneDigit(int number) {
        String num = number + "";

        for (int i = 0; i < num.length(); i++) {
            int current = Integer.parseInt(num.charAt(i) + "");
            if (current %2 != 0) {
                return true;
            }
        }
        return false;

    }
}
