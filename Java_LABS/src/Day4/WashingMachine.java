package Day4;

// Interface definition
interface Motor
{
    int capacity = 5;

    void run();
    void consume();
}

// Class implementing the interface
public class WashingMachine implements Motor
{
    public void run()
    {
        System.out.println("Washing machine is running");
    }

    public void consume()
    {
        System.out.println("Motor is consuming power");
    }

    public static void main(String[] args)
    {
        WashingMachine wm = new WashingMachine();
        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}
