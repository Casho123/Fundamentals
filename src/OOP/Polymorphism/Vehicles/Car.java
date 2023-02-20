package OOP.Polymorphism.Vehicles;

public class Car extends Vehicle{

    protected Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption+0.9);
    }

    @Override
    public String drive(double km) {
        return String.format("Car %s", super.drive(km));
    }
}
