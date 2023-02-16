package OOP.Polymorphism.Vehicles;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption+1.6);
    }

    @Override
    public String drive(double km) {
        return "Truck " + super.drive(km);
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel * 0.95);
    }
}
