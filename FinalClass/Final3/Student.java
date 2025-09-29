package FinalClass.Final3;

final class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}
