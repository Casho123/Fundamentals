package OOP.Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(";");
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String[] arr = input[i].split("=");
            String name = arr[0];
            double money = Double.parseDouble(arr[1]);
            Person person = new Person(name, money);
            people.add(person);
        }
        String[] productArr = scan.nextLine().split(";");
        for (int i = 0; i < productArr.length; i++) {
            String[] arr = productArr[i].split("=");
            String name = arr[0];
            double cost = Double.parseDouble(arr[1]);
            Product product = new Product(name, cost);
            products.add(product);
        }
        while (true) {
            String current = scan.nextLine();
            if (current.equals("END")) {
                break;
            }
            String[] arr = current.split("\\s+");
            String personName = arr[0];
            String productName = arr[1];
            Person person = findPerson(people, personName);
            Product product = findProduct(products, productName);
            person.buyProduct(product);
        }
        for (Person person : people) {
            System.out.printf("%s - ", person.getName());
            if (person.getProducts().size() > 0) {
                for (int i = 0; i < person.getProducts().size(); i++) {
                    if (i < person.getProducts().size()-1) {
                        System.out.printf("%s, ", person.getProducts().get(i).getName());
                    } else {
                        System.out.printf("%s", person.getProducts().get(i).getName());
                    }
                }
            } else {
                System.out.print("Nothing bought");
            }
            System.out.println();
        }






    }
    public static Person findPerson(List<Person> people, String name) {
        Person person = null;
        for (Person person1 : people) {
            if (person1.getName().equals(name)) {
                person = person1;
                break;
            }
        }
        return person;

    }
    public static Product findProduct(List<Product> products, String name) {
        Product product = null;
        for (Product product1 : products) {
            if (product1.getName().equals(name)) {
                product = product1;
            }

        }
        return product;

    }
}
