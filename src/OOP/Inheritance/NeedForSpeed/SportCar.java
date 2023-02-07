package OOP.Inheritance.NeedForSpeed;

public class SportCar extends Car{

    private static final double DEFAULT_FUEL_CONSUMPTION = 10;

    public SportCar(double fuelConsumption, int horsePower) {
        super(fuelConsumption, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
