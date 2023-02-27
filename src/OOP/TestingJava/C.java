package OOP.TestingJava;


public class C {
    public static void main(String[] args) {
        try {
            int value = 50;
            if (value < 40)
                throw new Exception("value is too small");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block");

    }


}

