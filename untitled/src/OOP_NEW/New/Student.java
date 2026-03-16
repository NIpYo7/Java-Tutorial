package OOP_NEW.New;

public class Student {
    String name;
    int id;

    // Method to initialize
    public void insertRecord(String s, int i) {
        name = s;
        id = i;
    }

    public void displayInformation() {
        System.out.println("Student name: " + name + ", Student id: " + id);
    }
}
