package OOP.Polymorphism.WildFarm;

import java.text.DecimalFormat;

public class Cat extends Feline {

    private String breed;

    public Cat(String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return this.getClass().getSimpleName() + "[" + this.getAnimalName() + ", " + this.getBreed() + ", " +  df.format(this.getAnimalWeight())
                + ", " + this.getLivingRegion() + ", " + (this.getFoodEaten()) + "]";
    }
}
