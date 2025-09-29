package AbstractClass.Abstract20;

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    void showSalary() {
        System.out.println(name + "'s salary: $" + salary);
    }
}
