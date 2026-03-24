package LAB14;


import java.util.Scanner;

class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }
    @Override
    public void resize(int percent) {
        Scanner sc = new Scanner(System.in);

        while (percent < -100 || percent > 100) {
            System.out.print("Value entered is invalid, Please re-enter a value between -100 to +100: ");
            percent = sc.nextInt();
        }

        radius = radius + (radius * percent / 100.0);
    }

}