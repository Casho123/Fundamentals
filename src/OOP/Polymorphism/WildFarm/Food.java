package OOP.Polymorphism.WildFarm;

public abstract class Food {

    private Integer quantity;

    protected Food(Integer quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
