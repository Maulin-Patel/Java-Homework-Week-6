package java_homework_week_6;

/**Write a Java program to swap two variables.
 */
public class Program15 {

    public static void main(String[] args) {
        swap();
    }

    //Static method creation first assigning two variables then using logic swapping them
    public static void swap(){

            int a = 50, b = 100;

            System.out.println("Original Values");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            int swap = a;
            a = b;
            b = swap;

            System.out.println("Swapped Values");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

