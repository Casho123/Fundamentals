package OOP.TestingJava;


import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class C {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2013, 2, 1);
        Calendar calendar1 = calendar;
        Calendar calendar2 = (Calendar)calendar.clone();
        System.out.println("calendar == calendar1 is " +
                (calendar == calendar1));
        System.out.println("calendar == calendar2 is " +
                (calendar == calendar2));
        System.out.println("calendar.equals(calendar2) is " +
                calendar.equals(calendar2));


    }

}





