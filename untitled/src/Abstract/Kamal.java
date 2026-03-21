package Abstract;

import java.sql.SQLOutput;

public class Kamal extends Nimal {
    void print() {
        System.out.println("Kamal");
    }
    public void run() {
        System.out.println("Runing");
    }

    public static void main(String[] args) {
        Kamal obj = new Kamal();
        obj.print();
        obj.eat();
        obj.run();
    }
}
