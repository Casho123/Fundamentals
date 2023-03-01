package OOP.Polymorphism.WildFarm;

public class Tiger extends Feline {

    private String livingRegion;

    @Override
    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Vegetable) {
            System.out.println("Tigers are not eating that type of food!");
        } else {
            this.setFoodEaten(food.getQuantity());
        }
    }
}
