package java_homework_week_6;

/* Write a Java program to print the area and perimeter of a rectangle.
 Test Data:
 Width = 5.5 Height = 8.5
 Expected Output:
 Area is 5.6 * 8.5 = 47.60
 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14 {
    static double W = 5.5;
    static double H = 8.5;

    public static void main(String[] args) {
        Program14 obj = new Program14();
        obj.countarea();
        System.out.println();
        obj.perimeter();
    }

    //instance method calculating the area of given values
    public void countarea() {
        double area = (W + 0.1) * H;
        System.out.printf("Area is " + String.format("%.2f", area));
    }

    //instance method calculating the perimeter of given values
    public void perimeter() {
        double peri = 2 * ((W + 0.1) + H);
        System.out.printf("Perimeter is " + String.format("%.2f", peri));
    }
}
