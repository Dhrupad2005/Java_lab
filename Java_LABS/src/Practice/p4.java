package Practice;
//import java.util.Scanner;
//public class p4 {
    //public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        //System.out.println("Enter age:");
        //int age=sc.nextInt();
        //if(age>21) {
            //System.out.println("Drinking is allowed");
        //} else if (age>18) {
          //  System.out.println("Advisable not to Drink");
        //} else {
          //  System.out.println("no drinking ");
        //}
    //}
//}

import java.time.Year;
import java.util.Scanner;
/*
public class p4{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        int year= sc.nextInt();
        if(year%400==0||(year%4==0 && year%100!=0)){
            System.out.println("This is a LeapYear");
        }else{
            System.out.println("This isn't a Leap Year");
        }

    }
}
*/

public class p4 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        age = sc.nextInt();
        switch (age) {
            case (18):
                System.out.println("Adult");
                break;
            case (21):
                System.out.println("You are eligible to drink");
                break;
            case 25:
                System.out.println("You need to Find a job!!! ASAP");
                break;
            case 60:
                System.out.println("Retirement");
                break;
            case 80:
                System.out.println("Die you old Mf!!");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}