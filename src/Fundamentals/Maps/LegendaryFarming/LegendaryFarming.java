package Fundamentals.Maps.LegendaryFarming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> legendaryMaterials = new LinkedHashMap<>();
        Map<String, Integer> junkMaterials = new LinkedHashMap<>();

        legendaryMaterials.put("shards", 0);
        legendaryMaterials.put("fragments", 0);
        legendaryMaterials.put("motes", 0);

        boolean collected = false;

        while (true) {
            String[] elements = scan.nextLine().split(" ");

            for (int i = 0; i < elements.length - 1; i += 2) {
                int amount = Integer.parseInt(elements[i]);
                String material = elements[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments")
                        || material.equals("motes")) {
                    legendaryMaterials.put(material, legendaryMaterials.get(material) + amount);
                    if (legendaryMaterials.get(material) >= 250) {
                        switch (material) {
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;
                        }
                        legendaryMaterials.put(material, legendaryMaterials.get(material) - 250);
                        collected = true;
                        break;
                    }

                } else {
                    if (!junkMaterials.containsKey(material)) {
                        junkMaterials.put(material, 0);
                    }
                    junkMaterials.put(material, junkMaterials.get(material) + amount);
                }
            }
            if (collected) {
                break;
            }
        }
        for (Map.Entry<String, Integer> entry : legendaryMaterials.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : junkMaterials.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());

        }



    }
}
