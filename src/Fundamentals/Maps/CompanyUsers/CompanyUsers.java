package Fundamentals.Maps.CompanyUsers;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>>  companies = new LinkedHashMap<>();

        while (true) {

            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] elements = input.split(" -> ");
            String company = elements[0];
            String id = elements[1];

            if (!companies.containsKey(company)) {
                companies.put(company, new ArrayList<>());
            }

            if (!companies.get(company).contains(id)) {
                companies.get(company).add(id);
            }

        }

        for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));

            }

        }
    }
}
