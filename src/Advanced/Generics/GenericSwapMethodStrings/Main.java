package Advanced.Generics.GenericSwapMethodStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Box<String> box = new Box<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String current = scan.nextLine();
            box.addValue(current);

        }
        int[] indexes = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int index1 = indexes[0];
        int index2 = indexes[1];
        box.swap(index1, index2);

        System.out.println(box);






    }
}
