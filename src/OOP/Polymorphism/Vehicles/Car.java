package OOP.Polymorphism.Vehicles;

public class Car extends Vehicle{
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
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
