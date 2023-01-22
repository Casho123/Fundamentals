package Advanced.DefiningClasses.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Trainer> trainers = new ArrayList<>();


        while(true) {
            String input = scan.nextLine();
            if (input.equals("Tournament")) {
                break;
            }
            String[] elements = input.split("\\s+");

            String trainerName = elements[0];
            String pokemonName = elements[1];
            String element = elements[2];
            int pokemonHealth = Integer.parseInt(elements[3]);
            Pokemon pokemon = new Pokemon(pokemonName, element, pokemonHealth);

            if (!hasTrainer(trainers, trainerName)) {
                Trainer trainer = new Trainer(trainerName);
                trainer.add(pokemon);
                trainers.add(trainer);
            } else {
                trainers.get(findIndex(trainers, trainerName)).add(pokemon);
            }
        }
        while(true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            String element = input;
            if (trainers.size() > 0) {
                for (Trainer trainer : trainers) {
                    boolean hasElement = false;
                    for (Pokemon pokemon : trainer.getPokemons()) {
                        if (pokemon.getElement().equals(element)) {
                            hasElement = true;
                            break;
                        }
                    }
                    if (hasElement) {
                        trainer.setBadges(trainer.getBadges() + 1);
                    } else {
                        if (trainer.getPokemons().size() > 0) {
                            int index = trainer.getPokemons().size();
                            for (Pokemon pokemon : trainer.getPokemons()) {
                                pokemon.setHealth(pokemon.getHealth()-10);
                                if (pokemon.getHealth() <= 0) {
                                    trainer.getPokemons().remove(pokemon);
                                    index--;
                                }
                                if (index == 0) {
                                    break;
                                }

                            }

                        }
                    }

                }

            }

        }
        trainers.stream()
                .sorted((t1, t2) -> Integer.compare(t2.getBadges(), t1.getBadges()))
                .forEach(t -> System.out.printf("%s %d %d\n", t.getName(), t.getBadges(), t.getPokemons().size()));



    }
    public static boolean hasTrainer(List<Trainer> trainers, String name) {
        boolean isValid = false;
        for (Trainer trainer : trainers) {
            if (trainer.getName().equals(name)) {
                isValid = true;
                break;
            }

        }
        return isValid;
    }
    public static int findIndex(List<Trainer> trainers, String name) {
        int index = 0;
        for (int i = 0; i < trainers.size(); i++) {
            if (trainers.get(i).getName().equals(name)) {
                index = i;
                break;
            }

        }
        return index;
    }
}
