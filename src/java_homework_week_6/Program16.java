package java_homework_week_6;
/**
 * Write a Java program to add two binary numbers.
 */

import java.util.Scanner;

import static java.lang.System.in;

public class Program16 {

    static long binary1, binary2;
    static long[] sum = new long[20];
    static int i = 0;
    static int remainder = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.print("Enter First Binary Value: ");
        binary1 = scan.nextLong();
        System.out.print("Enter Second Binary Value: ");
        binary2 = scan.nextLong();
        scan.close();
        addition();
    }

    // Static method including the logic to add both inserted binary numbers

    public static void addition() {
        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0)
            sum[i++] = remainder;
        --i;
        System.out.println("The Addition of inserted Binary values is: ");
        while (i >= 0)
            System.out.print(sum[i--]);
    }
}

