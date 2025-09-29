package FinalClass.Final8;

final class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee: " + this.name + ", Salary: " + this.salary);
    }
}
