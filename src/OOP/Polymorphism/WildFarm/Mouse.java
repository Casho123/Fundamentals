package OOP.Polymorphism.WildFarm;

public class Mouse extends Mammal {

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Meat) {
            System.out.println("Mice are not eating that type of food!");
        } else {
            this.setFoodEaten(food.getQuantity());
        }
    }
}
