package Advanced.DefiningClasses.CatLady;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Cat> cats = new ArrayList<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] elements = input.split("\\s+");
            String breed = elements[0];
            String name = elements[1];
            double value = Double.parseDouble(elements[2]);
            switch (breed) {
                case "Siamese":
                    Siamese siamese = new Siamese(name, value);
                    cats.add(siamese);
                    break;
                case "Cymric":
                    Cymric cymric = new Cymric(name, value);
                    cats.add(cymric);
                    break;
                case "StreetExtraordinaire":
                    StreetExtraordinaire street = new StreetExtraordinaire(name, value);
                    cats.add(street);
                    break;
            }
        }
        String catName = scan.nextLine();
        Cat cat = null;
        for (Cat currentCat : cats) {
            if (currentCat.getName().equals(catName)) {
                cat = currentCat;
                break;
            }

        }
        System.out.println(cat);
    }
}
