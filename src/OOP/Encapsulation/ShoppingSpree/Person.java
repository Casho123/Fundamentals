package OOP.Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<Product> products = new ArrayList<>();

    public Person(String name, double money) {
        setName(name);
        setMoney(money);

    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    private void setName(String name) {
        if (name == null || name.trim().equals("")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (product.getCost() <= this.money) {
            products.add(product);
            System.out.printf("%s bought %s\n", this.name, product.getName());
            this.money -= product.getCost();
        } else {
            System.out.printf("%s can't afford %s\n", this.name, product.getName());

        }
    }
}
