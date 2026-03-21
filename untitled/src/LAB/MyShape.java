package LAB;

public class MyShape {
    public double getMyShapeVolume(double radius){
        double volume;
        volume=(5.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}
