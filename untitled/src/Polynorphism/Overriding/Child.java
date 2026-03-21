package Polynorphism.Overriding;

public class Child extends Parent {
    public void phone(){
        System.out.println("Nokia");
    }
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.phone();
    }

}
