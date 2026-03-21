package LAB;
import java.awt.*;
import java.util.Scanner;
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Sphere sphere=new Sphere();
        Cone cone=new Cone();
        MyShape myShape=new MyShape();

        int choice;

        while(true){
            displayMenu();
            System.out.println("Enter your Choice");
            choice=scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thank You");

            }
            switch (choice) {
                case 1:
                    System.out.println("Enter Radius");
                    double radius=scanner.nextDouble();
                    System.out.println("Volume :"+sphere.getSphereVolume(radius));
                    break;
                case 2:
                    System.out.println("Enter Radius");
                    double radius2=scanner.nextDouble();
                    System.out.println("Enter Height");
                    double height=scanner.nextDouble();
                    System.out.println("Volume :"+cone.getConeVolume(radius2,height));
                    break;
                case 3:
                    System.out.println("Enter Radius");
                    double radius3=scanner.nextDouble();
                    System.out.println("Volume :"+myShape.getMyShapeVolume(radius3));
                    break;
                default:
                    System.out.println("Invalid Choice");
            }


        }


    }


    public static void displayMenu(){
        System.out.println("==================================");
        System.out.println("1.Sphere");
        System.out.println("2.MyShape");
        System.out.println("3.MyShape");
        System.out.println("0.Exit");
        System.out.println("==================================");

    }

}
