//Looping and Break and Continue

package Practice;
import java.sql.SQLOutput;
import java.util.Scanner;
/*
public class p5 {
    public static void main(String[] args) {
        int n=5;
        while(n<10){
            System.out.println(n);
            n++;
        }
    }
}
*/
/*
public class p5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter Value");
        i=sc.nextInt();
        do {
            System.out.println(i);
            i++;
        } while(i<10);
    }
}
*/
/*
public class p5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        for( i=1;i<=5;i++){
            System.out.println("This is for loop");
        }
    }
}
 */
//first n odd numbers
/*
public class p5{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Value");
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(2*i+1);
        }
    }
}
*/
/*
public class p5{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            System.out.println(i);
            if(i==3){
                System.out.println("Ending");
                break;
            }
            System.out.println("Java Is Great");
        }
    }
}
*/
/*
public class p5{
    public static void main(String [] args){
        int i=0;
        while(i<5){
            System.out.println(i);
            System.out.println("Hehe");
            if(i==3){
                break;
            }
            i++;
        }
        System.out.println("Loop Ends");
    }
}
 */
//public class p5 {
//    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println(i);
//            System.out.println("Looping");
//            if (i == 3) {
//                break;
//            }
//            i++;
//        }while (i < 5) ;
//
//    }
//}

public class p5{
    static void main(String[] args) {
        int i;
        for(i=0;i<5;i++){
            if(i==2){
                System.out.println("Ending the loop");
            }
            System.out.println(i);
            System.out.println("Java HEHE");
        }
    }
}