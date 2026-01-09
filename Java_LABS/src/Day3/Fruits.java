package Day3;
class Apple {
    void show() {
        System.out.println("This is Apple class show()");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show()");
    }
}


class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show()");
    }
}


public class Fruits {
    public static void main(String[] args) {

        Apple ref;


        ref = new Apple();
        ref.show();
        ref = new Banana();
        ref.show();

        ref = new Cherry();
        ref.show();
    }
}