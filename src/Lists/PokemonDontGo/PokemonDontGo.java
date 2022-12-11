package Lists.PokemonDontGo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while(true) {
            if (list.isEmpty()) {
                break;
            }
            int index = Integer.parseInt(scan.nextLine());
            if (index < 0) {
                sum += list.get(0);
                list.remove(0);
                list.add(0, list.get(list.size()-1));
            } else if (index > list.size()) {
                sum += list.get(list.size()-1);
                list.remove(list.size()-1);
                list.add(0);
            } else {
                int value = list.get(index);
                for (int i = 0; i < list.size(); i++) {
                    if (i != index) {
                        if (list.get(i) <= value) {
                            list.set(i, list.get(i) + value);
                        } else {
                            list.set(i, list.get(i) - value);
                        }
                        sum += list.get(index);


                    }
                }
                list.remove(index);

            }

        }
        System.out.println(sum);
    }
}
