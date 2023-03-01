package OOP.TestingJava;


public class C {
    public static void main(String[] args) {
         Integer[] integers = {1, 2, 3, 4, 5};
         String[] strings = {"London", "Paris", "New York", "Austin"};
        C.<Integer>print(integers);
        C.print(strings);
        }

          public static <E> void print(E[] list) {
         for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
        }
}





