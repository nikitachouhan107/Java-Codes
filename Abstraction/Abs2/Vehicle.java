package Abstraction.Abs2;

abstract class Vehicle {
    abstract void run();

    void fuel() {
        System.out.println("All vehicles need fuel");
    }
}
