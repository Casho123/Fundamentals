package OOP.Polymorphism.Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;

    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
        setTankCapacity(tankCapacity);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }


    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public String drive(double km) {
        double fuelNeeded = this.fuelConsumption * km;
        String result = "needs refueling";
        DecimalFormat df = new DecimalFormat("#.##");
        if (this.fuelQuantity >= fuelNeeded) {
            this.fuelQuantity -= fuelNeeded;
            result = String.format("travelled %s km", df.format(km));
        }
        return result;
    }
    protected void refuel(double quantity) {
        if (quantity <= 0) {
            throw  new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.fuelQuantity + quantity > this.tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += quantity;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(),this.fuelQuantity);
    }

}
