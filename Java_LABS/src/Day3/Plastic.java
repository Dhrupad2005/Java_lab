package Day3;
import java.util.Scanner;
public class Plastic {

  // 2D-Sheet
    static class Plastic2D {
        double length, width;
        final double COST_PER_SQFT = 40;

        Plastic2D(double l, double w) {
            length = l;
            width = w;
        }

        double area() {
            return length * width;
        }

        double cost() {
            return area() * COST_PER_SQFT;
        }
    }

    // 3D Box class from Plastic2D
    static class Plastic3D extends Plastic2D {
        double height;
        final double COST_PER_CUFT = 60;

        Plastic3D(double l, double w, double h) {
            super(l, w);
            height = h;
        }

        double volume() {
            return length * width * height;
        }

        double cost() {
            return volume() * COST_PER_CUFT;
        }
    }

    public static class PlasticDemo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter length and width for 2D sheet:");
            double l = sc.nextDouble();
            double w = sc.nextDouble();

            Plastic2D sheet = new Plastic2D(l, w);
            System.out.println("Cost of 2D Sheet: Rs " + sheet.cost());

            System.out.println("\nEnter length, width and height for 3D box:");
            l = sc.nextDouble();
            w = sc.nextDouble();
            double h = sc.nextDouble();

            Plastic3D box = new Plastic3D(l, w, h);
            System.out.println("Cost of 3D Box: Rs " + box.cost());
        }
    }
}


