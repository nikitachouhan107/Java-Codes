package Polymorphism.P10;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Developer();
        Employee e2 = new Tester();
        e1.work();
        e2.work();
    }
}
