package OOP;

public class Phone {
    String name;
    String color;
    int ram;

    public void call(){
        System.out.print("Take Call from : " + name);
    }

    public void internet(){
        System.out.print("brows Internet");
    }

    public static void main( String[] args){
        //Creating Object

        Phone phone1=new Phone();

        phone1.name="Samsung";
        phone1.color="Black";
        phone1.call();


        phone1.internet();

        Phone phone2=new Phone();
        phone2.name="Apple";
        phone2.color="Roce Gold";
        phone2.call();
        phone2.internet();
    }


}
