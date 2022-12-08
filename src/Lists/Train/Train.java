package Lists.Train;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scan.nextLine());

        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] elements = input.split("\\s+");
            String command = elements[0];
            if ("Add".equals(command)) {
                list.add(Integer.parseInt(elements[1]));
            } else {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) + Integer.parseInt(command) <= capacity) {
                        list.set(i, list.get(i) + Integer.parseInt(command));
                        break;
                    }
                }
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");

        }
    }
}
