package java_homework_week_6;
/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit Temperature Value:");
        double a = Double.parseDouble(scan.nextLine());
        celsius(a);
        scan.close();
    }

    // Static method converting fahrenheit value to celsius
    public static void celsius(double a) {
        double b = ((a - 32) * 5 / 9);
        System.out.println("The Celsius Temperature Value is: " + b);
    }
}
