package Lists.MoreExercises.TakeSkipRope;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Integer> numbers = new ArrayList<>();
        List<Character> nonNumbers = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                numbers.add(Character.getNumericValue(input.charAt(i)));
            } else {
                nonNumbers.add(input.charAt(i));
            }
        }
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (i%2 == 0) {
                takeList.add(numbers.get(i));
            } else {
                skipList.add(numbers.get(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < skipList.size(); i++) {
            int skip = 0;
            int take = takeList.get(i);
            if (i == 0) {
                skip = skipList.get(i)-1;
            } else {
                skip = skipList.get(i-1) + skipList.get(i);
            }


            for (int j = skip; j < take+skip; j++) {
                sb.append(nonNumbers.get(j));
            }


        }
        System.out.println(sb);



    }
}
