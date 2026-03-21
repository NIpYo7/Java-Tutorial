package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setNAme("Nipun");
        s1.setAge(23);

        System.out.println(s1.getNAme());
        System.out.println(s1.getAge());
    }
}
