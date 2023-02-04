package OOP.Encapsulation.PizzaCalories;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    public String getFlourType() {
        return flourType;
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    public double getWeight() {
        return weight;
    }

    private void setFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            throw new IllegalArgumentException("Invalid type of dough.");

        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!bakingTechnique.equals("Crispy") && !bakingTechnique.equals("Chewy") && !bakingTechnique.equals("Homemade")) {
            throw  new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double flourModifier = 0;
        double bakingTechModifier = 0;
        if (this.flourType.equals("White")) {
            flourModifier = 1.5;
        } else if(this.flourType.equals("Wholegrain")) {
            flourModifier = 1.0;
        }
        if (this.bakingTechnique.equals("Crispy")) {
            bakingTechModifier = 0.9;
        } else if (this.bakingTechnique.equals("Chewy")) {
            bakingTechModifier = 1.1;
        } else if (this.bakingTechnique.equals("Homemade")) {
            bakingTechModifier = 1.0;
        }
        return flourModifier * bakingTechModifier * this.weight * 2;
    }
}
