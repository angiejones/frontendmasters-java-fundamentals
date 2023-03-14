package loops;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        double rate = 15;
        double maxHours = 40;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 0) {
            System.out.println("Invalid entry. Your hours must be between 0 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.println("Gross pay: " + grossPay);
    }
}