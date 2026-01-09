package DAY5;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            System.out.println("Choose an operation:");
            System.out.println("1. Change Case");
            System.out.println("2. Reverse String");
            System.out.println("3. Compare Two Strings");
            System.out.println("4. Insert One String into Another");
            System.out.println("5. Convert to Upper and Lower Case");
            System.out.println("6. Check Character Position");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Count Words, Vowels and Consonants");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------------------");
            switch (choice) {
                case 1:
                    System.out.print("Enter a String: ");
                    String str1 = sc.nextLine();
                    System.out.println("Changed Case: " + str1.toUpperCase());
                    break;

                case 2:
                    System.out.print("Enter a String: ");
                    String str2 = sc.nextLine();
                    String reversed = new StringBuilder(str2).reverse().toString();
                    System.out.println("Reversed String: " + reversed);
                    break;

                case 3:
                    System.out.print("Enter first String: ");
                    String s1 = sc.nextLine();
                    System.out.print("Enter second String: ");
                    String s2 = sc.nextLine();
                    int diff = s1.compareTo(s2);
                    System.out.println("Difference between ASCII values: " + diff);
                    break;

                case 4:
                    System.out.print("Enter first String: ");
                    String base = sc.nextLine();
                    System.out.print("Enter String to insert: ");
                    String insert = sc.nextLine();
                    System.out.println("After insertion: " + base + " " + insert);
                    break;

                case 5:
                    System.out.print("Enter a String: ");
                    String str5 = sc.nextLine();
                    System.out.println("Uppercase: " + str5.toUpperCase());
                    System.out.println("Lowercase: " + str5.toLowerCase());
                    break;

                case 6:
                    System.out.print("Enter a String: ");
                    String str6 = sc.nextLine();
                    System.out.print("Enter a character: ");
                    char ch = sc.next().charAt(0);

                    int position = str6.indexOf(ch);

                    if (position != -1)
                        System.out.println("Position of entered character: " + position);
                    else
                        System.out.println("Entered character is not present");
                    break;

                case 7:
                    System.out.print("Enter a String: ");
                    String pal = sc.nextLine();
                    String rev = new StringBuilder(pal).reverse().toString();

                    if (pal.equalsIgnoreCase(rev))
                        System.out.println("Entered string is palindrome");
                    else
                        System.out.println("Entered string is not a palindrome");
                    break;

                case 8:
                    System.out.print("Enter a String: ");
                    String sentence = sc.nextLine();

                    String[] words = sentence.trim().split("\\s+");
                    int wordCount = words.length;

                    int vowels = 0, consonants = 0;
                    sentence = sentence.toLowerCase();

                    for (int i = 0; i < sentence.length(); i++) {
                        char c = sentence.charAt(i);

                        if (c >= 'a' && c <= 'z') {
                            if ("aeiou".indexOf(c) != -1)
                                vowels++;
                            else
                                consonants++;
                        }
                    }

                    System.out.println("No. of words: " + wordCount);
                    System.out.println("No. of vowels: " + vowels);
                    System.out.println("No. of consonants: " + consonants);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 9);

        sc.close();
    }
}