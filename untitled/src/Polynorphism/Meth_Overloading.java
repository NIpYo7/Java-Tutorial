package polynorphism;

public class Meth_Overloading {
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth1(int x){
        System.out.println("meth2");
    }
    public void meth1(int x,int y){
        System.out.println("meth3");
    }
    public void meth1(String x){
        System.out.println(x);
    }


    public static void main(String[] args) {
        Meth_Overloading obj = new Meth_Overloading();
        obj.meth1();
        obj.meth1(20);
        obj.meth1(20,30);
        obj.meth1("Yohana");


    }

}
