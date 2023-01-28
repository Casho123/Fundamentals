package Advanced.Generics.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CustomList<String> list = new CustomList<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("END")) {
                break;
            }
            String[] elements = input.split("\\s+");
            String command = elements[0];
            switch (command) {
                case "Add":
                    String element = elements[1];
                    list.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(elements[1]);
                    list.remove(index);
                    break;
                case "Contains":
                    element = elements[1];
                    System.out.println(list.contains(element));
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(elements[1]);
                    int index2 = Integer.parseInt(elements[2]);
                    list.swap(index1, index2);
                    break;
                case "Greater":
                    element = elements[1];
                    System.out.println(list.countGreaterThan(element));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    list.print();
                    break;
                case "Sort":
                    Sorter.sort(list);
                    break;


            }
        }


    }
}
