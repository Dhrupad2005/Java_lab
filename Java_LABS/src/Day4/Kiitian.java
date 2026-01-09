package Day4;

abstract class Student {
    int rollno;
    long regno;

    void getinput(int r, long reg) {
        rollno = r;
        regno = reg;
    }

    abstract void course();
}

class Kiit extends Student {

    @Override
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}

public class Kiitian{
    public static void main(String[] args) {
        Kiit k = new Kiit();
        k.getinput(2205180, 1234567890L);
        k.display();
    }
}

