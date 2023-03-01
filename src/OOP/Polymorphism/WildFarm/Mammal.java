package OOP.Polymorphism.WildFarm;

public abstract class Mammal extends Animal{

    private String livingRegion;

    public Mammal(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight);
        this.livingRegion = livingRegion;
    }


    public String getLivingRegion() {
        return livingRegion;
    }
}
