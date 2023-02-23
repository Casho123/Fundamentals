package OOP.TestingJava;

public class C {
    public static void main(String[] args) {

       Apple apple = new Apple();
       Apple apple2 = apple;

        System.out.println(apple == apple2);
        System.out.println(apple.equals(apple2));
    }
}

