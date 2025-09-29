package Polymorphism.P4;

class Bank{
    void info(String name){
        System.out.println("Account type: "+name);
    }
    void info(int number, int i){
        System.out.println("Balance: "+number);
    }
}
public class P4 {
    public static void main(String[] args){
        Bank b = new Bank();
        b.info("Saving account");
        b.info(10,000);
    }
}