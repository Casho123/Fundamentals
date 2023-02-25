package OOP.TestingJava;

import java.util.ArrayList;

public class C {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Denver");
        list.add("Austin");
        list.add(new java.util.Date());
        String city = list.get(0);
        list.set(3, "Dallas");
        System.out.println(list.get(3));
    }
}

