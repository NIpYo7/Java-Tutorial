package LAB;

public class Sphere {
    public double  getSphereVolume(double radius){
        double volume;
        volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
        return volume;
    }
}
