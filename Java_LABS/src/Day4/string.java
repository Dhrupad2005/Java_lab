package Day4;
import java.util.Scanner;
public class string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String:");
        String St1= sc.nextLine();
        System.out.println("Enter Second String:");
        String St2=sc.nextLine();

        System.out.println("Enter First Sub-String:");
        String Sub1=sc.nextLine();

        System.out.println("Enter Second Sub-String:");
        String Sub2=sc.nextLine();

        if(St1.contains(Sub1) || St2.contains(Sub2)){
            System.out.println("SubString Found in String");
            System.out.println(("String:"+Sub1+" "+Sub2));
        }
        else{
            System.out.println("Substring Not Found");

        }
    }
}
