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
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateCalories() {
        return 0;
    }
}

