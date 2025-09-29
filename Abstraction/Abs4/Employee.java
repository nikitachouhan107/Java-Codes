package Abstraction.Abs4;

abstract class Employee {
    String name = "Employee";

    abstract void work();

    void display() {
        System.out.println("Name: " + name);
    }
}