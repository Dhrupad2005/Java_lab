package Day8;

class SyncPrinter implements Runnable {
    private String threadName;
    private String[] words;

    public SyncPrinter(String threadName, String[] words) {
        this.threadName = threadName;
        this.words = words;
    }

    @Override
    public synchronized void run() {
        for (String word : words) {
            System.out.println(threadName + ": " + word);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class Q2{
    public static void main(String[] args) throws InterruptedException {
        String[] words = {"I", "Love", "java", "Very", "Much"};

        SyncPrinter printer = new SyncPrinter("", words); // shared object

        Thread t1 = new Thread(() -> {
            synchronized (printer) {
                for (String word : words) {
                    System.out.println("Thread 1: " + word);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (printer) {
                for (String word : words) {
                    System.out.println("Thread 2: " + word);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
