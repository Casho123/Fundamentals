package Lists.ChangeList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] elements = input.split("\\s+");
            String command = elements[0];
            int element = Integer.parseInt(elements[1]);
            switch (command) {
                case "Delete":
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) == element) {
                            list.remove(i);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(elements[2]);
                    list.add(index, element);
                    break;
            }
        }
        for (Integer element : list) {
            System.out.print(element + " ");

        }


    }
}
