package Fundamentals.Lists.AppendArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split("\\|");
        List<Integer> list = new ArrayList<>();

        for (int i = arr.length-1; i >= 0 ; i--) {
            String value = arr[i];
            String[] currentArr = value.split("\\s+");
            for (int j = 0; j < currentArr.length; j++) {
                if (!currentArr[j].equals("")) {
                    list.add(Integer.parseInt(currentArr[j]));
                }
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");

        }
    }
}
