class Account {
    String name;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    void display() {
        System.out.println(name + " Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.name = "Alice";
        acc.deposit(1000);
        acc.withdraw(400);
        acc.display();
    }
}
