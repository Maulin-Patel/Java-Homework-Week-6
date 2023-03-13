package java_homework_week_6;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program4 {

    static int a = 10;
    static int b = 20;
    int c = 30;
    int d = 40;

    // Main method calling both static and instance method
    public static void main(String[] args) {
        Program4 obj2 = new Program4();
        obj2.addition();
        multiplication();
    }

    // declaration of instance method calling and adding all four variables

    public void addition() {

        Program4 obj = new Program4();
        System.out.println(a + b + obj.c + obj.d);
    }

    // declaration of static method calling and multiplying all four variables

    public static void multiplication() {
        Program4 obj1 = new Program4();
        System.out.println(a * b * obj1.c * obj1.d);
    }
}
