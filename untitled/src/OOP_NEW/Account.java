package OOP_NEW;

public class Account {
    int a, b;

    public void setData(int a, int b) {
        a = a;  // PROBLEM: Parameters are assigning to themselves!
        b = b;  // Instance variables 'a' and 'b' never get set
    }

    public void showData() {
        System.out.println("Value of A=" + a);
        System.out.println("Value of B=" + b);
    }

    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setData(2, 3);
        myAccount.showData(); // Output: Value of A=0, Value of B=0
    }
}
