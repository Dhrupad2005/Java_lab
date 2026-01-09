package Day3;
import java.util.Scanner;


class Plate {
    protected double length;
    protected double width;

    Plate(Scanner sc) {
        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter width: ");
        width = sc.nextDouble();

        System.out.println("Plate constructor executed.");
    }

    public void display() {
        System.out.println("Plate Dimensions -> Length: " + length + ", Width: " + width);
    }
}

class Box extends Plate {
    protected double height;

    Box(Scanner sc) {
        super(sc);

        System.out.print("Enter height: ");
        height = sc.nextDouble();

        System.out.println("Box constructor executed.");
    }

    public void display() {
        super.display();
        System.out.println("Box Dimensions -> Height: " + height);
    }
}


class WoodBox extends Box {
    private double thickness;

    WoodBox(Scanner sc) {
        super(sc);

        System.out.print("Enter thickness: ");
        thickness = sc.nextDouble();

        System.out.println("WoodBox constructor executed.");
    }

    public void display() {
        super.display();
        System.out.println("WoodBox Dimensions -> Thickness: " + thickness);
    }
}


public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for WoodBox:");
        WoodBox wb = new WoodBox(sc);

        System.out.println("\nDisplaying All Dimensions:");
        wb.display();

        sc.close();
    }
}