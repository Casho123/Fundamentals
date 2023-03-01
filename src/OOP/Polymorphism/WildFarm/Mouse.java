package OOP.Polymorphism.WildFarm;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Meat) {
            System.out.println("Mice are not eating that type of food!");
        } else {
            this.setFoodEaten(food.getQuantity() + this.getFoodEaten());
        }
    }
}
