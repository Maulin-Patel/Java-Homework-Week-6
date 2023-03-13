package java_homework_week_6;

/**
 * Write a Java program to compute the specified expressions and print theoutput.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class Program12 {

    public static void main(String[] args) {
        calc();
    }

    //Static method assigning the double data type value and executing the specified calculation

    public static void calc() {
        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;
        double e = ((a * b - b * b) / (c - d));
        System.out.println(e);
    }
}
