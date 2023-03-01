package OOP.Polymorphism.WildFarm;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Meat) {
            System.out.println("Zebras are not eating that type of food!");
        } else {
            this.setFoodEaten(food.getQuantity() + this.getFoodEaten());
        }

    }
}
