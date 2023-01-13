package Advanced.SetsAndMapsAdvanced.UserLogs;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, List<String>>> users = new TreeMap<>();
        while(true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] elements = input.split("\\s+");
            String[] ipArr = elements[0].split("=");
            String ip = ipArr[1];
            String[] messageArr = elements[1].split("=");
            String message = messageArr[1];
            String[] userArr = elements[2].split("=");
            String user = userArr[1];
            users.putIfAbsent(user, new LinkedHashMap<>());
            users.get(user).putIfAbsent(ip, new ArrayList<>());
            users.get(user).get(ip).add(message);
        }
        for (Map.Entry<String, Map<String, List<String>>> entry : users.entrySet()) {
            System.out.println(entry.getKey() + ":");
            int size = entry.getValue().size();
            int index = 1;
            for (Map.Entry<String, List<String>> current : entry.getValue().entrySet()) {
                   if (index < size) {
                       System.out.printf("%s => %d, ", current.getKey(), current.getValue().size());
                   } else {
                       System.out.printf("%s => %d.\n", current.getKey(), current.getValue().size());
                   }
                   index ++;



            }
        }
    }
}
