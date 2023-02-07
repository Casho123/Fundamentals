package OOP.Inheritance.NeedForSpeed;

public class RaceMotorcycle extends MotorCycle{

    private static final double DEFAULT_FUEL_CONSUMPTION = 8;


    public RaceMotorcycle(double fuelConsumption, int horsePower) {
        super(fuelConsumption, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
