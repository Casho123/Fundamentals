package Advanced.DefiningClasses.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerKm;
    private int distanceTravelled = 0;

    public Car(String model, double fuelAmount, double fuelCostPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCostPerKm() {
        return fuelCostPerKm;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
    public void drive(int distance) {
        double neededFuel = this.fuelCostPerKm * distance;
        if (neededFuel > this.fuelAmount) {
            System.out.println("Insufficient fuel for the drive");
        } else {
            this.fuelAmount -= neededFuel;
            this.distanceTravelled += distance;

        }

    }
}
