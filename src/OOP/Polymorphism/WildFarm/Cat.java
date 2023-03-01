package OOP.Polymorphism.WildFarm;

public class Cat extends Feline {

    private String breed;


    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }
}
