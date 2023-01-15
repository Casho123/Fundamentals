package Advanced.SetsAndMapsAdvanced.LogsAggregator;

import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, Integer> values = new LinkedHashMap<>();
        Map<String, List<String>> ipAddresses = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String[] elements = scan.nextLine().split("\\s+");
            String ip = elements[0];
            String user = elements[1];
            int value = Integer.parseInt(elements[2]);

            values.putIfAbsent(user, 0);
            values.put(user, values.get(user) + value);
            ipAddresses.putIfAbsent(user, new ArrayList<>());
            if (!ipAddresses.get(user).contains(ip)) {
                ipAddresses.get(user).add(ip);
            }
        }

    }
}
