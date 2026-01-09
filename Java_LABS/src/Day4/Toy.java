package Day4;
import java.util.Scanner;

public class Toy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NUMBER OF TOYS: ");
        int n = sc.nextInt();

        int amt = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("ENTER TOY " + (i + 1) + " ID: ");
            int id = sc.nextInt();
            System.out.println("ENTER TOY " + (i + 1) + " NAME: ");
            String name = sc.next();
            System.out.println("ENTER TOY " + (i + 1) + " PRICE: ");
            int price = sc.nextInt();
            System.out.println("ENTER TOY " + (i + 1) + " QUANTITY: ");
            int qty = sc.nextInt();

            int totalPrice = price * qty;
            amt += totalPrice;

            System.out.println("DETAILS OF ALL TOYS:");
            System.out.println("TOY " + (i + 1) + " ID: " + id);
            System.out.println("TOY " + (i + 1) + " NAME: " + name);
            System.out.println("TOY " + (i + 1) + " PRICE: " + price);
            System.out.println("TOY " + (i + 1) + " QUANTITY: " + qty);
            System.out.println("TOTAL PRICE OF TOY " + (i + 1) + ": " + totalPrice);
        }

        System.out.println("TOTAL BILLING AMOUNT: " +amt);
    }
}
