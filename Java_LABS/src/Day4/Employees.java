package Day4;

import java.util.Scanner;

// Base interface
interface Employee
{
    void getDetails();
}

// Derived interface
interface DeptManager extends Employee
{
    void getDeptDetails();
}

// Class implementing derived interface
public class Employees implements DeptManager
{
    int empId;
    String empName;
    int deptId;
    String deptName;

    Scanner sc = new Scanner(System.in);

    public void getDetails()
    {
        System.out.print("Enter employee id - ");
        empId = sc.nextInt();
        sc.nextLine();   // consume newline

        System.out.print("Enter employee name - ");
        empName = sc.nextLine();
    }

    public void getDeptDetails()
    {
        System.out.print("Enter department id - ");
        deptId = sc.nextInt();
        sc.nextLine();   // consume newline

        System.out.print("Enter department name - ");
        deptName = sc.nextLine();
    }

    public void display()
    {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }

    public static void main(String[] args)
    {
        Employees h = new Employees();

        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}

