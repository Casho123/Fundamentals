package Arrays.Problem9;

import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] elements = input.split("\\s+");
            String command = elements[0];
            switch (command) {
                case "swap":
                    int first = Integer.parseInt(elements[1]);
                    int second = Integer.parseInt(elements[2]);
                    int temp = arr[first];
                    arr[first] = arr[second];
                    arr[second] = temp;
                    break;
                case "multiply":

                    break;
                case "decrease":
                    break;
            }
        }

    }
}
