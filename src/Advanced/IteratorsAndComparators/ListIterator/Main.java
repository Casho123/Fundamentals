package Advanced.IteratorsAndComparators.ListIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<String> list = Arrays.stream(scan.nextLine().split("\\s+")).skip(1).collect(Collectors.toList());
        ListyIterator listyIterator = new ListyIterator(list);

        while (true) {
            String input = scan.nextLine();
            if (input.equals("END")) {
                break;
            }
            switch (input) {
                case "HasNext":
                    System.out.println(listyIterator.iterator().hasNext());
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        listyIterator.print();

                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());

                    }
                    break;
                case "PrintAll":
                    try {
                        listyIterator.printAll();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

            }
        }


    }
}
