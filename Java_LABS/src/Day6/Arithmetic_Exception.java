package Day6;

public class Arithmetic_Exception {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
            System.out.println("Trying division: " + a + " / " + b);
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}