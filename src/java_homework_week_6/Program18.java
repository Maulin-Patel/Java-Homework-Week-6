package java_homework_week_6;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 */
public class Program18 {

    static int a = 125;
    static int b = 24;

    public static void main(String[] args) {
        calculation(a, b);
    }

    //Static method doing the required calculations and displaying the results

    public static void calculation(int a, int b) {
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println("125 + 24 = " + c);
        System.out.println("125 - 24 = " + d);
        System.out.println("125 * 24 = " + e);
        System.out.println("125 / 24 = " + f);
        System.out.println("125 mod 24 = " + g);
    }
}
