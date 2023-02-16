package OOP.Polymorphism.Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;

    protected Vehicle(double fuelQuantity, double fuelConsumption) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
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
    public void refuel(double fuel) {
        this.fuelQuantity+= fuel;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(),this.fuelQuantity);
    }

}
