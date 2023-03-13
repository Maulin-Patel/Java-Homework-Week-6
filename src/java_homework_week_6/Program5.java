package java_homework_week_6;
/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The First Number:");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Please Enter The Second Number:");
        int b = Integer.parseInt(scan.nextLine());
        addition(a, b);
        subtraction(a, b);
        Program5 obj = new Program5();
        obj.multiply(a, b);
        obj.division(a, b);
        scan.close();
    }

    // Static method for addition of numbers
    public static void addition(int a, int b) {

        int add = a + b;
        System.out.println("The Addition of two number is: " + add);
    }

    //Static method for subtraction of numbers
    public static void subtraction(int a, int b) {

        int sub = a - b;
        System.out.println("The Subtraction of two number is: " + sub);
    }

    // Instance method for multiplication of the numbers
    public void multiply(int a, int b) {
        int mul = a * b;
        System.out.println("The Multiplication of two numbers is: " + mul);
    }

    // Instance method for division of numbers
    public void division(int a, int b) {
        int div = a / b;
        System.out.println("The Division of two numbers is: " + div);
    }
}