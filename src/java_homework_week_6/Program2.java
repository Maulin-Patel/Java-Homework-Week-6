package java_homework_week_6;

/**
 * Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the program
 */
public class Program2 {
    // Declaration of static variables
    static int a = 40;
    static int b = 10;

    // Main method calling static method
    public static void main(String[] args) {
        division();

    }
    //Declaration of Static Method calling both static variables

    public static void division() {

        System.out.println(a / b);
    }
}
