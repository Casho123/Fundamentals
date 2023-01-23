package Advanced.Generics.GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            Box<Integer> box = new Box<>(num);
            System.out.println(box);

        }
    }
}
