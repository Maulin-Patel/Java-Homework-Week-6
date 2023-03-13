package java_homework_week_6;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme
 */
public class Program1 {

    int a = 20;
    int b = 30;

    // Main method calling Instance Method
    public static void main(String[] args) {
        Program1 obj1 = new Program1();
        obj1.addition();

    }

    // Creation of Instance Method calling both instance variables
    public void addition() {
        Program1 obj = new Program1();
        System.out.println(a + b);
    }
}
