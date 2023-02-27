package OOP.TestingJava;


import java.util.Calendar;
import java.util.Date;

public class C {
    public static void main(String[] args) {

        Date n = new Date(2013, Calendar.APRIL,1);

        System.out.println(n instanceof Date);
        System.out.println(n instanceof Object);
        System.out.println(n instanceof Comparable<?>);
        String date = "sas";


    }

}





