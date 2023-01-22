package Advanced.DefiningClasses.CatLady;

public class StreetExtraordinaire extends Cat {

    private double decibelsOfMeows;


    public StreetExtraordinaire(String name, double decibelsOfMeows) {
        super(name);
        this.decibelsOfMeows = decibelsOfMeows;
    }

    public double getDecibelsOfMeows() {
        return decibelsOfMeows;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", StreetExtraordinaire.class.getSimpleName(), super.getName(), this.decibelsOfMeows);
    }
}
