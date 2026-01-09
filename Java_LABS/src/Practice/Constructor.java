package Practice;
import java.util.Scanner;
class rec{
    double l;
    double b;

}
public class Constructor {

        static void substract(int a ,int b){
            System.out.println("REsult"+(a-b));
        }
        static void substract(double a,double b){
            System.out.println("REsult"+(a-b));
        }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a and b");
        substract(sc.nextInt(),sc.nextInt());
        System.out.println("Eneter a and b");
        substract(sc.nextDouble(),sc.nextDouble());
        sc.close();
        }


}
