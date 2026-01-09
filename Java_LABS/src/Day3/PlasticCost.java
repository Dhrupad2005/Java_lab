package Day3;
import java.util.Scanner;

class TwoD {
    protected double length;
    protected double breadth;
    protected final int COST_PER_SQFT = 40;

    public void getDimensions(Scanner sc) {
        System.out.print("Enter length (ft): ");
        length = sc.nextDouble();

        System.out.print("Enter breadth (ft): ");
        breadth = sc.nextDouble();
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculateCost() {
        return calculateArea() * COST_PER_SQFT;
    }
}

class ThreeD extends TwoD {
    private double height;
    private final int COST_PER_CUBICFT = 60;

    @Override
    public void getDimensions(Scanner sc) {
        super.getDimensions(sc);
        System.out.print("Enter height (ft): ");
        height = sc.nextDouble();
    }

    public double calculateVolume() {
        return length * breadth * height;
    }

    @Override
    public double calculateCost() {
        return calculateVolume() * COST_PER_CUBICFT;
    }
}

class PlasticCost {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Plastic Type:");
        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            TwoD sheet = new TwoD();
            sheet.getDimensions(sc);

            System.out.println("\nArea of Sheet: " + sheet.calculateArea() + " sq.ft");
            System.out.println("Cost of Plastic Sheet: Rs " + sheet.calculateCost());

        } else if (choice == 2) {
            ThreeD box = new ThreeD();
            box.getDimensions(sc);

            System.out.println("\nVolume of Box: " + box.calculateVolume() + " cubic ft");
            System.out.println("Cost of Plastic Box: Rs " + box.calculateCost());

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
