package Day2;

class Subtract {

    // subtract two integers
    void subtract(int a, int b) {
        System.out.println("Subtraction of two integers: " + (a - b));
    }

    // subtract three integers
    void subtract(int a, int b, int c) {
        System.out.println("Subtraction of three integers: " + (a - b - c));
    }

    // subtract two double values
    void subtract(double a, double b) {
        System.out.println("Subtraction of two doubles: " + (a - b));
    }
}

// Driver class
public class sub {
    public static void main(String[] args) {

        Subtract obj = new Subtract();

        // Calling overloaded subtract methods
        obj.subtract(20, 10);
        obj.subtract(50, 20, 10);
        obj.subtract(25.5, 10.2);
    }
}

