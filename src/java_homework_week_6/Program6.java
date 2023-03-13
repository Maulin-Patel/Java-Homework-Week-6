package java_homework_week_6;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Radius Value:");
        double a = Double.parseDouble(scan.nextLine());
        radius(a);
        scan.close();

    }
// static method calculating radius of inserted number
    public static void radius(double a) {

        double b = (3.14 * a * a);
        System.out.print("The Area of entered radius = " + b);
    }
}
