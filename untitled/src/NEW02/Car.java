package NEW02;

public class Car extends Vehicle {
    public static void printTopSpeed() {  // Hides the parent method
        System.out.println("Top speed of Car is 300");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.printTopSpeed();

    }
}

