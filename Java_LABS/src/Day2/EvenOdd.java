package Day2;

import java.util.Scanner;

// Program to count even and odd numbers using Scanner
public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int even = 0, odd = 0;
        int num;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++)
        {
            num = sc.nextInt();

            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Number of even numbers = " + even);
        System.out.println("Number of odd numbers = " + odd);
    }
}
