package lab4;

public class BankAccount {
    public static void main(String[] args) {
        Account obj=new Account(2034);
        obj.deposit(100);
        obj.withdraw(50);
        obj.print();
    }
}
