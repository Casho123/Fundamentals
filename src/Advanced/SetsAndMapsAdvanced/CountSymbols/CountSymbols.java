package Advanced.SetsAndMapsAdvanced.CountSymbols;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] arr = scan.nextLine().toCharArray();

        Map<Character, Integer> letters = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!letters.containsKey(arr[i])) {
                letters.put(arr[i], 0);
            }
            letters.put(arr[i], letters.get(arr[i]) + 1);
        }
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.printf("%s: %d time/s\n", entry.getKey(), entry.getValue());

        }





    }
}
