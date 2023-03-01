package OOP.Polymorphism.WildFarm;

public abstract class Animal {

    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;


    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }
    protected void makeSound() {

    }

    protected void eatFood(Food food) {
        this.foodEaten += food.getQuantity();

    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }
}
