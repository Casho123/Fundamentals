package Lists.MoreExercises.MixedUpLists;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> listOne = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Collections.reverse(listTwo);

        List<Integer> listThree = new ArrayList<>();

        int min = 0;
        int max = 0;


        if (listOne.size() > listTwo.size()) {
            for (int i = 0; i < listTwo.size(); i++) {
                listThree.add(listOne.get(i));
                listThree.add(listTwo.get(i));
            }
            min = Math.min(listOne.get(listOne.size()-1), listOne.get(listOne.size()-2));
            max = Math.max(listOne.get(listOne.size()-1), listOne.get(listOne.size()-2));
        } else {
            for (int i = 0; i < listOne.size(); i++) {
                listThree.add(listOne.get(i));
                listThree.add(listTwo.get(i));
            }
            min = Math.min(listTwo.get(listTwo.size()-1), listTwo.get(listTwo.size()-2));
            max = Math.max(listTwo.get(listTwo.size()-1), listTwo.get(listTwo.size()-2));
        }
        Collections.sort(listThree);


        for (Integer integer : listThree) {
            if (min < integer && integer < max) {
                System.out.print(integer + " ");
            }
        }





    }
}
