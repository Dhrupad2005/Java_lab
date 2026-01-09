package Day2;

import java.util.Scanner;

// Class file: Box
class Box {
    double length;
    double width;
    double height;

    // Method to calculate volume
    double volume() {
        return length * width * height;
    }
}

// Application class: Demo
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create object of Box class
        Box b = new Box();

        // User input
        System.out.print("Enter length: ");
        b.length = sc.nextDouble();

        System.out.print("Enter width: ");
        b.width = sc.nextDouble();

        System.out.print("Enter height: ");
        b.height = sc.nextDouble();

        // Print volume
        System.out.println("Volume = " + b.volume());

        sc.close();
    }
}
