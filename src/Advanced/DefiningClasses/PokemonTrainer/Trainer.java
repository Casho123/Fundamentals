package Advanced.DefiningClasses.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int badges = 0;
    private List<Pokemon> pokemons = new ArrayList<>();


    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBadges() {
        return badges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
    public void add(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

}

