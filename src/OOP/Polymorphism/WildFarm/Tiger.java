package OOP.Polymorphism.WildFarm;

public class Tiger extends Feline {

    public Tiger(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.println("Tigers are not eating that type of food!");
        } else {
            super.setFoodEaten(food.getQuantity() + super.getFoodEaten());
        }
    }
}
