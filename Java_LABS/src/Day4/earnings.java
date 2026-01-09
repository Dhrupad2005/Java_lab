package Day4;

import java.util.Scanner;

// Interface definition
interface Salary
{
    double earnings();
    double deductions();
    double bonus();
}

// Abstract class Manager using the interface
abstract class Manager implements Salary
{
    double basic;

    Manager(double basic)
    {
        this.basic = basic;
    }

    public double earnings()
    {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    public double deductions()
    {
        return 0.12 * basic;
    }

    // bonus() not implemented here
}

// Substaff class implementing bonus()
class Substaff extends Manager
{
    Substaff(double basic)
    {
        super(basic);
    }

    public double bonus()
    {
        return 0.50 * basic;
    }
}

// Main class (must match file name)
public class earnings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Substaff s = new Substaff(basicSalary);

        System.out.println("Earnings - " + (int)s.earnings());
        System.out.println("Deduction - " + (int)s.deductions());
        System.out.println("Bonus - " + (int)s.bonus());
    }
}

