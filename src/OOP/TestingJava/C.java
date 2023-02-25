package OOP.TestingJava;

import java.util.ArrayList;
import java.util.Arrays;

public class C {
    public static void main(String[] args) {


    }

    public class A {

       protected int i;


       protected void m() {

        }
    }
    public class B extends A {
        public void m1(String[] args) {
            System.out.println(i);
            m();
        }
    }

}

