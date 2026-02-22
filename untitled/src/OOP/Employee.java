package OOP;

public class Employee {
    int id;
    String Name;

    public static void main(String[] args){
        //Creating object inside the same class
        Employee emp=new Employee();

        //Accessing member
        System.out.println(emp.id);
        System.out.println(emp.Name);
    }

}
