package OOP.Encapsulation.PizzaCalories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {


    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    public String getName() {
        return name;
    }

    public Dough getDough() {
        return dough;
    }

    public List<Topping> getToppings() {
        return Collections.unmodifiableList(this.toppings);
    }

    private void setName(String name) {
        if (name == null || (name.length() < 1  || name.length() > 15)) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings > 10 || numberOfToppings < 0) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(numberOfToppings);
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        double totalCalories = 0;
        totalCalories += this.dough.calculateCalories();
        for (Topping topping : this.toppings) {
            totalCalories += topping.calculateCalories();
        }
        return totalCalories;
    }
}
