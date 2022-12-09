package Lists.ListOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] elements = input.split("\\s+");
            String command = elements[0];
            switch (command) {
                case "Add":
                    int number = Integer.parseInt(elements[1]);
                    list.add(number);
                    break;
                case "Insert":
                    number = Integer.parseInt(elements[1]);
                    int index = Integer.parseInt(elements[2]);
                    if (index > list.size()-1) {
                        System.out.println("Invalid index");
                    } else {
                        list.add(index, number);
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(elements[1]);
                    if (index > list.size()-1) {
                        System.out.println("Invalid index");
                    } else {
                        list.remove(index);
                    }
                    break;
                case "Shift":
                    String location = elements[1];
                    int count = Integer.parseInt(elements[2]);
                    if (location.equals("left")) {
                        for (int i = 0; i < count; i++) {
                            list.add(list.get(0));
                            list.remove(0);

                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            list.add(0, list.get(list.size()-1));
                            list.remove(list.get(list.size()-1));
                        }
                    }
                    break;

            }
        }
        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }
}
