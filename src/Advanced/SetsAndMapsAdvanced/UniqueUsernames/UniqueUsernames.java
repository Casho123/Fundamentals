package Advanced.SetsAndMapsAdvanced.UniqueUsernames;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String current = scan.nextLine();
            set.add(current);
        }
        for (String s : set) {
            System.out.println(s);
        }

    }
}
