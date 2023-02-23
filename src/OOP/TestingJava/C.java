package OOP.TestingJava;

public class C {
    public static void main(String[] args) {

        Circle circle = new Circle();
        GeometricObject object = new GeometricObject();


        System.out.println(circle instanceof GeometricObject);
        System.out.println(object instanceof GeometricObject);
        System.out.println(circle instanceof Circle);
        System.out.println(object instanceof Circle);


    }
}

