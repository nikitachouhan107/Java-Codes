package Polymorphism.P3;

class Student {
    void info(String name) {
        System.out.println("Name: " + name);
    }

    void info(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
