package Advanced.Generics.GenericCountMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Box<Double> box = new Box<>();
        for (int i = 0; i < n; i++) {
            double current = Double.parseDouble(scan.nextLine());
            box.addValue(current);
        }
        double current = Double.parseDouble(scan.nextLine());
        System.out.println(box.getElementsCount(current));



    }
}
