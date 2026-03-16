package OOP_NEW.New;

public class TestStudent {
    public static void main(String args[]) {
        Student stu1 = new Student();
        Student stu2 = new Student();

        stu1.insertRecord("Saman", 111);  // Initializing through method
        stu2.insertRecord("Amal", 222);   // Initializing through method

        stu1.displayInformation();
        stu2.displayInformation();
    }
}
