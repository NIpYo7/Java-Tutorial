package LAB;

public class Cone {
    public double getConeVolume(double radius,double height) {
        double coneVolume;
        coneVolume =(1.0/3.0)*Math.PI*Math.pow(radius,2)*height;
        return coneVolume;
    }
}
