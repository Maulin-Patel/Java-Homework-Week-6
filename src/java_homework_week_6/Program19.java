package java_homework_week_6;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Program19 {

    public static void main(String[] args) {
        Program19 obj = new Program19();
        obj.lower();
    }

    // Instance method converting pre-defined string into Lowercase

    public void lower() {
        String FOX = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        String fox = FOX.toLowerCase();
        System.out.println(FOX);
        System.out.println("Converted to Lowercase:");
        System.out.println(fox);
    }
}
