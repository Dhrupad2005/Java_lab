package Day2;

import java.util.Scanner;

class RectOverload {
    double length;
    double breadth;

    // Default constructor
    RectOverload() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    RectOverload(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    double area() {
        return length * breadth;
    }
}

public class overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        RectOverload r1 = new RectOverload();
        System.out.println("Area using default constructor = " + r1.area());

        // User input
        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        // Using parameterized constructor
        RectOverload r2 = new RectOverload(l, b);
        System.out.println("Area using parameterized constructor = " + r2.area());

        sc.close();
    }
}
