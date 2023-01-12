package Advanced.SetsAndMapsAdvanced.PeriodicTable;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Set<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("\\s+");
            set.addAll(Arrays.asList(elements));
        }
        for (String s : set) {
            System.out.print(s+" ");
        }
    }
}
