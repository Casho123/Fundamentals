package Problem9;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalMoney = Double.parseDouble(scan.nextLine());
        int numberOfStudents = Integer.parseInt(scan.nextLine());
        double pricePerSaber = Double.parseDouble(scan.nextLine());
        double pricePerRobe = Double.parseDouble(scan.nextLine());
        double pricePerBelt = Double.parseDouble(scan.nextLine());

        double totalLightSabres = Math.ceil(numberOfStudents * 1.1);

        double totalSaberCost = totalLightSabres * pricePerSaber;
        double totalRobePrice = pricePerRobe * numberOfStudents;
        double totalBeltPrice = 0;
        for (int i = 1; i <= numberOfStudents ; i++) {
            if (i% 6 != 0) {
                totalBeltPrice+= pricePerBelt;
            }
        }
        double neededMoney = totalBeltPrice + totalRobePrice + totalSaberCost;

        if (totalMoney >= neededMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", neededMoney - totalMoney);
        }


    }
}
