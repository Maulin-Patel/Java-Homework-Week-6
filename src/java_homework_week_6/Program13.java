package java_homework_week_6;

import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The First Number:");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Please Enter The Second Number:");
        int b = Integer.parseInt(scan.nextLine());
        System.out.println("Please Enter The Second Number:");
        int c = Integer.parseInt(scan.nextLine());
        average(a, b, c);
        scan.close();
    }

    //static method calculating the average of inserted numbers
    public static void average(int a, int b, int c) {
        int d = (a + b + c) / 3;
        System.out.println("The Average of given numbers is: " + d);
    }
}
