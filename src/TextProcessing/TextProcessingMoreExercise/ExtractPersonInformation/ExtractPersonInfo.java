package TextProcessing.TextProcessingMoreExercise.ExtractPersonInformation;

import java.util.Scanner;

public class ExtractPersonInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String current = scan.nextLine();

            int namePos1 = current.indexOf("@") + 1;
            int namePos2 = current.indexOf("|");
            String name = current.substring(namePos1, namePos2);

            int agePos1  = current.indexOf("#")+1;
            int agePos2  = current.indexOf("*");
            String age = current.substring(agePos1, agePos2);
            System.out.printf("%s is %s years old.\n", name, age);

        }

    }
}
