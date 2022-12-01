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
                    first = Integer.parseInt(elements[1]);
                    second = Integer.parseInt(elements[2]);
                    int current = arr[first] * arr[second];
                    arr[first] = current;
                    break;
                case "decrease":
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] -= 1;

                    }
                    break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length-1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }

        }

    }
}
