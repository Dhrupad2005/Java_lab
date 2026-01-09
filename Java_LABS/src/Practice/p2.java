package Practice;
import java.util.Scanner;
public class p2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of Subject1:");
        float s1=sc.nextInt();
        System.out.println("Enter Marks of Subject1:");
        float s2=sc.nextInt();
        System.out.println("Enter Marks of Subject1:");
        float s3=sc.nextInt();
        System.out.println("Enter Marks of Subject1:");
        float s4=sc.nextInt();
        System.out.println("Enter Marks of Subject1:");
        float s5=sc.nextInt();
        float percentage= ((s1+s2+s3+s4+s5)*100f)/500;
        System.out.println(percentage);
        System.out.println("Enter Your Name:");
        String Name= sc.next();
        System.out.println(Name);
    }

}
