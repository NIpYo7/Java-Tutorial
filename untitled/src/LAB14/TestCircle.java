package LAB14;

public class TestCircle {
    public static void main(String[] args) {
        // i. Circle object
        Circle c = new Circle(7.0);

        System.out.println("Circle:");
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());

        c.setRadius(14.0);
        System.out.println("\nAfter updating radius to 14:");
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());

        // ii. ResizableCircle
        ResizableCircle rc = new ResizableCircle(7.0);

        System.out.println("\nResizable Circle:");
        System.out.println("Perimeter: " + rc.getPerimeter());
        System.out.println("Area: " + rc.getArea());

        rc.resize(100);
        System.out.println("\nAfter +100% resize:");
        System.out.println("Radius: " + rc.getRadius());
        System.out.println("Perimeter: " + rc.getPerimeter());
        System.out.println("Area: " + rc.getArea());

        rc.setRadius(7.0);
        rc.resize(-100);
        System.out.println("\nAfter -100% resize:");
        System.out.println("Radius: " + rc.getRadius());
        System.out.println("Perimeter: " + rc.getPerimeter());
        System.out.println("Area: " + rc.getArea());


    }

}
