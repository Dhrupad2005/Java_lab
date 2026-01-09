package Day2;

// Program to count number of objects using static variable
public class objectno
{
    static int count = 0;

    // Constructor
    objectno()
    {
        count++;
    }

    public static void main(String[] args)
    {
        // Creating objects
        objectno obj1 = new objectno();
        objectno obj2 = new objectno();
        objectno obj3 = new objectno();

        // Display number of objects created
        System.out.println("No of objects = " + count);
    }
}

