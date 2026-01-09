package Practice;
import java.util.Scanner;
class Emp{
    int id;
    String name;
    public void printDetails(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
}
public class p6 {
    public static void main(String[] args) {
        System.out.println("Custom Class");
        Emp Dhrupad= new Emp();//New Employee Object
        //Setting Properties or attributes
        Dhrupad.id = 15;
        Dhrupad.name="Dp";
        Dhrupad.printDetails();
    }
}
