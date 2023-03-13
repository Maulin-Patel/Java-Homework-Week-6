package java_homework_week_6;

/**
 * Write a program to convert the upper case to lower case
 */

import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any Uppercase Character");
        char c = scan.next().charAt(0);
        scan.close();
        low(c);
    }

    // Static method storing the character value to a string and then converting it to lowercase
    public static void low(char c) {
        String d = "" + c;
        System.out.println("The Lowercase Character is " + d.toLowerCase());
    }
}
