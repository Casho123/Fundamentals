package OOP.Polymorphism.WildFarm;

public abstract class Animal {

    private String animalName;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalName, Double animalWeight) {
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public String getAnimalName() {
        return animalName;
    }


    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public abstract void eat(Food food);

    public abstract void makeSound();

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }
}
