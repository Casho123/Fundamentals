package Maps.AMinerTask;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();

        while(true) {
            String material = scan.nextLine();
            if (material.equals("stop")) {
                break;
            }
            int quantity = Integer.parseInt(scan.nextLine());
            if (!materials.containsKey(material)) {
                materials.put(material, quantity);
            } else {
                materials.put(material, materials.get(material) + quantity);
            }

        }
        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());

        }


    }
}
