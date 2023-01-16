package Advanced.SetsAndMapsAdvanced.SrpskoUnleashed;

import java.util.Scanner;

public class SrpskoUnleashed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            String input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            if (input.contains(" @")) {
                String[] elements = input.split(" @");
                String singer = elements[0];


            }

        }

    }
}
