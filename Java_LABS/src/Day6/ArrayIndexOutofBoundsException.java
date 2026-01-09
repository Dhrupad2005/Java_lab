package Day6;


import java.util.Scanner;

public class ArrayIndexOutofBoundsException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        System.out.println("Enter the numbers (5 numbers for array of size 4):");
        try {
            for (int i = 0; i <= 4; i++) {  // intentionally goes out of bounds
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: " + e);
        }

        sc.close();
    }
}