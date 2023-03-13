package java_homework_week_6;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {

    static int a = 5;
    int b = 10;

    //Main method calling both static and instance methods
    public static void main(String[] args) {
        Program3 obj2 = new Program3();
        obj2.multiplication();
        addition();
    }

    // Declaration of Instance Method calling & multiplying both instance and static variables

    public void multiplication() {
        Program3 obj = new Program3();
        System.out.println(a * b);
    }

    // Declaration of static method calling & adding both instance and static variables
    public static void addition() {
        Program3 obj1 = new Program3();
        System.out.println(a + obj1.b);
    }
}
