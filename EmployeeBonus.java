/*
Name: FRANCIS NJOROGE IBABU 
Reg No: CT101/G/19667/23
Date: 23/01/2025
Calculation of employee bonus
Assignment 2
*/
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double bonus = 0;
        if (years > 10) {
            bonus = 0.12;
        } else if (years >= 6) {
            bonus = 0.1;
        } else if (years > 0) {
            bonus = 0.08;
        } else {
            System.out.println("Invalid Input");
        }

        double netBonus = salary * bonus;
        System.out.println("Your net bonus is: " + netBonus);

        scanner.close();
    }
}