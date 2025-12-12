package Day2;
import java.util.Scanner;

public class grade {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int marks;
        System.out.println("enter your marks:");
        marks=scanner.nextInt();
        if(marks>=91){
            System.out.println("Grade: o");
        }
        else if (marks>=81) {
            System.out.println("Grade : E");
        } else if (marks>=71){
            System.out.println("Grade : A");
        }
        else if (marks>61){
            System.out.println("Grade : B");
        }
        else if (marks>51){
            System.out.println("Grade : a");
        }
        else {
            System.out.println("Grade : Fail");
        }
scanner.close();
    }
}
