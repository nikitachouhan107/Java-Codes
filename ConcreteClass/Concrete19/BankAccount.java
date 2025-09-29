package ConcreteClass.Concrete19;

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit() {
        System.out.println("New Balance: " + balance);
    }
}