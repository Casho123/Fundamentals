package Advanced.DefiningClasses.SpeedRacing;

public class Car {
    private String model;
    private int fuelAmount;
    private double fuelCostPerKm;
    private int distanceTravelled;

    public Car(String model, int fuelAmount, double fuelCostPerKm, int distanceTravelled) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
        this.distanceTravelled = distanceTravelled;
    }

    public String getModel() {
        return model;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCostPerKm() {
        return fuelCostPerKm;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
