package Arrays.Problem4;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int temp = array[0];
            for (int j = 0; j < array.length-1; j++) {
                array[j] = array[j+1];
            }
            array[array.length-1] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
