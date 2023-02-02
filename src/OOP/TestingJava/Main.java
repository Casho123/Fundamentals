package OOP.TestingJava;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1();
        System.out.println(date.getTime());
    }
    public static void m1() {
        Date date = null;
    }
}