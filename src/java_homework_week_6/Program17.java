package java_homework_week_6;

/**
 * Write a Java program to convert a decimal number to binary number.
 */

import java.util.Scanner;

public class Program17 {
    static int a;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input any number: ");
        int a = Integer.parseInt(scan.nextLine());
        scan.close();
        Program17 obj = new Program17();
        obj.binary(a);
    }

    //Instance method converting the inserted value to binary and representing in string
    public void binary(int a) {
        String bin = Integer.toBinaryString(a);
        System.out.println("The Binary value for inserted number is: " + bin);
    }
}
