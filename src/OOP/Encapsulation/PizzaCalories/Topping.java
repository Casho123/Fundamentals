package OOP.Encapsulation.PizzaCalories;

public class Topping {

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    public String getToppingType() {
        return toppingType;
    }

    public double getWeight() {
        return weight;
    }

    private void setToppingType(String toppingType) {
        if (!toppingType.equals("Meat") && !toppingType.equals("Veggies") && !toppingType.equals("Cheese") && !toppingType.equals("Sauce")) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double calories = 0;
        if (this.toppingType.equals("Meat")) {
            calories = 2 * this.weight * 1.2;
        } else if (this.toppingType.equals("Veggies")) {
            calories = 2 * this.weight * 0.8;
        } else if (this.toppingType.equals("Cheese")) {
            calories = 2 * this.weight * 1.1;
        } else if (this.toppingType.equals("Sauce")) {
            calories = 2 * this.weight * 0.9;
        }
        return calories;
    }
}

