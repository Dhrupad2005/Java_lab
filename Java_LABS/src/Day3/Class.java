package Day3;
import java.util.Scanner;
class Account {
    protected int acc_no;
    protected double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}


class Person extends Account {
    private String name;
    private String aadhar_no;

    // Input method for person (name + aadhar + account)
    void input(Scanner sc) {
        sc.nextLine();  // consume leftover newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();


        super.input(sc);
    }


    @Override
    void disp() {
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);

        super.disp();
    }
}


public class Class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Person[] persons = new Person[3];

        System.out.println("Enter details of three persons:\n");


        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(sc);
            System.out.println();
        }


        System.out.println("\nDisplaying Details of Three Persons:");
        for (int i = 0; i < 3; i++) {
            persons[i].disp();
        }

        sc.close();
    }
}