package Day8;

import java.util.Scanner;

class CounterThread extends Thread {
    private int lower;
    private int upper;

    public CounterThread(String name, int lower, int upper) {
        setName(name);
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + getName());
        System.out.print("Counter - ");
        for (int i = lower; i <= upper; i++) {
            System.out.print(i + "  ");
            try {
                Thread.sleep(5); // 5 milliseconds gap
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter thread name: ");
        String name = sc.next();

        System.out.print("Enter lower range of counter: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper range of counter: ");
        int upper = sc.nextInt();

        CounterThread t = new CounterThread(name, lower, upper);
        t.start();

        sc.close();
    }
}