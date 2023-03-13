package java_homework_week_6;
/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter any Number for it's table up to 10");
        int a = Integer.parseInt(scan.nextLine());
        table(a);
        scan.close();
    }

    // Static method building the tables of inserted user value
    public static void table(int a) {
        int b = (a * 1);
        int c = (a * 2);
        int d = (a * 3);
        int e = (a * 4);
        int f = (a * 5);
        int g = (a * 6);
        int j = (a * 7);
        int k = (a * 8);
        int l = (a * 9);
        int m = (a * 10);
        System.out.println(a + " X 1  = " + b);
        System.out.println(a + " X 2  = " + c);
        System.out.println(a + " X 3  = " + d);
        System.out.println(a + " X 4  = " + e);
        System.out.println(a + " X 5  = " + f);
        System.out.println(a + " X 6  = " + g);
        System.out.println(a + " X 7  = " + j);
        System.out.println(a + " X 8  = " + k);
        System.out.println(a + " X 9  = " + l);
        System.out.println(a + " X 10 = " + m);
    }
}
