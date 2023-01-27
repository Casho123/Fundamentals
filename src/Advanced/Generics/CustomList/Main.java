package Advanced.Generics.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CustomList<Integer> list = new CustomList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list.getMax());



    }
}
