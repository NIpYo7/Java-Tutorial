package LAB14;

import java.util.Scanner;

class Circle implements GeometricObject{

    protected double radius;

    //Input radius
    public Circle(){
        Scanner input = new Scanner(System.in);

        radius = input.nextDouble();
        while (true){
            System.out.println("Enter radius in Circle");
            if (radius >= 0){
                break;
            }else{
                System.out.println("Invalid Input Enter Again");
            }
        }


    }
    public Circle(double radius){
        this.radius = radius;
    }
    public  void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }



}
