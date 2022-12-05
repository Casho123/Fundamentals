package Methods.Problem11;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11 {
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

                case "exchange":
                    break;
                case "max":
                    String value = elements[1];
                    max(arr, value);
                    break;
                case "min":
                    value = elements[1];
                    min(arr, value);
                    break;
                case "first":
                    int count = Integer.parseInt(elements[1]);
                    value = elements[2];
                    first(arr, count, value);
                    break;
                case "last":
                    break;
            }

        }
    }
    public static void max(int[] arr, String value) {
        int maxElement = Integer.MIN_VALUE;
        int maxIndex = -1;
        if (value.equals("even")) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]%2 == 0) {
                    if (maxElement <= arr[i]) {
                        maxElement = arr[i];
                        maxIndex = i;
                    }
                }
            }
        } else if(value.equals("odd")) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] %2 != 0) {
                    if (maxElement <= arr[i]) {
                        maxElement = arr[i];
                        maxIndex = i;
                    }
                }
            }
        }
        if (maxIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(maxIndex);
        }
    }
    public static void min(int[] arr, String value) {
        int minElement = Integer.MAX_VALUE;
        int minIndex = -1;
        if (value.equals("even")) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]%2 == 0) {
                    if (minElement >= arr[i]) {
                        minElement = arr[i];
                        minIndex = i;
                    }
                }
            }
        } else if(value.equals("odd")) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] %2 != 0) {
                    if (minElement >= arr[i]) {
                        minElement = arr[i];
                        minIndex = i;
                    }
                }
            }
        }
        if (minIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(minIndex);
        }
    }
    public static void first(int[] arr, int count, String value) {
        if (count > arr.length) {
            System.out.println("Invalid count");
        } else {
            StringBuilder sb = new StringBuilder();

            if (value.equals("even")) {
                int counter = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] %2 == 0) {
                        sb.append(arr[i]).append(" ");
                        counter++;
                        if (counter == count){
                            break;
                        }
                    }

                }

            } else if(value.equals("odd")) {
                int counter = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] %2 != 0) {
                        sb.append(arr[i]).append(" ");
                        counter++;
                        if (counter == count){
                            break;
                        }
                    }


                }

            }
            String sbToStr = sb.toString().trim();
            String[] strArr = sbToStr.split("\\s+");
            String result = String.join(", ", strArr);


            System.out.println("[" + result + "]");

        }



    }
}
