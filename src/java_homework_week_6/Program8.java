package java_homework_week_6;

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Base Value of Triangle:");
        double a = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the Height Value of Triangle:");
        double b = Double.parseDouble(scan.nextLine());
        Program8 obj = new Program8();
        obj.area(a, b);
        scan.close();
    }

    // Instance method calculating the Area of triangle
    public void area(double a, double b) {
        double c = ((a * b) / 2);
        System.out.println("The Area of the Triangle is " + c);
    }

}
