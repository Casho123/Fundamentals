package OOP.Inheritance.NeedForSpeed;

public class Car extends Vehicle{

    private final static double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuelConsumption, int horsePower) {
        super(fuelConsumption, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
