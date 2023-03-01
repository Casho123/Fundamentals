package OOP.Polymorphism.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{

    private String livingRegion;

    public Mammal(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight);
        this.livingRegion = livingRegion;
    }


    public String getLivingRegion() {
        return livingRegion;
    }
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return this.getClass().getSimpleName() + "[" + this.getAnimalName() +  ", " +  df.format(this.getAnimalWeight())
                + ", " + this.getLivingRegion() + ", " + (this.getFoodEaten()) + "]";
    }
}
