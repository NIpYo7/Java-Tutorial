package Inheritance.New_01;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Creating Car");
        Car c=new Car();
        c.start();
        c.drive();
        System.out.println(c.speed);
    }
}
