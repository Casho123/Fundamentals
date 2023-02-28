package OOP.TestingJava;


import java.util.ArrayList;
import java.util.Scanner;


public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int n = input.nextInt();

        // Display factorial
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    /**
     * Return the factorial for the specified number
     */
    public static long factorial(int n) {
        if (n == 0) // Base case
            return 1;
        else
            return n * factorial(n - 1); // Recursive call
    }

}





