//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the max capacity in the garage");
        int maxCapacity = scanner.nextInt();
        scanner.nextLine();
        String[][][] jobs = new String[maxCapacity][2][4];
        String vehicleString;
        for(int i = 0; i < maxCapacity; i++){
            System.out.println("Enter the mechanic name");
            String mechanicName = scanner.nextLine();
            jobs[i][0][0] = mechanicName;
            for (int j = 0; j < 1; j++){
                System.out.println("Enter 1 for motorbyke or 0 for car");
                String vehicleType = scanner.nextLine();
                System.out.println("Enter the brand");
                String vehicleBrand = scanner.nextLine();
                System.out.println("Enter the model");
                String vehicleModel = scanner.nextLine();
                System.out.println("Enter the year");
                String vehicleYear = scanner.nextLine();
                System.out.println("Enter the status");
                String vehicleStatus = scanner.nextLine();
                jobs[i][1][0] = vehicleBrand;
                jobs[i][1][1] = vehicleModel;
                jobs[i][1][2] = vehicleYear;
                jobs[i][1][3] = vehicleStatus;
            }
        }
        for (int i = 0; i < jobs.length; i++) {
            for (int j = 0; j < jobs[i][0].length; j++) {
                if (jobs[i][0][j] != null) {
                    System.out.println("Mechanic: " + jobs[i][0][j]);
                    if (jobs[i][1][0] != null) {
                        System.out.println("Vehicle brand: " + jobs[i][1][0]);
                    }
                    if (jobs[i][1][1] != null) {
                        System.out.println("Vehicle model: " + jobs[i][1][1]);
                    }
                    if (jobs[i][1][2] != null) {
                        System.out.println("Vehicle year: " + jobs[i][1][2]);
                    }
                    if (jobs[i][1][3] != null) {
                        System.out.println("Vehicle status: " + jobs[i][1][3]);
                    }
                }
            }
        }
    }
}