package OOP.Polymorphism.WildFarm;

public class Zebra extends Mammal {

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Meat) {
            System.out.println("Zebras are not eating that type of food!");
        } else {
            this.setFoodEaten(food.getQuantity());
        }

    }
}
