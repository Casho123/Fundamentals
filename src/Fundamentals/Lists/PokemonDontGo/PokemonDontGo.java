package Fundamentals.Lists.PokemonDontGo;

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
                int value = list.get(0);
                sum += value;
                list.remove(0);
                list.add(0, list.get(list.size()-1));
                increaseOrDecrease(list, value);
            } else if (index >= list.size()) {
                sum += list.get(list.size()-1);
                int value = list.get(list.size()-1);
                list.remove(list.size()-1);
                list.add(list.get(0));
                increaseOrDecrease(list, value);
            } else {
                int value = list.get(index);
                sum += list.get(index);
                list.remove(index);
                increaseOrDecrease(list, value);
            }

        }
        System.out.println(sum);
    }

    public static void increaseOrDecrease(List<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= value) {
                list.set(i, list.get(i) + value);
            } else {
                list.set(i, list.get(i) - value);
            }

        }
    }
}
