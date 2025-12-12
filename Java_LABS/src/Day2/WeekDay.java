package Day2;
import java.util.Scanner;


public class WeekDay {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Day;
        System.out.println("enter your Day:");
        Day=scanner.nextInt();
         // 👉 Input: change this to any number from 1 to 7

        switch(Day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number! Please enter between 1 and 7.");
        }
    }
}

