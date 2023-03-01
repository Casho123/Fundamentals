package OOP.Polymorphism.WildFarm;

public class Zebra extends Mammal {


    public Zebra(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Zebras are not eating that type of food!");
        } else {
            super.setFoodEaten(food.getQuantity() + super.getFoodEaten());
        }

    }
}
