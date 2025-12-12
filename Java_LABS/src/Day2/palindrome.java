package Day2;

import java.util.Scanner;
public class palindrome {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();

        int org=n;
        int rev=0;

        while(n>0)
        {
            int dig=n%10;
            rev= rev*10+dig;
            n=n/10;
        }
        if(rev==org)
        {
            System.out.println("PALINDROME");
        }
        else
        {
            System.out.println("NOT A PALINDROME");
        }
    }
}
